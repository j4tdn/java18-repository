package excersises;


public class Ex02ItemApp {
	public static void main(String[] args) {
		
		// Item --> class --> KDL đối tượng
		// new Item --> Object
		
		/*double tongGiaTri;
		double salesPrice = 0;
		Item i1 = new Item();
		i1.setid(123);
		i1.setname("A");
		i1.setsalesPrice(11d);
		i1.setorigin("Vietnam");
		System.out.println("i1 ==> " + i1);
		
	
		
		Item i2 = new Item();
		i2.setid (345);
		i2.setname("B");
		i2.setsalesPrice(22d);
		i2.setorigin("China"); 
		
		System.out.println("i2 ==> " + i2);
		tongGiaTri = i1.getsalseprice() + i2.getsalseprice();
		System.out.println("Tong tien ==> " + tongGiaTri);*/
		
		Item i1 = new Item(002, "Pen", 2500, "Mỹ Tho");
		Item i2 = new Item(003, "Pencil", 3500,"Pháp");
		double t1 = totalOfsalesPrice(i1, i2);
		System.out.println("TT của item 1 và item 2: " + t1);
		
		Item i3 = new Item(002, "Pen", 2000, "Mỹ Tho");
		Item i4 = new Item(003, "Pencil", 7000, "Pháp");
		totalOfsalesPrice(i3, i4);
		double t2 = totalOfsalesPrice(i3, i4);
		System.out.println("TT của item 3 và item 4: " + t2);
	}

	private static double totalOfsalesPrice(Item i1, Item i2) {
		 return i1.getsalseprice() + i2.getsalseprice();
		
		
	}
}
