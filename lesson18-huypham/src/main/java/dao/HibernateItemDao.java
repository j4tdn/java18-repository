package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dao.template.AbstractHibernateDao;
import dto.ItemDto;
import dto.ItemGroupDto;
import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	private static final String Q_GET_ITEM_DETAILS = ""
			+ "SELECT it.ID " + ItemDto.PROP_IT_ID + ", "
			+ "it.NAME " + ItemDto.PROP_IT_NAME + ", "
			+ "SUM(ordd.AMOUNT) " + ItemDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "FROM item it\n"
			+ "	JOIN  item_detail itd\n"
			+ "	ON itd.ITEM_ID = it.ID\n"
			+ "    JOIN order_detail ordd\n"
			+ "    ON ordd.ITEM_DETAIL_ID = itd.ID\n"
			+ "GROUP BY itd.ITEM_ID\n"
			+ "ORDER BY " + ItemDto.PROP_AMOUNT_OF_ITEMS + " DESC\n";
	
	private static final String GET_ITEMS = ""
			+ "SELECT *\n"
			+ "  FROM item it\n"
			+ "  JOIN item_group ig\n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID\n"
			+ "  ORDER BY it.ITEM_GROUP_ID";
	
	@Override
	public List<ItemDto> getItemDetails() {
		@SuppressWarnings("deprecation")
		NativeQuery<?> query = openSession()
				.createNativeQuery(Q_GET_ITEM_DETAILS);
		query.addScalar(ItemDto.PROP_IT_ID, IntegerType.INSTANCE)
			.addScalar(ItemDto.PROP_IT_NAME, StringType.INSTANCE)
			.addScalar(ItemDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		
		return (List<ItemDto>)query.getResultList();
	}
	
	@Override
	public List<Item> getItem() {
		return openSession()
				.createNativeQuery(GET_ITEMS, Item.class)
				.getResultList();
	}
	
}