package inheritance;

public class Box extends Rectangle{
	public static void main(String[] args) {
		Box box = new Box();
		box.paint(); // Rectangle --> public
		box.clear();
	}
}