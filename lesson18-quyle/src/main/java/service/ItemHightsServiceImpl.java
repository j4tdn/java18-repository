package service;

import java.util.List;

import dao.HibernateOrderDao;
import dao.OrderDao;
import dto.ItemHights;

public class ItemHightsServiceImpl implements ItemHightsService{
	
	private static OrderDao orderDao;
	
	public ItemHightsServiceImpl() {
		orderDao = new HibernateOrderDao();
	}
	
	public List<ItemHights> getItemHights() {
		return orderDao.getItemHights();
	}
}
