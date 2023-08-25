package service;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupService {

	List<ItemGroup> getAll();
	
	ItemGroup get(int igId);
	
	List<ItemGroup> get(String igName);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
	
	void saveOrUpdate(ItemGroup itemGroup);
}
