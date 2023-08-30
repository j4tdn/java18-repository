package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	ItemGroup get(int igId);
	
	List<ItemGroupDto> getItemGroupDetails();
	
	List<ItemGroup> get(String name);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
	
	// save = persist
	
	// saveOrUpdate = merge
	
}