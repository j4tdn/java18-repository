package bean;

import java.util.List;

public class Store {
	private String storeId;
	private String referenceStoreId;
	private double  stockPreviousDay;
	private Double expectedSales;
	private boolean isSelected;
	
	public Store(String storeId, String referenceStoreId, double stockPreviousDay, Double expectedSales,
			boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getReferenceStoreId() {
		return referenceStoreId;
	}
	public void setReferenceStoreId(String referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}
	public double getStockPreviousDay() {
		return stockPreviousDay;
	}
	public void setStockPreviousDay(double stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}
	public Double getExpectedSales() {
		return expectedSales;
	}
	public void setExpectedSales(Double expectedSales) {
		this.expectedSales = expectedSales;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}
	public  static void toString(List<Store> stores) {

		System.out.printf("%10s |  %10s  | %10s |  %10s |  %10s\n","storeId","referenceStoreId", "stockPreviousDay","expectedSales","isSelected" );
		stores.forEach(e->System.out.printf("%10s |  %16s  | %16s |  %13s |  %10s\n", e.getStoreId(),e.getReferenceStoreId(),String.valueOf(e.getStockPreviousDay()),String.valueOf(e.getExpectedSales()),String.valueOf(e.isSelected())));
	}
	
	
	
}
