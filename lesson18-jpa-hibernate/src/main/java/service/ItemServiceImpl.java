package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemdao;

	public ItemServiceImpl() {
		itemdao = new HibernateItemDao();
	}

	public List<Item> getAll() {
		return itemdao.getAll();
	}

	@Override
	public Item getItem(Integer itemId) {
		Objects.requireNonNull(itemId, "itemId should not be null");
		return itemdao.getItem(itemId);
	}

}
