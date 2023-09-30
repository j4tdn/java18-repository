package persistence;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "MATERUAL")
	private String meterial;
	
	@Column(name = "IMAGE_01")
	private String image1;
	
	@Column(name = "IMAGE_02")
	private String image2;
	
	@Column(name = "LAST_UPDATED_AT")
	private LocalDateTime lastUpdateAt;
	
	
	private ItemGroup itemGroup;
	
	@OneToMany(mappedBy =  "item")
	private List<ItemDetail> itemDetails;
	
	public Item() {
	}

	public Item(Integer id, String name, String color, String meterial, String image1, String image2,
			LocalDateTime lastUpdateAt, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.meterial = meterial;
		this.image1 = image1;
		this.image2 = image2;
		this.lastUpdateAt = lastUpdateAt;
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

	public LocalDateTime getLastUpdateAt() {
		return lastUpdateAt;
	}

	public Item withLastUpdateAt(LocalDateTime lastUpdateAt) {
		this.lastUpdateAt = lastUpdateAt;
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
				+ image1 + ", image2=" + image2 + ", lastUpdateAt=" + lastUpdateAt + ", itemGroup=" + itemGroup + "]";
	}
}
