package service;

import java.util.List;
import java.util.Map;

import bean.Item;
import bean.ItemGroup;

public interface ItemGroupService {

	List<ItemGroup> getAll();
	
	ItemGroup get(int igId);
	
	List<ItemGroup> get(String name);
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void update(ItemGroup itemGroup);
	
	void saveOrUpdate(ItemGroup itemGroup);
//	List<ItemGroup> getAll();
//	
//	ItemGroup get(int igId);
//	
//	void save(ItemGroup itemGroup);
//	
//	void save(List<ItemGroup> itemGroups);
//	void update(ItemGroup itemGroup);
//	void saveOrUpdate(ItemGroup itemGroup);
//	List<ItemGroup> get(String name);
//	
//	
//	List<Item> getItemsByItemGroupID(int itemgroupId);
//	Map<ItemGroup,List<Item>> getItemGroup_ItemByItemGroupID(int ItemGroupID);
//	List<Item> getItemsByDate(String date);
}
