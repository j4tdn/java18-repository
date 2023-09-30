package service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService{
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public Item getItem(LocalDate createdAt) {
		Objects.requireNonNull(createdAt, "createdAt should not be null");
		return itemDao.getItem(createdAt);
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	

}
