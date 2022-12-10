package inheritance.multiple.interfaces;

//interface Transport
// void transfer();
//interface Plane
//void move();
public class Boeing implements Transport , Plane{

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("...");

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
	}

	@Override
	public void getMaxWeight() {
		// TODO Auto-generated method stub
		System.out.println("Max weight ---> 747");
	}
}
