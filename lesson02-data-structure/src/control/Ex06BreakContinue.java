package control;

/**
 *Khi dang duyet vong lap thu i trong n vong lap. Neu gap
 *--> break --> thoat khoi for
 *--> continue --> thoat khoi vong lap hien tai( va nhay qua BT3)
 *			   --> ket thuc som vong lap hien tai  
 *
 */

public class Ex06BreakContinue {
	public static void main(String[] args) {
		
		int n = 10;
		
		for(int i= 1; i <= n; i++) {
			System.out.println("--> start body");
			if (i == 5) {
				continue;
			}
			System.out.println(i);
			System.out.println("end body <<<-----");
		}
	}

}
