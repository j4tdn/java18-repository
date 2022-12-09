package inheritance.multiple.interfaces;

public class Boeing implements Plane,Transport{
	@Override
	public void transfer() {
		System.out.println("...transport");
	}

	@Override
	public void move() {
		System.out.println("...move");
	}
	
	@Override
	public void getMaxWeight() {
		System.out.println("...getMaxWeight --> 747");
	}
	
	public static void main(String[] args) {
		
	}


	
}
