package bean;

import java.time.LocalDateTime;

public class Item {
	
	private Integer id;
	private String name;
	private String color;
	private String meterial;
	private String image1;
	private String image2;
	private LocalDateTime lastUpdatedAt;
	private ItemGroup itemGroup;
	
	public Item() {
	}

	public Item(Integer id, String name, String color, String meterial, String image1, String image2,
			LocalDateTime lastUpdatedAt, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.meterial = meterial;
		this.image1 = image1;
		this.image2 = image2;
		this.lastUpdatedAt = lastUpdatedAt;
		this.itemGroup = itemGroup;
	}
	
	public static Item of() {
		return new Item();
	}

	public Integer getId() {
		return id;
	}

	public Item withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Item withName(String name) {
		this.name = name;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Item withColor(String color) {
		this.color = color;
		return this;
	}

	public String getMeterial() {
		return meterial;
	}

	public Item withMeterial(String meterial) {
		this.meterial = meterial;
		return this;
	}

	public String getImage1() {
		return image1;
	}

	public Item withImage1(String image1) {
		this.image1 = image1;
		return this;
	}

	public String getImage2() {
		return image2;
	}

	public Item withImage2(String image2) {
		this.image2 = image2;
		return this;
	}

	public LocalDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public Item withLastUpdatedAt(LocalDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
		return this;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public Item withItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
		return this;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", meterial=" + meterial + ", image1="
				+ image1 + ", image2=" + image2 + ", lastUpdatedAt=" + lastUpdatedAt + ", itemGroup=" + itemGroup + "]";
	}
	
}
