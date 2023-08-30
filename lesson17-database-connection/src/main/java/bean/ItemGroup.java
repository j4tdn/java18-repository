package bean;

import java.util.Objects;

/**
 * Class holds information of item group
 * 
 * @author dacduc
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
	 public boolean equals(Object obj) {
	        if (obj instanceof ItemGroup) {
	        	ItemGroup another = (ItemGroup) obj;
	            if (this.id.equals(another.id)) {
	                return true;
	            }
	        }
	        return false;
	    }
	 @Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return Objects.hash(id,name);
		}
}
