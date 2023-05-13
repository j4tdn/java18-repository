package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03EmployeeDemo {
	public static void main(String[] args) {
		Map<Employee,List<Employee>> office = mockData();
		Employee m4 = new Employee(4,"M4",800d,1);
		Employee m41 = new Employee(41,"M41",400d,m4.getId());
		Employee m42 = new Employee(42,"M42",400d,m4.getId());
		office.put(m4, List.of(m41, m42));
		office.forEach((k,v)->{
			StringBuilder vNames = new StringBuilder();
			v.forEach(e-> {
				vNames.append(e.getName()+" ");
			});
			System.out.println(k+"--->"+vNames);
		});
	}
	private static Map<Employee,List<Employee>> mockData(){
		Employee m1 = new Employee(1,"M1",1000d,null);
		Employee m2 = new Employee(2,"M2",800d,m1.getId());
		Employee m3 = new Employee(3,"M3",800d,m2.getId());
		
		Employee e11 = new Employee(11,"E11",400d,m1.getId());
		Employee e12 = new Employee(12,"E12",400d,m1.getId());
		Employee e13 = new Employee(1,"E13",400d,m1.getId());

		Employee e21 = new Employee(21,"E21",400d,m2.getId());
		Employee e22 = new Employee(22,"E22",400d,m2.getId());
		
		Employee e31 = new Employee(31,"E31",400d,m3.getId());
		Employee e32 = new Employee(32,"E32",400d,m3.getId());
		 
		Map<Employee,List<Employee>> result = new LinkedHashMap<>();
		result.put(m1,List.of(e11, e12, e13));
		result.put(m2,List.of(e21, e22));
		result.put(m3,List.of(e31, e32));
		return result;
	}
}
