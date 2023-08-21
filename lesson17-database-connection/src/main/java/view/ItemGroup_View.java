package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.SqlUtils;

public class ItemGroup_View {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		SqlUtils.generate(
				"Câu 1A: Liệt kê toàn bộ các loại hàng", 
				 itemGroupService.getAll()
		);
		
		SqlUtils.generate(
				"Câu 1B: Liệt kê loại hàng theo mã loại", 
				 itemGroupService.get(5)
		);
		
		// Khi thêm mới 1 entry đã tồn tại trong DB table
		// --> 1. Bắt lỗi
		// --> 2. Thực hiện cập nhật dữ liệu với điều kiện là PK
		
		SqlUtils.generate(
				"Câu 1C: Thêm mới/Cập nhật loại hàng", 
				 () -> itemGroupService.saveOrUpdate(ItemGroup.of()
						 .withId(10)
						 .withName("Loại Hàng 10"))
		);
		
		SqlUtils.generate(
				"Câu 1D: Thêm mới danh sách loại hàng", 
				 () -> itemGroupService.save(
						 List.of(
								 new ItemGroup(16, "Loại Hàng 16"),
								 new ItemGroup(17, "Loại Hàng 17"),
								 new ItemGroup(18, "Loại Hàng 18")
								 )
						 )
		);
		
		/*
		 * Nhược điểm của việc dùng statement trong trường hợp này 
		 * Tham số "name" khi tìm kiếm sẽ do người dùng nhập vào 
		 * + Nhập bình thường: áo, quần, mũ
		 * + Người biết technical: nhập theo kiểu SQL Injection (text để câu lệnh sql luôn đúng, luôn trả về data) để lấy cắp data
		 * SELECT *
		 * FROM item_group
		 * WHERE NAME = 'abc' OR '1=1';
		 * 
		 * => RECOMMEND: PreparedStatement
		 */
		
		SqlUtils.generate(
				"Câu 1E: Liệt kê loại hàng theo tên loại", 
				 itemGroupService.get("Áo")
		);
		
		
		
	}
}
