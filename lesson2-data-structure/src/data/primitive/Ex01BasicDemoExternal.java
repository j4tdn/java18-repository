package data.primitive;

public class Ex01BasicDemoExternal {
       public static void main(String[] args) {
		    //Truy cập được đến 'public'(thuộc tính(biến toàn cục), phương thức)Ex01BasicDemo
            System.out.println("price: ");
            //public static
            System.out.println(Ex01BasicDemo.price);
    	    System.out.println("price: "+ Ex01BasicDemo.price);
    	    //biến cục bộ là block scop dùng trong block đó thôi chẳng cần private public gì cả
    	    //biến toàn cục(thuộc tính) dùng trong class hiện tại và bên ngoài là chọn public và private
    	    //Ex01BasicDemo: class
    	    //o1 : biến thuộc KDL đối tượng Ex01BasicDemo
    	    //new Ex01BasicDemo(); giá trị ô nhớ mà o1 đang trỏ đến
    	    // public non-static
    	    
    	    Ex01BasicDemo o1 = new Ex01BasicDemo();
    	    System.out.println(o1.letter);
    	    
    	    
    	    
	}
}
