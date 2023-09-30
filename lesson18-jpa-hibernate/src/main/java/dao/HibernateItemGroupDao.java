package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import dao.template.AbstractHibernateDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends AbstractHibernateDao implements ItemGroupDao {
	// native query with MYSQL
		// NativeQuery<ItemGroup> nativeQuery = session.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class);
		// private static final String Q_GET_ALL_ITEM_GROUPS = "SELECT * FROM item_group";
		
		// JPQL(Java Persistence Query Language)/HQL(Hibernate Query Language)
		// ORM: Mapping Table with Java Class
		// Query --> query using Java Class / Attribute Name --> JPA/Hibernate auto generate to
		//           configured native sql language
		// Query<ItemGroup> query = session.createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class);
		// private static final String Q_GET_ALL_ITEM_GROUPS = "FROM ItemGroup";
	
		private static final String Q_GET_ITEM_GROUP_DETAILS = ""
				+ "SELECT ig.ID " + ItemGroupDto. + ",\n"
				+ "       ig.NAME " + ItemGroupDto. + ",\n"
				+ "       SUM(itd.AMOUNT) " + ItemGroupDto. + ",\n"
				+ "       GROUP_CONCAT(concat(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') ITEM_LIST\n"
				+ "  FROM item it\n"
				+ "  JOIN item_detail itd\n"
				+ "    ON it.ID = itd.ITEM_ID\n"
				+ "  JOIN ITEM_GROUP ig\n"
				+ "    ON it.ITEM_GROUP_ID = ig.ID\n"
				+ " WHERE ig.ID IN (:pIgIds)\n"
				+ " GROUP BY ig.ID, ig.NAME";
	
		public List<ItemGroup> getAll() {

			/*
			 * Sử dụng createNativeQuery(sql, entityClass) khi + sql --> return table đã
			 * được mapping với entity(class name) trong java + entityClass --> entity đã
			 * được mapping với database table
			 * 
			 * Nếu câu sql trả về DTO hoặc Table chưa được mapping thì ko được dùng hàm này
			 */

			Session session = openSession();

			Query<ItemGroup> query = session.createNamedQuery(ItemGroup.GET_ALL_ITEM_GROUPS, ItemGroup.class);

			return query.getResultList();
		}

		@Override
		public List<ItemGroupDto> getItemGroupDetail(Set<Integer> igIds) {
			return openSession()
					.createNativeQuery(Q_GET_ITEM_GROUP_DETAILS, ItemGroupDto.class)
					.setParameter(0, igIds)
		}
	}
