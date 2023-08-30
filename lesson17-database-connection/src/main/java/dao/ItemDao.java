package dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import bean.Item;
import dto.ItemDto;

public interface ItemDao {
	
	List<Item> getItems(Set<Integer> itemGroupIds);
	
	List<Item> getItemsByOrderDate(LocalDate orderDate);
	
	List<ItemDto> getItemsByOrderDate1(LocalDate orderDate);
	
}