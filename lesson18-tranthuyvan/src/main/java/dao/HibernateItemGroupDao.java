package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dao.template.AbstractHibernateDao;
import persistence.Item;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {
	
	private static final String Q_COUNT_ITEMS_BY_IG_IDS = ""
			+ "SELECT ig.ID " + ItemGroupDto.PROP_IG_ID + ", \n"
			+ "       ig.`NAME` " + ItemGroupDto.PROP_IG_NAME + ", \n"
			+ "       SUM(itd.AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + " \n"
			+ "	FROM item it  \n"
			+ "	JOIN item_group ig ON it.ITEM_GROUP_ID = ig.ID \n"
			+ "	JOIN item_detail itd ON it.ID = itd.ITEM_ID \n"
			+ "    WHERE ig.ID IN (:pIgIds) \n"
			+ "	GROUP BY ig.ID, ig.`NAME`"; 
	
	private static final String Q_GET_ALL_ITEMS_BY_IG = ""
			+ "SELECT *  \n"
			+ "  FROM item it \n"
			+ "  JOIN item_group ig  \n"
			+ "  ON it.ITEM_GROUP_ID = ig.ID";
	
	
	@SuppressWarnings("deprecation")
	public List<ItemGroupDto> countItemsByIgIds(Set<Integer> igIds) {
		NativeQuery<?> nativeQuery = openSesstion().createNativeQuery(Q_COUNT_ITEMS_BY_IG_IDS);
		nativeQuery.setParameter("pIgIds", igIds)
				   .addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				   .addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				   .addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, LongType.INSTANCE)
				   .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(nativeQuery);
	}
	
	@Override
	public List<Item> getItemsByItemGroup() {
		return openSesstion()
				.createNativeQuery(Q_GET_ALL_ITEMS_BY_IG, Item.class)
				.getResultList();
	}

}
