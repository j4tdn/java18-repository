package dao;

import java.util.List;
import java.util.Set;

import persistence.Item;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	
	List<ItemGroupDto> countItemsByIgIds(Set<Integer> igIds);
	
	List<Item> getItemsByItemGroup();

}
