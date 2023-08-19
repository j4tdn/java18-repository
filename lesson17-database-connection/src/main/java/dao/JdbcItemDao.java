package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import connection.DbConnection;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{

	private static final String Q_GET_ITEMS_BY_GROUP_IDS = ""
			+ "SELECT *\n"
			+ "  FROM item it\n"
			+ "  JOIN item_group itg\n"
			+ "    ON it.ITEM_GROUP_ID = itg.ID\n"
			+ " WHERE itg.ID IN (%s)";
	
	private Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Item> getItems(Set<Integer> itemGroupIds) {
		List<Item> result = new ArrayList<>();
		
		String replacement = itemGroupIds.stream()
				.map(itemGroupId -> itemGroupId.toString())
				.collect(Collectors.joining(","));
		
		String sql = String.format(Q_GET_ITEMS_BY_GROUP_IDS, replacement);
		
		System.out.println("sql formated --> " + sql);
		
		// last_updated_at
		
		// java: local_date_time
		// sql : date_time
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				Timestamp lastUpdatedAtTs = rs.getTimestamp("it.LAST_UPDATED_AT");
				LocalDateTime lastUpdatedAt = lastUpdatedAtTs.toLocalDateTime();
				
				ItemGroup itemGroup = new ItemGroup(rs.getInt("itg.ID"), rs.getString("itg.NAME"));
				
				Item item = Item.of()
						.withId(rs.getInt("it.ID"))
						.withName(rs.getString("it.NAME"))
						.withColor(rs.getString("it.COLOR"))
						.withMeterial(rs.getString("it.MATERIAL"))
						.withImage1(rs.getString("it.IMAGE_01"))
						.withImage2(rs.getString("it.IMAGE_02"))
						.withLastUpdatedAt(lastUpdatedAt)
						.withItemGroup(itemGroup);
				
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
}
