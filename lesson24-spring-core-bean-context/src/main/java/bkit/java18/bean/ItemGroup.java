package bkit.java18.bean;

import java.util.Objects;

/**
 * B1. Create POJO(plain old java object)
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(this instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup itemGroup = (ItemGroup)o;
		
		return itemGroup.getId() == getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
}
