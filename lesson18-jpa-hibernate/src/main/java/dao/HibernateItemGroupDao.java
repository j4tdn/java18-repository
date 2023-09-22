package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dao.template.AbstractHibernateDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {

	// native query with MySQL
	// NativeQuery<ItemGroup> nativeQuery = session.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class);
	// private static final String Q_GET_ALL_ITEM_GROUPS = "SELECT * FROM item_group";
	
	
	
	// JPQL (Java Persistence Query Language) / HQL (Hibernate Query Language)
	// ORM: Mapping table with Java Class
	// Query --> query using Java Class / Attribute Name --> JPA/Hibernate auto generate to 
	//           configure native sql language
	
	// private static final String Q_GET_ALL_ITEM_GROUPS = "FROM ItemGroup";
	
	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT ig.ID " + ItemGroupDto.PROP_IG_ID + ", \n"
			+ "         ig.`NAME` " + ItemGroupDto.PROP_IG_NAME + ", \n"
			+ "         GROUP_CONCAT(concat(it.`NAME`, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') " + ItemGroupDto.PROP_ITEM_LIST + ", \n"
			+ "         SUM(itd.AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + " \n"
			+ "	FROM item it  \n"
			+ "	JOIN item_group ig ON it.ITEM_GROUP_ID = ig.ID \n"
			+ "	JOIN item_detail itd ON it.ID = itd.ITEM_ID \n"
			+ "    WHERE ig.ID IN (:pIgIds) \n"
			+ "	GROUP BY ig.ID, ig.`NAME`;";
		
	public List<ItemGroup> getAll() {
		
		/* Sử dụng createNativeQuery(sql, entityClass) khi
		   + sql         --> return table đã được mapping với entity (class name) trong java
		   + entityClass --> entity đã được mapping với database table 
		   
		   Nếu câu sql trả về DTO hoặc Table chưa được mapping thì không được dùng hàm này
		 */
		
		Session session = openSesstion();
		
		// NativeQuery<ItemGroup> nativeQuery = session.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class);
		
		// Query<ItemGroup> query = session.createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class);
		
		Query<ItemGroup> query = session.createNamedQuery(ItemGroup.GET_ALL_ITEM_GROUPS, ItemGroup.class);
		
		return query.getResultList();
	}
	
	/*
	 * Muốn mapping được thì thuộc tính trong câu Query
	 */
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroupDetail(Set<Integer> igIds) {
		NativeQuery<?> nativeQuery = openSesstion().createNativeQuery(Q_GET_ITEM_GROUP_DETAILS);
		nativeQuery.setParameter("pIgIds", igIds)
				   .addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				   .addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				   .addScalar(ItemGroupDto.PROP_ITEM_LIST, StringType.INSTANCE)
				   .addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, LongType.INSTANCE)
				   .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(nativeQuery);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Session session = openSesstion();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(itemGroup);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
