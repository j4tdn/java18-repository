package inheritance.multiple.interfaces;

// interface Transport
//  void transport()

// interface Plane
//  void move()

public class Boeing implements Transport, Plane {

	public static void main(String[] args) {
		
	}
	
	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void getMaxWeight() {
		// TODO Auto-generated method stub
		System.out.println("MaxWeight --> 747");
	}
	
}
