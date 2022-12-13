package book;

public class TextBook extends Book {
	 private static final String SGK0 = null;
	private static final String SGK1 = null;
	private String status, publisher, id;
		private double sales;
		public TextBook() {
			super();
		}
		public TextBook(String status, String id) {
	        super();
	        this.status = status;
	        this.id = id;
	    }
	 
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public double getSales() {
			return sales;
		}
		public void setSales(double sales) {
			this.sales = sales;
		}
		
		public void Book() {
	        super.Book();
	        System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
	        id = scanner.nextLine();
	    }
		public String toString() {
	        return super.toString() + ", tình trạng sách: " + this.status(id);
	    }
		private String status(String id2) {
			
			switch (id2) {
            case "SGK0":
                status = "cũ";
                break;
            case "SGK1":
                status = "mới";
                break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + id2);
			}
			return status;
		}

}
