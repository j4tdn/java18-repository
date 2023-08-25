package service;

import java.util.List;
import java.util.Set;

import bean.Item;

public interface ItemService {
	
	List<Item> getItems(Set<Integer> itemGroupIds);
}
