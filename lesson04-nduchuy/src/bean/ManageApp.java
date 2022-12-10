package bean;

import java.sql.Date;

public class ManageApp {
	public static void main(String[] args) {
		Person president = new President("Alice",Date.valueOf("1996-05-11"),7d,3d);
		Person manager = new Manager("David",Date.valueOf("1993-12-05"),3d,2);
		Person staff1 = new Staff("Justin",Date.valueOf("2000-06-15"),1d,"Development");
		Person staff2 = new Staff("John",Date.valueOf("2000-02-28"),1d,"Development");
	    
		Person[] resources = {president,manager,staff1,staff2};
		information(resources);
		calSalary(resources);
	}
	
	public static void information(Person[] resources) {
		System.out.println("============Humen Resources Information==============");
		for (Person person : resources) {
			System.out.println(person);
		}
	}
	
	public static void calSalary(Person[] resources) {
		System.out.println("==================Salary=================");
		for (Person person : resources) {
			if(person instanceof President) {
				double salary = ((((President)person).getCoefficientJob()+person.getCoefficientSalary())*3000000);
				System.out.println("Name: "+person.getFullName()+" - Position: President"+" - Salary: "+salary);
			}else if (person instanceof Manager) {
				double salary = person.getCoefficientSalary()*2200000;
				System.out.println("Name: "+person.getFullName()+" - Position: Manager"+" - Salary: "+salary);
			}else if (person instanceof Staff) {
				double salary = person.getCoefficientSalary()*1250000;
				System.out.println("Name: "+person.getFullName()+" - Position: Staff"+" - Salary: "+salary);
			}
		}
	}
}

