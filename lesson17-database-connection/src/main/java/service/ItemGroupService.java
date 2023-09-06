package service;

import java.util.List;
import java.util.Set;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	List<ItemGroup> get(String name);
	
	List<ItemGroup> getItemsGroupByIds(Set<Integer> ids);
	
	List<ItemGroupDto> getItemGroupDetails();
	
	ItemGroup get(int igId);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
	
	void saveOrUpdate(ItemGroup itemGroup);

}
