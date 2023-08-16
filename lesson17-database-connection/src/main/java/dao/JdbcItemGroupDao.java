package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import connection.DbConnection;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {

	private static final String Q_GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM item_group";

	private static final String Q_GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT * \n"
			+ "  FROM item_group\n"
			+ " WHERE ID = ?";
	
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME) \n"
			+ "VALUES(?, ?)";
	
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

}
