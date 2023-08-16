package dao;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	ItemGroup get(int igId);
	
	void save(ItemGroup itemGroup);
	
	// save = persist
	
	// saveOrUpdate = merge
	
}
