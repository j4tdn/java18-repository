package dto;

public class ItemDto {
	public static final String PROP_IT_ID = "itId";
	public static final String PROP_IT_NAME = "itName";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItem";
	
	private Integer itId;
	
	private String itName;
	
	private Integer amountOfItem;
	
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(Integer itId, String itName, Integer amountOfItem) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.amountOfItem = amountOfItem;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	

	public Integer getAmountOfItem() {
		return amountOfItem;
	}

	public void setAmountOfItem(Integer amountOfItem) {
		this.amountOfItem = amountOfItem;
	}

	@Override
	public String toString() {
		return "ItemDto [itId=" + itId + ", itName=" + itName + ", amountOfItem=" + amountOfItem + "]";
	}
	
	
}
