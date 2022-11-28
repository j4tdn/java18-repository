package encapsulation.companya;
/*
 attribute(method)       ->>>  name, skills, asignedProjects(dự án), salary(mức lương)
 access access modifier         ->>>  private, public, protected (thừa kế inheritance), __

// public  --> sử dụng mọi nơi (everywhere) trong và ngoài packet
// private --> dùng trong class hiện tại (curent class)
// no      --> không khai báo, được truy cập trong phạm vi package ttrong class hiện tai

class access modifier  --> public, __(không để gì hết)
public --> everywhere
no __  --> dùng trong package hiện tại (curent package)
*/
public class EmployeeA1 {
	public static String name;     // cho tất cả dùng, có thể chấm bất cứ ở đâu
	public static String[] skills; // {"C", "C++", "JAVA"}
	private static double salary;  // dùng trong package  hiện tại
	static String[] asignedProjects;

}
