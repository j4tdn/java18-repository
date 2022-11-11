package homework;

import java.util.Random;


public class Bt10RandomInteger {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = 0,b=0,c=0,d=0,e=0;
		a=random(a);
		b=random(b);
		while(b==a) {
			b=random(b);
		}
		c=random(c);
		while(c==a||c==b) {
			c=random(c);
		}
		d=random(d);
		while(d==a||d==b||d==c) {
			d=random(d);
		}
		e=random(e);
		while(e==a||e==b||e==c||c==d) {
			e=random(e);
		}
		System.out.println(a + " " + b+ " " + c + " " + d + " " + e);
	}
	private static int random(int a) {
		Random Rd=new Random();
		return Rd.nextInt(11)+20;
	}
}
