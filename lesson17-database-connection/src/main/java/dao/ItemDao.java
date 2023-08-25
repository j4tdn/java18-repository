package dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import bean.Item;

public interface ItemDao {
	
	List<Item> getItems(Set<Integer> itemGroupIds);
	
	List<Item> getItemsByOrderDate(LocalDate orderDate);
	
}
