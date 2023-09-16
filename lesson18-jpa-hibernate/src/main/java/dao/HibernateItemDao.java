package dao;

import java.util.List;

import org.hibernate.type.IntegerType;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {

	private static String GET_ALL_ITEMS = "SELECT * FROM item";

	private static final String GET_ITEM_BY_ID = "" + "SELECT * FROM item WHERE ID = :pid";

	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(GET_ALL_ITEMS, Item.class).getResultList();
	}

	@Override
	public Item getItem(Integer itemId) {
		return openSession().createNativeQuery(GET_ITEM_BY_ID, Item.class)
				.setParameter("pid", itemId, IntegerType.INSTANCE).getSingleResult();
	}

}
