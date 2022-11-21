package AppCar;

public class OutPut {
	public static void OutPut() {
		System.out.println("Tên chủ xe        Loại xe       Dung tích    Trị giá         Thuế phải nộp     ");
	}

	public static void OutPuta(UsingCar usingCar) {
		System.out.print(usingCar.getCustomer().getName());
		OutPut.Khoangtrangname(usingCar);
		System.out.print(usingCar.getCar().getNameCar());
		OutPut.Khoangtrangcar(usingCar);
		System.out.print(usingCar.getCar().getCc());
		OutPut.Khoangtrangcc(usingCar);
		System.out.print(usingCar.getCar().getCost());
		OutPut.Khoangtrangtrigia(usingCar);
		System.out.println(UsingCarFunsion.calculate(usingCar));

	}

	public static void Khoangtrangname(UsingCar usingCar) {
		int a = 18 - usingCar.getCustomer().getName().length();
		for (int i = 0; i < a; i++) {
			System.out.print(" ");
		}
	}

	public static void Khoangtrangcar(UsingCar usingCar) {
		int a = 14 - usingCar.getCar().getNameCar().length();
		for (int i = 0; i < a; i++) {
			System.out.print(" ");
		}
	}

	public static void Khoangtrangcc(UsingCar usingCar) {
		int b = usingCar.getCar().getCc();
		int c = 0;
		while (b / 10 == 0) {
			b = b / 10;
			c++;
		}
		int a = 10 - c;
		for (int i = 0; i < a; i++) {
			System.out.print(" ");
		}
	}

	public static void Khoangtrangtrigia(UsingCar usingCar) {
		int b =usingCar.getCar().getCost();
		int c=0;
		while(b/10==0) {
			b=b/10;
			c++;
		}
		int a=8-c;
		for ( int i=0;i<a;i++) {
			System.out.print(" ");
		}
	
	}
}
