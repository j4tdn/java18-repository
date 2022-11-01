package bean;

public class Sigle {
	public int value;
	public static void main(String[] args) {
		int a = 20;
		a = change(a);
		System.out.println("a =>" + a);
		Sigle s1 = new Sigle(25);
		modify(s1);
		System.out.println("s1 => " + s1);
	}
	private static int change(int input) {
		input = 99;
		return input;
	}
	public Sigle() {
		
	}
	public Sigle(int pValue) {
		this.value = pValue;
	}
	@Override
	public String toString() {
		return "" + this.value;
	}
	private static void modify(Sigle input) {
		input = new Sigle(50);
		input.value = 789;
	}

}
