package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroupDetails();
	
	List<ItemGroup> get(String name);
	
	ItemGroup get(int igId);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
}