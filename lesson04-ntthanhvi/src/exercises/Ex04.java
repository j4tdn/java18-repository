package exercises;

import bean.Director;
import bean.Manager;
import bean.People;
import bean.Staff;

public class Ex04 {
	public static void main(String[] args) {
		People e1 = new Director("Van A", 22, 4, 3);
		
		People e2 = new Manager("Thi B", 10, 3, 50);
		
		People e3 = new Staff("Thanh C", 15, 2,"HR" );
		
		People e4 = new Staff("Nguyen D", 15, 2,"HR" );
		
		People [] peoples = {e1, e2, e3, e4};
		
		for (People people: peoples) {
			if(people instanceof Director) {
				double salary = (((Director)people).getSalaryCoe() + ((Director)people).getJobCoe())*300000;
				System.out.println(people + ", " + " Salary: " + salary);
			} else if (people instanceof Manager) {
				double salary = people.getSalaryCoe()* 220000;
				System.out.println(people + "," + " Salary: " + salary);
			} else {
				double salary = people.getSalaryCoe()*125000;
				System.out.println(people + "," + " Salary: " + salary);
			}
		}
		
	}
	
}
