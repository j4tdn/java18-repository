package inheritance.interfaces.fromjava08;

public class Java08Demo {
     public static void main(String[] args) {
		// cách 1: tạo 1 lớp thực thi
    	// Demo --> even number condition
    	 Condition c1 = new EvenBumberCondition();
    	 System.out.println("c1 --> "+ c1.test(12));
    	 //cách 2: sử dụng anonymous class
    	 //Demo --> odd number condition
    	 Condition c2 = new Condition() {
    		 @Override
    		public boolean test(int a) {
    			return a % 2 != 0;
    		}
    	 };
    	 System.out.println("c2 --> " +c2.test(12));
    	 /* cách 3: sử dugj anonymous function - lamdba expression
    	  Demo --> power of 3
    	  Demo --> power of 4
    	  anonymous function --> đoạn code override lại
    	  hàm trừu tượng trong functional interface
    	  (danh sách tham số ) -> {
    	     // đoạn code override
    	 */}
          
          Condition c3 = (int digit) -> {
        	  return digit % 3 == 0;
          };
          sysout
          
          /**
           * ngắn gọn
           * 1 --> ko cần khai báo KDL của tham số
           * 2 --> khi số lượng tham số = 1 --> bỏ ngoặc ()
             3 --> khi body chỉ có 1 dòng
                  --> bỏ luôn {}
                  nếu có return -> bỏ luôn return, tự hiểu
                  không có return --> code bình thường
           */


       
     
    	 
	}

