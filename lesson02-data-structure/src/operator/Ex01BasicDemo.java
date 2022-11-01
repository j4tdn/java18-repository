package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		y -= ++x + --y + z++ - --x + x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
