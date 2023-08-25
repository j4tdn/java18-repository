package dao;

import static utils.DateUtils.toLDTime;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import connection.DbConnection;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{

	private static final String Q_GET_ITEMS_BY_GROUP_IDS = ""
			+ "SELECT *\n"
			+ "  FROM item it\n"
			+ "  JOIN item_group itg\n"
			+ "    ON it.ITEM_GROUP_ID = itg.ID\n"
			+ " WHERE itg.ID IN (%s)";
	
	private static final String Q_GET_ITEMS_BY_ORDER_DATE = ""
			+ "SELECT it.ID ITEM_ID,\n"
			+ "       it.NAME ITEM_NAME\n"
			+ "  FROM item it\n"
			+ " WHERE EXISTS (SELECT 43\n"
			+ "                 FROM item_detail itd\n"
			+ "                 JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID\n"
			+ "				    JOIN `order` od ON odd.ORDER_ID = od.ID\n"
			+ "				   WHERE it.ID = itd.ITEM_ID \n"
			+ "                  AND CAST(od.CREATED_AT AS DATE) = ?\n"
			+ "               )";
	
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
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt("itg.ID"), rs.getString("itg.NAME"));
				Item item = Item.of()
						.withId(rs.getInt("it.ID"))
						.withName(rs.getString("it.NAME"))
						.withColor(rs.getString("it.COLOR"))
						.withMeterial(rs.getString("it.MATERIAL"))
						.withImage1(rs.getString("it.IMAGE_01"))
						.withImage2(rs.getString("it.IMAGE_02"))
						.withLastUpdatedAt(toLDTime(rs.getTimestamp("it.LAST_UPDATED_AT")))
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
	
	@Override
	public List<Item> getItemsByOrderDate(LocalDate orderDate) {
		List<Item> result = new ArrayList<>();
		try {
			
			pst = connection.prepareStatement(Q_GET_ITEMS_BY_ORDER_DATE);
			pst.setDate(1, DateUtils.toSDate(orderDate));
			rs = pst.executeQuery();
			while (rs.next()) {
				result.add(
						Item.of()
							.withId(rs.getInt("ITEM_ID"))
							.withName(rs.getString("ITEM_NAME"))
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
}
