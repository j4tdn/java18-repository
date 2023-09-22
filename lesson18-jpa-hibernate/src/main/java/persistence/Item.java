package persistence;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {
	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "MATERIAL")
	private String material;

	@Column(name = "IMAGE_01")
	private String image1;

	@Column(name = "IMAGE_02")
	private String image2;

	@Column(name = "LAST_UPDATED_AT")
	private LocalDateTime lastUpdatedAt;
	
	/* Nếu không muốn mapping và lấy dữ liệu của  item_group
	 * C1. Xóa thuộc tính
	 * Giữ nguyên thuộc tính, skip mapping --> @Transient
	 */

	/* C3. Nếu muốn mapping và lấy dữ liệu của item_group
	 * mapping @ManyToOne, @OneToMany, @ManyToMany
	 * --> fetchType: eager, lazy
	 * + eager: dù không cần nhưng vẫn tự động lấy ra
	 * + lazy: cần mới lấy ra
	 *   VD: item.getItemGroup();
	 * 
	 * Daily use: LAZY
	 * 
	 * @JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	 * + name = "FK_COLUMN_NAME" --> khóa ngoại trong bảng con 
	 * + referencedColumnName
	 */
	// @ManyToOne(fetch = FetchType.EAGER) <-- default 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup itemGroup; // ManyToOne => HasA

	@OneToMany(mappedBy = "item")
	private List<ItemDetail> itemDetails;

	public Item() {
	}

	public Item(Integer id, String name, String color, String material, String image1, String image2,
			LocalDateTime lastUpdatedAt, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public Item withMaterial(String material) {
		this.material = material;
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
	
	public List<ItemDetail> getItemDetails() {
		return itemDetails;
	}
	
	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", material=" + material + ", image1="
				+ image1 + ", image2=" + image2 + ", lastUpdatedAt=" + lastUpdatedAt + ", itemGroup=" + itemGroup + "]";
	}
}
