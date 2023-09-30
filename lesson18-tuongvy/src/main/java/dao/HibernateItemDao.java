package dao;


import java.time.LocalDate;
import java.util.List;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao{
	private static final String GET_ITEM_BY_CREATED_AT = ""
			+ "SELECT 	it.ID,\n"
			+ "		it.`NAME`,\n"
			+ "        od.CREATED_AT\n"
			+ "  FROM 	item it\n"
			+ "  JOIN 	order_detail odd\n"
			+ "  ON 	it.ID = odd.ITEM_ID\n"
			+ "  JOIN 	`order` od\n"
			+ "  ON 	odd.ORDER_ID = od.ID\n"
			+ "  WHERE od.CREATED_AT = ':pcreateAt'\n"
			+ "  GROUP BY it.ID;";
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT * \n"
			+ "  FROM item it\n"
			+ "  JOIN item_group ig\n"
			+ "  ON it.ITEM_GROUP_ID = ig.ID\n"
			+ "  ORDER BY ig.ID;";
	
	@Override
	public Item getItem(LocalDate createdAt) {
		
		return openSession().get(Item.class, createdAt);
		
		
}

	@Override
	public List<Item> getAll() {
		
		return (List<Item>)openSession().createNativeQuery(GET_ALL_ITEMS,Item.class).getResultList();
	}
}
