package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import dao.template.AbstractHibernateDao;
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

}
