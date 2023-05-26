package bean;

public class Store {
	private long storeId;
	private long referenceStoreId;
	private int stockPreviousDay;
	private int expectedSales;
	private boolean isSelected;

	public Store() {
	}

	public Store(long storeId, long referenceStoreId, int stockPreviousDay, int expectedSales, boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(long referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public int getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(int stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public int getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(int expectedSales) {
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
}