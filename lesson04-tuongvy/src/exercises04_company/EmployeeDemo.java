package exercises04_company;

import java.sql.Date;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee director = new Director("Giam doc",Date.valueOf("2002-06-14"), 1.5f, 1.5f);
		Employee manager = new Manager("Truong phong",Date.valueOf("2002-06-14"), 1.5f, 3);
		Employee staff1 = new Staff("Nhan vien 1",Date.valueOf("2002-06-14"), 1.5f, "Phong1");
		Employee staff2 = new Staff("Nhan vien 2",Date.valueOf("2002-06-14"), 1.5f, "Phong2");
		
		Employee[] employees = {director, manager, staff1, staff2};
		
		for(Employee e : employees) {
			System.out.println(e +"," + e.calcSalary());
		}
	}
	

}
