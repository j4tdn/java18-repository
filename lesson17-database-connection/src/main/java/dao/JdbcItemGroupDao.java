package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.ItemGroup;
import connection.DbConnection;
import dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	
	private static final int BATCH_SIZE = 1000;

	private static final String Q_GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM item_group";

	private static final String Q_GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT * \n"
			+ "  FROM item_group\n"
			+ " WHERE ID = ?";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * \n"
			+ "  FROM item_group\n"
			+ " WHERE NAME = ?";
	
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME) \n"
			+ "VALUES(?, ?)";
	
	private static final String Q_UPDATE_ITEM_GROUP = ""
			+ "UPDATE item_group \n"
			+ "   SET NAME = ?\n"
			+ " WHERE ID = ?";
	
	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT ig.ID GROUP_ID,\n"
			+ "       ig.NAME GROUP_NAME,\n"
			+ "       SUM(itd.AMOUNT) AMOUNT_OF_ITEMS,\n"
			+ "       GROUP_CONCAT(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) ITEM_LIST\n"
			+ "  FROM item it\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON it.ID = itd.ITEM_ID\n"
			+ "  JOIN ITEM_GROUP ig\n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID\n"
			+ "  GROUP BY ig.ID, ig.NAME;";
	
	// ? tham số trong câu lệnh SQL
	// --> theo thứ tự
	
	// biết được Java và Database đã kết nối thành công chưa
	private Connection connection;

	// Statement/PreparedStatement đối tượng của JDBC, chứa API(hàm) gọi/thực thi câu lệnh SQL bên trong database
	
	// statement
	//   st = connection.createStatement()
	//   st.executeQuery(sql) --> yêu cầu sql phải là 1 câu lệnh hoàn chỉnh, có thể chạy được trên database
	
	// preparedstatement
	//   pst = connection.preparedStatement(sql);
	//   pst.setInt(1, igId)
	//   pst.executeQuery();
	//   process sql injection
	
	private Statement st;
	private PreparedStatement pst;

	// đối tượng của JDBC chứa thông tin trả về khi thực hiện executeQuery
	// --> tập hợp các đối tượng, mỗi đối tượng là 1 dòng dữ liệu trả về từ database
	// table
	// --> tương tự iterator
	private ResultSet rs;

	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL_ITEM_GROUPS);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				ItemGroup ig = new ItemGroup(id, name);
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
	
	@Override
	public ItemGroup get(int igId) {
		ItemGroup result = null;
		
		try {
			pst = connection.prepareStatement(Q_GET_ITEM_GROUP_BY_ID);
			pst.setInt(1, igId);
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				result = new ItemGroup(id, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
	@Override
	public List<ItemGroup> get(String name) {
		List<ItemGroup> result = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(Q_GET_ITEM_GROUP_BY_NAME);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup itemGroup = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
				result.add(itemGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ITEM_GROUP_DETAILS);
			while (rs.next()) {
				Integer id = rs.getInt("GROUP_ID");
				String name = rs.getString("GROUP_NAME");
				Long amountOfItem = rs.getLong("AMOUNT_OF_ITEMS");
				String itemList = rs.getString("ITEM_LIST");
				ItemGroupDto igd = new ItemGroupDto(id, name, amountOfItem, itemList);
				result.add(igd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		
		return result;
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		try {
			pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			
			int affectedRows = pst.executeUpdate();
			System.out.println("LOG info >> " + affectedRows + " rows affected after save(ItemGroup)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void save(List<ItemGroup> itemGroups) {
		try {
			pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP);
			int batchCount = 0;
			for (ItemGroup itemGroup: itemGroups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				if (++batchCount % BATCH_SIZE == 0) {
					pst.executeBatch();
				}
			}
			int[] affectedRows = pst.executeBatch();
			System.out.println(
					"LOG info >> " 
					+ Arrays.toString(affectedRows) 
					+ " rows affected after save(List<ItemGroup>)");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		try {
			pst = connection.prepareStatement(Q_UPDATE_ITEM_GROUP);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			
			int affectedRows = pst.executeUpdate();
			System.out.println("LOG info >> " + affectedRows + " rows affected after update(ItemGroup)");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

}