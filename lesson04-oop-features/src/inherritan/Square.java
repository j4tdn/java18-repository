package inherritan;

public class Square implements Shape{
	// kieu con ( class) ke thua (implements) kieu cha ( interface)
	// --> bat buoc phai override cac abstract methods ( ham trua tuong)
	// tu kieu cha
	@Override
	public void paint() {
		System.out.println("Square....");
	}
	@Override
	public void calSuperficiality() {
		System.out.println("Square....");
		
	}
}
