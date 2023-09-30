package view;

import java.util.Set;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroup_View {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		System.out.println("2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng \n");
		System.out.println(itemGroupService.countItemsByIgIds(Set.of(1, 2, 3, 4)));
		
		System.out.println("======================================");
		
		System.out.println("4. Danh sách các mặt hàng của mỗi loại hàng \n");
		System.out.println(itemGroupService.getItemsByItemGroup());
		
		System.out.println("======================================");
		
		/* Câu 5: Viết câu lệnh SQL thực hiện yêu câu sau đây
		
		-- self-join
		SELECT e1.Id, e1.Name, e1.Salary
		FROM Employee AS e1
		JOIN Employee AS e2 ON e1.ManagerId = e2.Id
		WHERE e1.Salary > e2.Salary;
		
		 */
		
		
	}

}
