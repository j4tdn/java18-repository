	package service;

import java.util.List;
import java.util.Set;

import bean.ItemGroup;

public interface ItemGroupService {

	List<ItemGroup> getAll();
	
	List<ItemGroup> get(String igName);
	
	List<ItemGroup> getItemGroupById(Set<Integer> ids);
	
	ItemGroup get(int igId);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
	
	void saveOrUpdate(ItemGroup itemGroup);
}
