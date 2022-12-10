package human_resource_management;

import java.sql.Date;
/**
 * 
Bài 4: 		Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
			a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
			b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý
			c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
			Chương trình thực hiện các công việc sau đây.
			Nhập dữ liệu gồm 1 Giám đốc, 1 Trưởng phòng, 2 Nhân viên
			Hiển thị thông tin các nhân sự có trong công ty
			Tính và in ra mức lương của từng loại nhân sự , biết rằng :
			Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
			Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
			Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
 *
 */
public class HumanResourceManagement {

	public static void main(String[] args) {

		HumanResource director = new Director("Viet Tay", Date.valueOf("2002-09-07"), 10d, 3d);
		HumanResource headOfDepartment = new HeadOfDepartment("Tuan Kiet", Date.valueOf("2002-07-06"), 7d, 50);
		HumanResource employee1 = new Employee("Minh Tan", Date.valueOf("2002-12-05"), 5d, "PB01");
		HumanResource employee2 = new Employee("Cong Huy", Date.valueOf("2002-11-02"), 6d, "PB02");

		HumanResource[] humanResources = { director, headOfDepartment, employee1, employee2 };
		System.out.println("Các nhân sự có trong công ty:\n");
		for (HumanResource humanResource : humanResources) {
			System.out.println(humanResource);
		}
		System.out.println("\n================================\nMức lương của từng loại nhân sự:\n");
		for (HumanResource humanResource : humanResources) {
			if (humanResource instanceof Director) {
				System.out.println("Director: " + humanResource.calSalary() + " VNĐ");
			} else if (humanResource instanceof HeadOfDepartment) {
				System.out.println("HeadOfDepartment: " + humanResource.calSalary() + " VNĐ");
			} else {
				System.out.println("Employee " + humanResource.getName() + ": " + humanResource.calSalary() + " VNĐ");
			}
		}
	}

}
