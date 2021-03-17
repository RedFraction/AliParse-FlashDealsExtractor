package dev.xred.aliparse;

import java.io.*;
import java.util.List;

public class OfferParser {

	private static final String SEPARATOR = ";";

	public static void writeToCSV(List<Offer> offers, boolean drawHeader)
	{
		try
		{
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream("offers.csv"), "UTF-8"
					)
			);

			if ( drawHeader ) {
				StringBuffer l = new StringBuffer();
				l.append("Product id");
				l.append(SEPARATOR);
				l.append("Seller id");
				l.append(SEPARATOR);
				l.append("ORI min price");
				l.append(SEPARATOR);
				l.append("ORI max price");
				l.append(SEPARATOR);
				l.append("Promotion id ");
				l.append(SEPARATOR);
//				l.append("Start time");
//				l.append(CSV_SEPARATOR);
//				l.append("End time");
//				l.append(CSV_SEPARATOR);
//				l.append("Phase");
//				l.append(CSV_SEPARATOR);
				l.append("Product title");
				l.append(SEPARATOR);
				l.append("Min price");
				l.append(SEPARATOR);
				l.append("Max price");
				l.append(SEPARATOR);
				l.append("Discount");
				l.append(SEPARATOR);
				l.append("Stock");
				l.append(SEPARATOR);
				l.append("Total stock");
				l.append(SEPARATOR);
				l.append("Orders");
				l.append(SEPARATOR);
				l.append("Sold out");
				l.append(SEPARATOR);
				l.append("Product img url");
				l.append(SEPARATOR);
				l.append("Product detail url");
				l.append(SEPARATOR);
//				l.append("Trace");
//				l.append(CSV_SEPARATOR);
				l.append("Total TRANPO3");
				l.append(SEPARATOR);
				l.append("Product postive rate");
				l.append(SEPARATOR);
				l.append("Product average star");
				l.append(SEPARATOR);
				l.append("Item eval total num");
				l.append(SEPARATOR);
				l.append("GMT Create");
				l.append(SEPARATOR);

				bw.write(l.toString());
				bw.newLine();
			}

			for (Offer o : offers) {
				StringBuffer ln = new StringBuffer();
				ln.append(o.getProductId());
				ln.append(SEPARATOR);
				ln.append(o.getSellerId());
				ln.append(SEPARATOR);
				ln.append(o.getOriMinPrice());
				ln.append(SEPARATOR);
				ln.append(o.getOriMaxPrice());
				ln.append(SEPARATOR);
				ln.append(o.getPromotionId());
				ln.append(SEPARATOR);
//				ln.append(o.getStartTime());
//				ln.append(CSV_SEPARATOR);
//				ln.append(o.getEndTime());
//				ln.append(CSV_SEPARATOR);
//				ln.append(o.getPhase());
//				ln.append(CSV_SEPARATOR);
				ln.append(o.getProductTitle());
				ln.append(SEPARATOR);
				ln.append(o.getMinPrice());
				ln.append(SEPARATOR);
				ln.append(o.getMaxPrice());
				ln.append(SEPARATOR);
				ln.append(o.getDiscount());
				ln.append(SEPARATOR);
				ln.append(o.getStock());
				ln.append(SEPARATOR);
				ln.append(o.getTotalStock());
				ln.append(SEPARATOR);
				ln.append(o.getOrders());
				ln.append(SEPARATOR);
				ln.append(o.isSoldOut());
				ln.append(SEPARATOR);
				ln.append(o.getProductImage());
				ln.append(SEPARATOR);
				ln.append(o.getProductDetailUrl());
				ln.append(SEPARATOR);
//				ln.append(o.getTrace());
//				ln.append(CSV_SEPARATOR);
				ln.append(o.getTotalTranpro3());
				ln.append(SEPARATOR);
				ln.append(o.getProductPositiveRate());
				ln.append(SEPARATOR);
				ln.append(o.getProductAverageStar());
				ln.append(SEPARATOR);
				ln.append(o.getItemEvalTotalNum());
				ln.append(SEPARATOR);
				ln.append(o.getGmtCreate());
				ln.append(SEPARATOR);

				bw.write(ln.toString());
				bw.newLine();
			}

			bw.flush();
			bw.close();
		} catch (IOException e) { e.printStackTrace(); }
	}
}
