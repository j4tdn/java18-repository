package inheritance.multiple.interfaces;

// interface Transport --> transfer();
// interface Plane --> move();

public class Boeing implements Transport, Plane {
	
	@Override
	public void move() {
		System.out.println("...");
	}

	@Override
	public void transfer() {
		System.out.println("...");
	}
	
	@Override
	public void getMaxWeight() {
		System.out.println("Max weight --> 747");	
	}
	
	public static void main(String[] args) {
		
		
	}

	

	
	

}
