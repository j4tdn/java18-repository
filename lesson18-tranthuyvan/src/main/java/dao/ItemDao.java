package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {
	
	List<Item> getItemByDate(LocalDate localDate);
	
	List<String> getTopItems(int year);

}
