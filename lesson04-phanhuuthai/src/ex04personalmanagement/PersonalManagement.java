package ex04personalmanagement;

public class PersonalManagement {
	public static void main(String[] args) {
		Director d1 = new Director("Erik Tenhag", "25-2-1975", 2.5, 1.0);
		
		Manager m1 = new Manager("Bruno Fernandes", "14-8-1993", 2.0, 10);
		
		Employee e1 = new Employee("Diogo Dalot", "14-7-2000", 1.5, "Phong 1");
		Employee e2 = new Employee("Luke Shaw", "13-2-1995", 1.5, "Phong 2");
		
		Personal[] personals = {d1, m1, e1, e2};
		
		Personal a = new Director();
		//a.getJobCoefficient();
		
		System.out.println("Thông tin nhân sự trong công ty");
		for(Personal personal : personals) {
			System.out.println(personal);
		}
		
		System.out.println("Lương các nhân sự trong công ty");
		
		for(Personal personal : personals) {
			if(personal instanceof Director) {
				double directorSalory = ((Director)personal).calSalary();
				System.out.println("Salary of Director " + personal.getName() + " : " + directorSalory);
			} else if(personal instanceof Manager) {
				double managerSalory = ((Manager)personal).calSalary();
				System.out.println("Salary of Manager " + personal.getName() + " : " + managerSalory);
			} else {
				double employeeSalory = ((Employee)personal).calSalary();
				System.out.println("Salary of Employee " + personal.getName() + " : " + employeeSalory);
			}
		}
	}
	
	
}
