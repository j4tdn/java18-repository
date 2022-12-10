package inheritance.multiple.interfaces;

// interface Transport
//	 void transfer()

// interface Plane
//	 void move()
public class Boeing implements Plane, Transport {
	@Override
	public void transfer() {
		
	}

	@Override
	public void move() {
		
	}
	
	@Override
	public void getMaxWeight() {
		System.out.println("Max weight --> 747");
	}
	
	public static void main(String[] args) {
		
	}

}
