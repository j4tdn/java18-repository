package service;

import java.util.List;

import dto.ItemDto;
import persistence.Item;

public interface ItemService {
	List<ItemDto> getItemDetails();
	
	List<Item> getItem();
}
