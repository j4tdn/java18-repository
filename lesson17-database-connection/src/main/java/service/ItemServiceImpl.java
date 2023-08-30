package service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import bean.Item;
import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemDto;

public class ItemServiceImpl implements ItemService{
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}

	@Override
	public List<Item> getItems(Set<Integer> itemGroupIds) {
		if (itemGroupIds == null || itemGroupIds.isEmpty()) {
			return Collections.emptyList();
		}
		return itemDao.getItems(itemGroupIds);
	}
	
	@Override
	public List<Item> getItemsByOrderDate(LocalDate orderDate) {
		Objects.requireNonNull(orderDate, "orderDate should not be null");
		return itemDao.getItemsByOrderDate(orderDate);
	}
	
	@Override
	public List<ItemDto> getItemsByOrderDate1(LocalDate orderDate) {
		Objects.requireNonNull(orderDate, "orderDate should not be null");
		return itemDao.getItemsByOrderDate1(orderDate);
	}

}