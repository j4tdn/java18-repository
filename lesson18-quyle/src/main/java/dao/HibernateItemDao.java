package dao;

import java.util.List;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT * FROM item";
	
	public List<Item> getAll() {
		return openSession()
				.createNativeQuery(GET_ALL_ITEMS, Item.class)
				.getResultList();
	}
}
