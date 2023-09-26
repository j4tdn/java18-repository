package dao;

import java.util.List;

import org.hibernate.type.IntegerType;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {

	private static final String GET_ALL_ITEMS = ""
			+ "SELECT * FROM item";
	
	private static final String GET_ITEM_BY_ID = ""
			+ "SELECT * FROM item WHERE ID = :pid";
	
	@Override
	public List<Item> getAll() {
		return openSession()
					.createNativeQuery(GET_ALL_ITEMS, Item.class)
					.getResultList();
	}
	
	// JDBC
	// pst.setInt(1, itemId)        --> setParameter('pid', itemId, IntegerType.INSTANCE)
	// pst.setString(2, itemName)   --> setParameter('pname', itemName, StringType.INSTANCE)
	
	// IntegerType.INSTANCE = StandardBasicTypes.INTEGER
	
	// With basic operations --> get(entityClass, entityId), save(entity), update(entity)
	// available in session
	
	@Override
	public Item getItem(Integer itemId) {
		// C1
		return openSession().get(Item.class, itemId);
		
		// C2
		/*
		var items = openSession().createNativeQuery(GET_ITEM_BY_ID, Item.class)
				.setParameter("pid", itemId, IntegerType.INSTANCE)
				.getResultList();
		
		return items.isEmpty() ? null : items.get(0);
		*/
	}
	
	

}