package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {
	
	Item getItem(LocalDate createdAt);
	
	List<Item> getAll();

}
