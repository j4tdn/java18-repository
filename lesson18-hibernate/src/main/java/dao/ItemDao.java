package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getAll();

	Item getItem(Integer itemId);

}