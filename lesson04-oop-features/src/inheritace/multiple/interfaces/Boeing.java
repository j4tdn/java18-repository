package inheritace.multiple.interfaces;
//transport: transfer
//plane : move

public class Boeing implements Transport, Plane{
	@Override
	public void transfer() {
		
		System.out.println("....");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getMaxWeight() {
		System.out.println("747");
		
	}
	
	public static void main(String[] args) {
		
		
		
	}



}
