package view;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {

		Random random = new Random();
		int a = 10 + random.nextInt(11);
		int b = 10 + random.nextInt(11);
		int c = 10 + random.nextInt(11);
		int d = 10 + random.nextInt(11);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		long az = 1;
		for (int i = 1; i < a + 1; i++) {
			az *= i;
		}
		System.out.println(az);

		long bz = 1;
		for (int x = 1; x < b + 1; x++) {
			bz *= x;
		}
		System.out.println(bz);
		
		long cz = 1;
		for (int y = 1; y < c + 1; y++) {
			cz *= y;
		}
		System.out.println(cz);
		
		long dz = 1;
		for (int s = 1; s < d + 1; s++) {
			dz *= s;
		}
		System.out.println(dz);
		
		long S;
		S = az + bz + cz + dz;
		System.out.println("S= " + S);
	}
}
