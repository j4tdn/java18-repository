package dao;

import java.util.List;

import dto.ItemDto;
import persistence.Item;

public interface ItemDao {
	List<ItemDto> getItemDetails();
	
	List<Item> getItem();
}
