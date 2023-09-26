package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public Item getItem(Integer itemId) {
		Objects.requireNonNull(itemId, "itemId should not be null");
		return itemDao.getItem(itemId);
	}
	
}
