package test.compute;

public class StoreDto {
	private Integer storeId;
	private String storeDesc;
	private Integer whId;
	
	public StoreDto() {
	}

	public StoreDto(Integer storeId, String storeDesc, Integer whId) {
		this.storeId = storeId;
		this.storeDesc = storeDesc;
		this.whId = whId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "StoreDto [storeId=" + storeId + ", storeDesc=" + storeDesc + ", whId=" + whId + "]";
	}

	public String getStoreDesc() {
		return storeDesc;
	}

	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}

	public Integer getWhId() {
		return whId;
	}

	public void setWhId(Integer whId) {
		this.whId = whId;
	}
	
	
}
