package dao;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	ItemGroup get(int igId);
	
	List<ItemGroup> get(String igName);
	
	void save(ItemGroup itemGroup);	
	
	void save(List<ItemGroup> itemGroup);	
	
	void update(ItemGroup itemGroup);
}
