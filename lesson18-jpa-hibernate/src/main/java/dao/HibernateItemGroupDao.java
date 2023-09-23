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
			+ "	GROUP BY ig.ID, ig.`NAME`";
	
	private static final String STORED_PROCEDURE_ADD_NEW_ITEM_GROUPS = ""
			+ "CALL addNewItemGroups(:pAmount)";
		
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
		executeWithTransaction(session -> {
			session.saveOrUpdate(itemGroup);
		});
	}
	
	@Override
	public void demoFirstLevelCache() {
		Session session1 = openSesstion();
		Session session2 = openSesstion();
		
		var ig1 = session1.get(ItemGroup.class, 5); // execute database query
		var ig2 = session1.get(ItemGroup.class, 6); // execute database query
		
		System.out.println("\n");
		
		System.out.println("session1.contains(ig1) --> " + session1.contains(ig1));
		System.out.println("session1.contains(ig2) --> " + session1.contains(ig2));
		
		System.out.println("\n");
		
		// test with #evict, #clear
		// session1.evict(ig2);
		session1.clear();
		
		var ig3 = session2.get(ItemGroup.class, 5); // execute database query (because of different session)
		var ig4 = session1.get(ItemGroup.class, 6); // using data from first level cache
		System.out.println("session2.contains(ig3) --> " + session2.contains(ig3));
		System.out.println("session1.contains(ig4) --> " + session1.contains(ig4));
		
		System.out.println("\n");
		
	}
	
	@Override
	public void demoSecondLevelCache() {
		Session session1 = openSesstion();
		Session session2 = openSesstion();

		var ig1 = session1.get(ItemGroup.class, 5);
		var ig2 = session1.get(ItemGroup.class, 6);
		
		System.out.println("ig1 --> " + ig1);
		System.out.println("ig2 --> " + ig2);

		// test with #evict, #clear
		// session1.evict(ig2);
		// session1.clear();

		var ig3 = session2.get(ItemGroup.class, 5); // using data from 2nd level cache
		var ig4 = session1.get(ItemGroup.class, 6); // using data from first level cache
		
		System.out.println("ig3 --> " + ig3);
		System.out.println("ig4 --> " + ig4);

		System.out.println("\n");

	}
	
	@Override
	public void addNewItemGroups(int newItemGroup) {
		executeWithTransaction(session -> {
			session.createNativeQuery(STORED_PROCEDURE_ADD_NEW_ITEM_GROUPS)
			.setParameter("pAmount", newItemGroup)
			.executeUpdate();
		});
	}

}
