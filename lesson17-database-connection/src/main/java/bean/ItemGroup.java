package bean;

/**
 * Class holds information of item group
 * @author vtttran
 */

public class ItemGroup {
	private Integer id;
	private String name;
	
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

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}
