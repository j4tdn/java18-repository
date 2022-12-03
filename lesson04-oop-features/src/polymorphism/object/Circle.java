package polymorphism.object;

public class Circle extends Shape{
    // this --> đối tương hiện tại
	// super --> đối tượng của lớp tra
	@Override
	void paint() {
		//super.paint();
		System.out.println("Circle --> paint");
	}
	@Override
	void calSuperficiality() {
    	System.out.println("Circle ---> calS...");
    }
     
}
