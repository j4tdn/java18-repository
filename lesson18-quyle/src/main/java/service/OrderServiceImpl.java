package service;

import java.util.List;

import dao.HibernateOrderDao;
import dao.OrderDao;
import dto.ItemGroupDto;
import dto.OrderDto;

public class OrderServiceImpl implements OrderService {
	
	private static OrderDao orderDao;
	public OrderServiceImpl() {
		orderDao = new HibernateOrderDao();
	}
	
	
	public List<OrderDto> getAll(String date) {
		return orderDao.getAll(date);
	}
	
	public List<ItemGroupDto> getAllItemGroupDtos() {
		return orderDao.getAllItemGroupDtos();
	}
}
