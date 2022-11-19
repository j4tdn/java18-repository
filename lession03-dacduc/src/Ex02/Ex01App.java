package Ex02;

import java.time.LocalDate;

public class Ex01App {
	public static void main(String[] args) {
		Customer customer1 = new Customer("KH1", "01234567", "123568", "nguyen luong bang");
		Customer customer2 = new Customer("KH2", "01234567", "123568", "nguyen luong bang");
		Customer customer3 = new Customer("KH3", "01234567", "123568", "nguyen luong bang");

		Item item1 = new Item("Item1", "WIN", "Red", 200000);
		Item item2 = new Item("Item2", "WIN", "Blue", 600000);
		Item item3 = new Item("Item3", "WIN", "Green", 300000);
		Item item4 = new Item("Item4", "WIN", "Gray", 500000);

		Order order1 = new Order(customer1, new ItemDetail[] { new ItemDetail(item1, 3), new ItemDetail(item2, 2) },
				LocalDate.of(2022, 7, 5));
		Order order2 = new Order(customer2, new ItemDetail[] { new ItemDetail(item3, 3), new ItemDetail(item2, 2) },
				LocalDate.of(2022, 5, 5));
		Order order3 = new Order(customer3, new ItemDetail[] { new ItemDetail(item4, 3), new ItemDetail(item3, 2) },
				LocalDate.of(2022, 11, 4));

		System.out.println(order1.getOrderDate());
		System.out.println("Tong tien " + order1.getCustomer().getName() + " tra: " + order1.export());

		System.out.println(order2.getOrderDate());
		System.out.println("Tong tien " + order2.getCustomer().getName() + " tra: " + order2.export());

		System.out.println(order3.getOrderDate());
		System.out.println("Tong tien " + order3.getCustomer().getName() + " tra: " + order3.export());

	}

}
