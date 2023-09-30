package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	
	Item getItem(LocalDate createdAt);
	
	List<Item> getAll();

}
