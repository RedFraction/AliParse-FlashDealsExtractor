package dev.xred.aliparse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Offer {

	/*** Fields ***/
	@JsonProperty("productId")
	private long productId;
	@JsonProperty("sellerId")
	private long sellerId;
	@JsonProperty("oriMinPrice")
	private String oriMinPrice;
	@JsonProperty("oriMaxPrice")
	private String oriMaxPrice;
	@JsonProperty("promotionId")
	private long promotionId;
	@JsonProperty("startTime")
	private long startTime;
	@JsonProperty("endTime")
	private long endTime;
	@JsonProperty("phase")
	private int phase;
	@JsonProperty("productTitle")
	private String productTitle;
	@JsonProperty("minPrice")
	private String minPrice;
	@JsonProperty("maxPrice")
	private String maxPrice;
	@JsonProperty("discount")
	private int discount;
	@JsonProperty("stock")
	private int stock;
	@JsonProperty("totalStock")
	private int totalStock;
	@JsonProperty("orders")
	private int orders;
	@JsonProperty("soldout")
	private boolean soldOut;
	@JsonProperty("productImage")
	private String productImage;
	@JsonProperty("productDetailUrl")
	private String productDetailUrl;
	@JsonProperty("trace")
	private String trace;
	@JsonProperty("totalTranpro3")
	private String totalTranpro3;
	@JsonProperty("productPositiveRate")
	private String productPositiveRate;
	@JsonProperty("productAverageStar")
	private String productAverageStar;
	@JsonProperty("itemEvalTotalNum")
	private String itemEvalTotalNum;
	@JsonProperty("gmtCreate")
	private String gmtCreate;

	public Offer() { }

	/*** Getter and Setters ***/

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public String getOriMinPrice() {
		return oriMinPrice;
	}

	public void setOriMinPrice(String oriMinPrice) {
		this.oriMinPrice = oriMinPrice;
	}

	public String getOriMaxPrice() {
		return oriMaxPrice;
	}

	public void setOriMaxPrice(String oriMaxPrice) {
		this.oriMaxPrice = oriMaxPrice;
	}

	public long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(int totalStock) {
		this.totalStock = totalStock;
	}

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductDetailUrl() {
		return productDetailUrl;
	}

	public void setProductDetailUrl(String productDetailUrl) {
		this.productDetailUrl = productDetailUrl;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public String getTotalTranpro3() {
		return totalTranpro3;
	}

	public void setTotalTranpro3(String totalTranpro3) {
		this.totalTranpro3 = totalTranpro3;
	}

	public String getProductPositiveRate() {
		return productPositiveRate;
	}

	public void setProductPositiveRate(String productPositiveRate) {
		this.productPositiveRate = productPositiveRate;
	}

	public String getProductAverageStar() {
		return productAverageStar;
	}

	public void setProductAverageStar(String productAverageStar) {
		this.productAverageStar = productAverageStar;
	}

	public String getItemEvalTotalNum() {
		return itemEvalTotalNum;
	}

	public void setItemEvalTotalNum(String itemEvalTotalNum) {
		this.itemEvalTotalNum = itemEvalTotalNum;
	}

	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
}
