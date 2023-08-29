package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	List<ItemGroup> get(String name);
	
	List<ItemGroupDto> getItemGroupDetails();
	
	ItemGroup get(int igId);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
}