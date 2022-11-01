package operator;

public class Ex01BasucDemo {
	public static void main(String[] args) {
		int x = 5;
		x-= 2 + 5;
		System.out.println("xxxxxxx ->>>>" + x);
		int y = 7;
		y = y + x;
		y += 2;
		System.out.println("x -->" + x);
		
		x = 5;
		y = 8;
		int z = 4;
		
		y -= ++x + --y + z++ - --z + x++ + y++;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

}
