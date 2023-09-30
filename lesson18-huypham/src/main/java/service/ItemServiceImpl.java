package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.HibernateItemGroupDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dto.ItemDto;
import persistence.Item;

public class ItemServiceImpl implements ItemService{
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<ItemDto> getItemDetails() {
		return itemDao.getItemDetails();
	}
	@Override
	public List<Item> getItem() {
		return itemDao.getItem();
	}
}