package dev.xred.aliparse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Offer> offers = new ArrayList<>();

    public static void main(String[] args) {

        /***
         Results with 20 item per request:
            100  items = AVG ( ~ 2650 ms  );
            200  items = AVG ( ~ 4250 ms  );
            500  items = AVG ( ~ 9050 ms  );
            1000 items = AVG ( ~ 16800 ms );
         ***/

        // Set default sizes
        int limit = 100;
        int perRequest = 20;

        // Write table header
        boolean drawHeader = true;

        // Read arguments
        for(String a : args){
            if(a.contains("--offersLimit")) limit = Integer.parseInt(a.split("=")[1]);
            if(a.contains("--per-request")) perRequest = Integer.parseInt(a.split("=")[1]);
            if(a.contains("--wo-header")) drawHeader = false;
        }

        // Get instance of ali
        AliEndpoint ali = new AliEndpoint( perRequest );

        // Getting elements
        while(offers.size() < limit) {

            if( limit - offers.size() < 20 ) {
                ali.setLimit(limit - offers.size());
            }

            offers.addAll(ali.getNext());

        }

        // Convert POJO to JSON
        OfferParser.writeToCSV(offers, drawHeader);
    }

}
