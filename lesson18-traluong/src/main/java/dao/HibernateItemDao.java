package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao{
	
	private final String GET_ALL_ITEMS = "SELECT * FROM item";
	private final String GET_ITEMS_BY_ORDER_DATE = "SELECT odd.ORDER_ID,\r\n"
			+ "	   it.ID ITEM_ID,\r\n"
			+ "       it.`NAME` ITEM_NAME,\r\n"
			+ "       -- itd.SIZE_ID ITEM_SIZE_ID,\r\n"
			+ "       odd.AMOUNT,\r\n"
			+ "       od.CREATED_AT\r\n"
			+ "  FROM item it\r\n"
			+ "  JOIN item_detail itd ON it.ID = itd.ITEM_ID\r\n"
			+ "  JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID\r\n"
			+ "  JOIN `order` od ON odd.ORDER_ID = od.ID\r\n"
			+ " WHERE CAST(od.CREATED_AT AS DATE) LIKE :pDate";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(GET_ALL_ITEMS, Item.class).getResultList();
	}
	
	@Override
	public List<Item> getItemByOrderDate(LocalDate purchaseDate) {
		// TODO Auto-generated method stub
		Date date = Date.valueOf(purchaseDate);
		return openSession().createNativeQuery(GET_ITEMS_BY_ORDER_DATE, Item.class)
				.setParameter("pDate", date, DateType.INSTANCE)
				.getResultList();
	}

}
