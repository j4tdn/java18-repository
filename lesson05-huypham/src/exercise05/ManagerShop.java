package exercise05;

public class ManagerShop {
	public static void main(String[] args) {
		BookGK b1 = new BookGK(01, 100f, "Dac Duc", "New");
		BookGK b2 = new BookGK(02, 110f, "Van Thai", "New");
		BookGK b3 = new BookGK(03, 120f, "Viet Tay", "New");
		
		BookTK b4 = new BookTK(04, 110f, "Cong Huy1", 10f);
		BookTK b5 = new BookTK(05, 111f, "Cong Huy2", 15f);
		
		BookB[] books = {b1, b2, b3, b4, b5};
	}

}
