package exam;

public class Homework5App {
	public static void main(String[] args) {
		Homework5BookText SGK1= new Homework5BookText("SGK", 30, "Kim Đồng", true);
		Homework5BookText SGK2= new Homework5BookText("SGK", 110, "Nhi Đồng", false);
		Homework5BookText SGK3= new Homework5BookText("SGK", 40, "Kim Đồng", true);
		Homework5ReferenceBooks STK1= new Homework5ReferenceBooks("STK", 90, "Nhi Đồng", 5);
		Homework5ReferenceBooks STK2= new Homework5ReferenceBooks("STK", 120, "Kim Đồng", 7);
		Homework5Book[] books= {SGK1,SGK2,SGK3,STK1,STK2};
		System.out.println("------Sách có nhà xuất bản Nhi Đồng------ ");
		for(Homework5Book book:books) {
			if(book.getPublishingCompany()=="Nhi Đồng") {
				System.out.println(book);
			}
		}
		System.out.println("------Sách có đơn giá nhỏ hơn 50------");
		for(Homework5Book book:books) {
			if(book.getUnitPrice()<50) {
				System.out.println(book);
			}
		}
		for(Homework5Book book:books) {
			if(book.getUnitPrice()<200 & book.getUnitPrice()>100) {
				System.out.println(book);
			}
		}
		
	}
	
}
