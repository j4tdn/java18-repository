package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dao.template.AbstractHibernateDao;
import dto.ItemGroupDto;
import dto.ItemHights;
import dto.OrderDto;

public class HibernateOrderDao extends AbstractHibernateDao implements OrderDao{
	private static final String Q_get1 = ""
			+ "SELECT it.ID id,\r\n"
			+ "	   	  it.NAME namee,\r\n"
			+ "       od.CREATED_AT created_at\r\n"
			+ "  FROM `order` od\r\n"
			+ "  JOIN order_detail odt\r\n"
			+ "    ON od.ID = odt.ORDER_ID\r\n"
			+ "  JOIN item it\r\n"
			+ "    ON it.ID = odt.ITEM_DETAIL_ID\r\n"
			+ "WHERE DATE(CREATED_AT) = ':pIgIds'";
	
	private static final String Q_get2 = ""
			+ "SELECT itg.ID id,\r\n"
			+ "	   itg.`NAME` namee,\r\n"
			+ "       SUM(itd.AMOUNT) amount_of_items\r\n"
			+ "  FROM item_detail itd\r\n"
			+ "  JOIN item_group itg\r\n"
			+ "    ON itd.ITEM_ID = itg.ID\r\n"
			+ "  GROUP BY itg.ID";
	
	private static final String Q_get3 = ""
			+ "SELECT it.ID id,\r\n"
			+ "       it.`name` namee,\r\n"
			+ "       SUM(itd.AMOUNT) amount\r\n"
			+ "  FROM item it\r\n"
			+ "  JOIN item_detail itd\r\n"
			+ "    ON it.ID = itd.ITEM_ID\r\n"
			+ "GROUP BY it.ID\r\n"
			+ "ORDER BY amount DESC \r\n"
			+ "LIMIT 3";
	
	public List<OrderDto> getAll(String date) {
		NativeQuery<?> query = openSession().createNativeQuery(Q_get1);
		
		query.setParameter("pIgIds", date)
		 .addScalar(OrderDto.idd, IntegerType.INSTANCE)
		 .addScalar(OrderDto.nameee, StringType.INSTANCE)
		 .addScalar(OrderDto.created_att, DateType.INSTANCE)
		 .setResultTransformer(Transformers.aliasToBean(OrderDto.class));
	
	return (List<OrderDto>)query.getResultList();
		
	}
	
	public List<ItemGroupDto> getAllItemGroupDtos() {
		NativeQuery<?> query = openSession().createNativeQuery(Q_get2);
		
		query.addScalar(ItemGroupDto.idd, IntegerType.INSTANCE)
		 	 .addScalar(ItemGroupDto.nameee, StringType.INSTANCE)
		 	 .addScalar(ItemGroupDto.amount_of_itemss, IntegerType.INSTANCE)
		 	 .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
	
	return (List<ItemGroupDto>)query.getResultList();
	}
	
	public List<ItemHights> getItemHights() {
		NativeQuery<?> query = openSession().createNativeQuery(Q_get1);
		query.addScalar(ItemHights.idd, IntegerType.INSTANCE)
	 	 .addScalar(ItemHights.nameee, StringType.INSTANCE)
	 	 .addScalar(ItemHights.amountt, IntegerType.INSTANCE)
	 	 .setResultTransformer(Transformers.aliasToBean(ItemHights.class));
		return (List<ItemHights>)query.getResultList();
	}
}
