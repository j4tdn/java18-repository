package service;

import java.util.Collections;
import java.util.List;
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

}
