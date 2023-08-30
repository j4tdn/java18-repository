package dao;

import java.util.List;
import java.util.Map;

import bean.Item;
import bean.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	ItemGroup get(int igId);
	List<ItemGroup> get(String name);
	
	void save(ItemGroup itemGroup);
	void save(List<ItemGroup> itemGroups);
	void update(ItemGroup itemGroup);
	
	
	
	
//	List<Item> getItemsByItemGroupID(int itemgroupId);
//	Map<ItemGroup,List<Item>> getItemGroup_ItemByItemGroupID(int ItemGroupID);
//	List<Item> getItemsByDate(String date);
}
