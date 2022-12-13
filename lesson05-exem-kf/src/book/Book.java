package book;

import java.util.Scanner;

public class Book {
	private String publisher, id;
	private double sales;
	private int amount;
	Scanner scanner = new Scanner(System.in);

	public Book() {
		super();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Book(String publisher, double sales, int amount, String id, Scanner scanner) {
		super();
		this.publisher = publisher;
		this.sales = sales;
		this.amount = amount;
		this.id = id;
		this.scanner = scanner;
	}
	public void Book() {
        System.out.print("Nhập mã sách: ");
        id = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        publisher = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        sales = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        amount = scanner.nextInt();
    }

	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", sales=" + sales + ", amount=" + amount + ", id=" + id + ", scanner="
				+ scanner + "]";
	}

}
