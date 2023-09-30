package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	
	List<Item> getItemByDate(LocalDate localDate);
	
	List<String> getTopItems(int year);

}
