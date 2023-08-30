package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ItemGroup {
	private Integer id;
	private String name;
	private List<Item> items = new ArrayList<Item>();

	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof ItemGroup)) {
			return false;
		}

		ItemGroup that = (ItemGroup) o;
		return getId().equals(that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {

		String itemIds = items.stream().map(item -> item.getId().toString()).collect(Collectors.joining(","));

		return "ItemGroup \n" + "     [id=" + id + ",\n" + "      name=" + name + ",\n" + "      items = {" + itemIds
				+ "}]";
	}
}
