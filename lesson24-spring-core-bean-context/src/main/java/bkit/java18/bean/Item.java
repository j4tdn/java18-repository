package bkit.java18.bean;

import java.util.List;
import java.util.Objects;

public class Item {
	
	private Integer id;
	private String name;
	private Double salesPrice;
	private List<String> providers;
	private ItemGroup itemGroup;
	
	/**
	 * Constructor empty
	 */
	public Item() {
	}
	
	/**
	 * Constructor with full parameters
	 */
	public Item(Integer id, String name, Double salesPrice, List<String> providers, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.providers = providers;
		this.itemGroup = itemGroup;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public List<String> getProviders() {
		return providers;
	}

	public void setProviders(List<String> providers) {
		this.providers = providers;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(this instanceof Item)) {
			return false;
		}
		
		Item item = (Item)o;
		
		return item.getId() == getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", providers=" + providers
				+ ", itemGroup=" + itemGroup + "]";
	}
	
}
