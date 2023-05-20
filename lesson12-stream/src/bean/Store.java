package bean;

import java.time.LocalDateTime;

public class Store {
	private int storeId;
	private int referenceStoreId;
	private LocalDateTime stockPreviousDay;
	private Double expectedSales;
	private boolean isSelected;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(int storeId, int referenceStoreId, LocalDateTime stockPreviousDay, Double expectedSales,
			boolean isSelected) {
		super();
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(int referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public LocalDateTime getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(LocalDateTime stockPreviousDay) {
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

}
