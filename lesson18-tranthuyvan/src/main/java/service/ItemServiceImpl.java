package service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;

	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<Item> getItemByDate(LocalDate localDate) {
		if (localDate == null) {
			return Collections.emptyList();
		}
		return itemDao.getItemByDate(localDate);
	}

	@Override
	public List<String> getTopItems(int year) {
		if (year < 1900 || year > 2100) {
			return Collections.emptyList();
		}
		return itemDao.getTopItems(year);
	}

}
