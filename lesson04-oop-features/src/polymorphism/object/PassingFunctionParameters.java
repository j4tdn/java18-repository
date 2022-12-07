package polymorphism.object;

public class PassingFunctionParameters {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Square sq = new Square();
		Shape sh = new Shape();
		
		print(r);
		print(sq);
		print(sh);
		
	}
	
	public static void print(Shape s) {
		System.out.println(s);
	}
}
