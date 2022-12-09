package polymorpgism.object;

public class Circle extends Shape{
	
	//This --> đối tượng hiện tại
	//Supper --> Dối tượng của lớp cha
	
	@Override
	void paint() {
		System.out.println("Circle --> paint");
	}
	
	@Override
	void calSuperficiality() {
		System.out.println("Circle ---> cals...");
	}
}
