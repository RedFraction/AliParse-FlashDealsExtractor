package dev.xred.aliparse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class AliEndpoint {

	// Ali API endpoint
	private final String API_ENDPOINT = "https://gpsfront.aliexpress.com/getRecommendingResults.do";

	// Params
	private long widget_id = 5547572;
	private int limit = 10;
	private int offset = 0;

	// Constructors
	public AliEndpoint(int limit){
		this.limit = limit;
	}
	public AliEndpoint(int limit, int offset){
		this.limit = limit;
		this.offset = offset;
	}
	public AliEndpoint(long widget_id,int limit, int offset){
		this.widget_id = widget_id;
		this.limit = limit;
		this.offset = offset;
	}

	/***
	 * Generate request url
	 * @return String url to new
	 */
	private String getUrl(){
		return
			new StringBuilder(API_ENDPOINT)
					.append("?widget_id=")
					.append(widget_id)
					.append("&limit=")
					.append(limit)
					.append("&offset=")
					.append(offset)
					.append("&postback=732db1c7-edf1-46d0-af03-64f78613fa78")
						.toString();
	}

	public List<Offer> getNext() {

		StringBuffer response = new StringBuffer();
		BufferedReader in;
		HttpURLConnection connection;

		ObjectMapper om = new ObjectMapper();

		JsonNode root = null;
		List<Offer> offers = null;

		try {

			URL obj = new URL(getUrl());
			connection = (HttpURLConnection) obj.openConnection();
			connection.setRequestMethod("GET");

			in = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			root = om.readTree(response.toString());
			offers = om.readValue(root.get("results").toString(), new TypeReference<List<Offer>>(){} );
		} catch (IOException e) {
			e.printStackTrace();
		}

		offset += offers.size();

		return offers;
	}

	/***
	 * Reset offset counter
	 */
	public void reset(){
		offset = 0;
	}

	/*** Getters / Setters ***/
	public long getWidgetId() {
		return widget_id;
	}

	public void setWidgetId(long widgetId) {
		this.widget_id = widgetId;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

}
