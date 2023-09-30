package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_group")
@NamedQueries(@NamedQuery(name = ItemGroup.GET_ALL_ITEM_GROUPS, query = "FROM ItemGroup") // JPQL
)
public class ItemGroup {
	public static final String GET_ALL_ITEM_GROUPS = "GET_ALL_ITEM_GROUPS";

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
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
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}
