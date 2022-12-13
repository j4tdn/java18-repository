package polymorphism.object;

public class Square extends Shape{
	@Override
	void paint() {
		// TODO Auto-generated method stub
//		super.paint();
		System.out.println("square --> paint");
	}
	
	@Override
	void calSuperficiality() {
		System.out.println("square -->  cals...");
	}

}
