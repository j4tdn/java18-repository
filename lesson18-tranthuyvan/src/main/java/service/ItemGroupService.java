package service;

import java.util.List;
import java.util.Set;

import persistence.Item;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	
	List<ItemGroupDto> countItemsByIgIds(Set<Integer> igIds);
	
	List<Item> getItemsByItemGroup();

}
