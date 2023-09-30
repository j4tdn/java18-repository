package dao;

import java.util.List;

import org.hibernate.type.IntegerType;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao{

	private static final String GET_ALL_ITEM = "SELECT * FROM item";

	private static final String GET_ITEM_BY_ID = ""
			+ "SELECT * FROM item WHERE ID = :pid";
	
	@Override
	public List<Item> getAll() {
		return openSession()
				.createNativeQuery(GET_ALL_ITEM, Item.class)
				.getResultList();
	}
	
	// With basic operations --> get(id)
	
	@Override
	public Item getItem(Integer itemId) {

		return openSession().get(Item.class, itemId);
		
//		var items = openSession().createNativeQuery(GET_ITEM_BY_ID, Item.class)
//		.setParameter("pid", itemId, IntegerType.INSTANCE)
//		.getResultList();
//		return items.isEmpty() ? null : items.get(0);
	}
}
