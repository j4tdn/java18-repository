package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.type.IntegerType;

import dao.template.AbstractHibernateDao;
import persistence.Item;
import persistence.ItemGroup;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao{
	private static final String GET_ALL_ITEMS = ""
			+"select * from item";
	private static final String GET_ITEM_BY_ID = ""
			+"Select * from item where id = :pid";
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(GET_ALL_ITEMS, Item.class).getResultList();
	}
	// JDBC
	// pst.setInt(1, itemId)        --> setParameter('pid', itemId, IntegerType.INSTANCE)
	// pst.setString(2, itemName)   --> setParameter('pname', itemName, StringType.INSTANCE)
		
	// IntegerType.INSTANCE = StandardBasicTypes.INTEGER
		
	// With basic operations --> get(entityClass, entityId), save(entity), update(entity)
	// available in session
	@Override
	public Item getItem(Integer itemId) {
		//c1
		//return openSession().get(Item.class, itemId);
		//c2
		var items = openSession().createNativeQuery(GET_ITEM_BY_ID, Item.class).setParameter("pid", itemId,IntegerType.INSTANCE).getResultList();
		return  items.isEmpty() ? null :items.get(0);
	}

}
