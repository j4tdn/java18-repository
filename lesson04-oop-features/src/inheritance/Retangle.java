package inheritance;

public class Retangle implements Shape {

	@Override
	public void paint() {
		System.out.println("Retangle ==> paint");
	}
	
	@Override
	public void calSuperFicaiality() {
		System.out.println("Retangle ==> Shape");
	}
	
	protected void clear() {
		System.out.println("retangle -> clear");
	}
	
}
