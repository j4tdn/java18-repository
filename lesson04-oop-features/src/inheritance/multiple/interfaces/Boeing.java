package inheritance.multiple.interfaces;

// interface Transport
// 	 void transfer()
// interface Plane
// 	 void move()
public class Boeing implements Transport, Plane{

	@Override
	public void transer() {
		System.out.println("...");
	}

	@Override
	public void move() {
		
	}

	@Override
	public void getMaxWeight() {
		System.out.println("757");
	}

}
