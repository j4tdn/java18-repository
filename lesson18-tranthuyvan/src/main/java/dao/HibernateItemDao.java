package dao;

import java.time.LocalDate;
import java.util.List;

import dao.template.AbstractHibernateDao;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	private static final String Q_GET_ITEMS_BY_ORDER_DATE = ""
			+ "SELECT DISTINCT od.CREATE_AT AS ORDER_DATE, \n"
			+ "                it.ID, \n"
			+ "                it.NAME, \n"
			+ "                CAST(od.CREATE_AT AS TIME) AS ORDER_TIME \n"
			+ "FROM item it \n"
			+ "JOIN item_detail itd ON it.ID = itd.ITEM_ID \n"
			+ "JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID \n"
			+ "JOIN `order` od ON odd.ORDER_ID = od.ID \n"
			+ "WHERE CAST(od.CREATE_AT AS DATE) = :pDate \n"
			+ "ORDER BY od.CREATE_AT DESC, it.ID ASC";
	
	private static final String Q_GET_TOP_ITEMS = ""
			+ "SELECT it.`NAME` AS ITEM_NAME \n"
			+ "	FROM ( \n"
			+ "	  SELECT it.ID AS ITEM_ID \n"
			+ "	  FROM item it \n"
			+ "	  JOIN item_detail itd ON it.ID = itd.ITEM_ID \n"
			+ "	  JOIN order_detail odd ON odd.ITEM_DETAIL_ID = itd.ID \n"
			+ "	  JOIN `order` od ON itd.ID = od.ID \n"
			+ "	  WHERE YEAR(od.CREATE_AT) = :pYear \n"
			+ "	  GROUP BY ITEM_ID \n"
			+ "	  ORDER BY SUM(itd.AMOUNT) DESC \n"
			+ "	  LIMIT 3 \n"
			+ "	) top_items \n"
			+ "	JOIN item it ON top_items.ITEM_ID = it.ID";
	
	
	public List<Item> getItemByDate(LocalDate localDate) {
		return openSesstion()
				.createNativeQuery(Q_GET_ITEMS_BY_ORDER_DATE, Item.class)
				.setParameter("pDate", localDate)
				.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getTopItems(int year) {
		return openSesstion()
				.createNativeQuery(Q_GET_TOP_ITEMS)
				.setParameter("pYear", year)
				.getResultList();
	}

}
