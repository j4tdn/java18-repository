package demo;

public class Ex05StaticDemo {
	/*
	 * static
	 * 	 + attribute
	 *     . static --> táº¥t cáº£ cÃ¡c Ä‘á»‘i tÆ°á»£ng mang má»™t giÃ¡ trá»‹ chung
	 *     . non    --> má»—i Ä‘á»‘i tÆ°á»£ng mang má»™t giÃ¡ trá»‹ riÃªng
	 * 
	 *   + method
	 *     . static --> hÃ m khÃ´ng phá»¥ thuá»™c vÃ o Ä‘á»‘i tÆ°á»£ng Ä‘ang gá»�i
	 *     . non    --> hÃ m phá»¥ thuá»™c vÃ o Ä‘á»‘i tÆ°á»£ng Ä‘ang gá»�i
	 *     
	 *  invoke
	 *   --> attribute, method
	 *       + static --> láº¥y class gá»�i trá»±c tiáº¿p
	 *       + non    --> khá»Ÿi táº¡o má»™t Ä‘á»‘i tÆ°á»£ng tá»« class rá»“i gá»�i    
	 */
	public static void main(String[] args) {
		Ex05StaticDemo.f1();
		Ex05StaticDemo e1 = new Ex05StaticDemo();
		e1.f4();
	}
	
	private static void f1() {
		// f2(); // khá»Ÿi táº¡o Ä‘á»‘i tÆ°á»£ng tá»« class hiá»‡n táº¡i má»›i gá»�i dc
	}

	private void f2() {
		f1();
	}

	private static void f3() {
		f3();
	}

	// e1.f4()
	private void f4() {
		f2();
	}
}
