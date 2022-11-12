package View;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(11) + 20;
		System.out.println("a : "+a);
		for (int i = 0; i <= 100; i++) {
			int b = rand.nextInt(11) + 20;
			int c = rand.nextInt(11) + 20;
			int d = rand.nextInt(11) + 20;
			int e = rand.nextInt(11) + 20;
			if(b==a) {
				continue;
			}
			if(c== a || c== b) {
				continue;
			}
			if(d==a || d==b || d==c) {
				continue;
			}
			if(e==a||e==b||e==c||e==d) {
				continue;
			}
			System.out.println("b : "+b);
			System.out.println("c : "+c);
			System.out.println("d : "+d);
			System.out.println("e : "+e);
			break;
		}

	}

}
