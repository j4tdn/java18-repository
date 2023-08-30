package bean;

import java.util.List;

public class ItemGroup {
	private Integer id;
	private String name;
	private List<Item> items;

	public static ItemGroup of() {
		return new ItemGroup();
	}

	public Integer getId() {
		return id;
	}

	public ItemGroup withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ItemGroup withName(String name) {
		this.name = name;
		return this;
	}
	
	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ItemGroup() {
	}
	
	public List<Item> getItems() {
		return items;
	}

	public ItemGroup withItems(List<Item> items) {
		this.items = items;
		return this;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}
