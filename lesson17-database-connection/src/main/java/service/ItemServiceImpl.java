package service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import bean.Item;
import dao.ItemDao;
import dao.JdbcItemDao;

public class ItemServiceImpl implements ItemService {
	
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
	public List<Item> getItemsByOrderDate(LocalDate orderdate) {
		Objects.requireNonNull(orderdate, "OrderDate should not be null");
		return itemDao.getItemsByOrderDate(orderdate);
	}

}
