package dao;

import java.util.List;

import org.hibernate.type.IntegerType;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	
	private static final String GET_ALL_ITEMS = "SELECT * FROM item";
	
	private static final String GET_ITEMS_BY_ID = ""
			+ "SELECT * FROM item WHERE ID = :pid";
	
	@Override
	public List<Item> getAll() {
		return openSesstion()
				.createNativeQuery(GET_ALL_ITEMS, Item.class)
				.getResultList();
	}
	
	// JDBC
	// pst.setInt(1, itemId)      --> setParameter((String name, Object val, Type type))
	// pst.setString(2, itemName) -->
	
	// With basic operations --> get(entityClass, id), save(entity), update(entity)
	// available in session
	
	@Override
	public Item getItem(Integer itemId) {
		// C1
		return openSesstion().get(Item.class, itemId);
		
		/* C2:
		var items = openSesstion()
				.createNativeQuery(GET_ITEMS_BY_ID, Item.class)
				.setParameter("pid",itemId, IntegerType.INSTANCE)
				.getResultList();
		
		return items.isEmpty() ? null : items.get(0);
		*/
	}

}
