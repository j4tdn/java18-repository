package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import connection.DbConnection;
import utils.SqlUtils;


public class JdbcItemDao implements ItemDao{
	
	private static final String Q_GET_ITEMS_BY_GROUP_IDS = ""
			+ "SELECT *\r\n"
			+ "  FROM item it \n"
			+ "  JOIN item_group itg \n"
			+ "    ON it.ITEM_GROUP_ID = itg.ID \n"
			+ " WHERE itg.ID IN (%s);";
			
	
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
		
		System.out.println("sql ->  " + sql);
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				Timestamp lastUpdateAts = rs.getTimestamp("LAST_UPDATED_AT");
				LocalDateTime lastUpdateAt = lastUpdateAts.toLocalDateTime();
				
				ItemGroup itemGroup = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
				
				Item item = Item.of()
						.withId(rs.getInt("ID"))
						.withName(rs.getString("NAME"))
						.withColor(rs.getString("COLOR"))
						.withMeterial(rs.getString("MATERUAL"))
						.withImage1(rs.getString("IMAGE_01"))
						.withImage2(rs.getString("IMAGE_02"))
						.withLastUpdateAt(lastUpdateAt)
						.withItemGroup(itemGroup);
				result.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(pst);
			SqlUtils.close(rs);
		}
		return result;
	}
}
