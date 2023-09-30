package dto;

import java.util.Objects;

public class ItemGroupDto {
	
	public static final String PROP_IG_ID = "igId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItem";
	
	private Integer igId;
	private String igName;
	private Long amountOfItem;

	public ItemGroupDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer igId, String igName, Long amountOfItem) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItem = amountOfItem;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Long getAmountOfItem() {
		return amountOfItem;
	}

	public void setAmountOfItem(Long amountOfItem) {
		this.amountOfItem = amountOfItem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIgId());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroupDto)) {
			return false;
		}

		ItemGroupDto that = (ItemGroupDto) o;
		return getIgId().equals(that.getIgId());
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", amountOfItem=" + amountOfItem + "]";
	}

}
