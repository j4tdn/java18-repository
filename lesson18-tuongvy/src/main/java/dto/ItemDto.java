package dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class ItemDto {
	
	public static final String PROP_IT_ID = "itId";
	public static final String PROP_IT_NAME = "itName";
	public static final String PROP_IT_COLOR = "itColor";
	public static final String PROP_IT_MATERIAL = "itMaterial";
	public static final String PROP_IT_IMAGE01 = "itImage01";
	public static final String PROP_IT_IMAGE02 = "itImage02";
	public static final String PROP_IT_LAST_UPDATE_AT = "itLastUpdate";
	public static final String PROP_IT_ITEM_GROUP_ID = "itItemGroupId";
	
	private Integer itId;
		
	private String itName;
	
	private String itColor;
	
	private String itMaterial;
	
	private String itImage01;
	
	private String itImage02;
	
	private LocalDateTime itLastUpdatedAt;
	
	public ItemDto() {
		
	}

	public ItemDto(Integer itId, String itName, String itColor, String itMaterial, String itImage01, String itImage02,
			LocalDateTime itLastUpdatedAt) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.itColor = itColor;
		this.itMaterial = itMaterial;
		this.itImage01 = itImage01;
		this.itImage02 = itImage02;
		this.itLastUpdatedAt = itLastUpdatedAt;
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

	public String getItColor() {
		return itColor;
	}

	public void setItColor(String itColor) {
		this.itColor = itColor;
	}

	public String getItMaterial() {
		return itMaterial;
	}

	public void setItMaterial(String itMaterial) {
		this.itMaterial = itMaterial;
	}

	public String getItImage01() {
		return itImage01;
	}

	public void setItImage01(String itImage01) {
		this.itImage01 = itImage01;
	}

	public String getItImage02() {
		return itImage02;
	}

	public void setItImage02(String itImage02) {
		this.itImage02 = itImage02;
	}

	public LocalDateTime getItLastUpdatedAt() {
		return itLastUpdatedAt;
	}

	public void setItLastUpdatedAt(LocalDateTime itLastUpdatedAt) {
		this.itLastUpdatedAt = itLastUpdatedAt;
	}

	@Override
	public String toString() {
		return "ItemDto [itId=" + itId + ", itName=" + itName + ", itColor=" + itColor + ", itMaterial=" + itMaterial
				+ ", itImage01=" + itImage01 + ", itImage02=" + itImage02 + ", itLastUpdatedAt=" + itLastUpdatedAt
				+ "]";
	}
	
	
	

}
