package control;
/*
 * 
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
//		in ra nhung phan tu nho hon n
//		using while
		
		int n =12;
//		while(btdk)
//		{
//		BODY
//		b1:neu btdk --> true --> thu hien BODY(neu false --> thoat khoi while
//		b2: quay lai b1
//		}
		int i = 0;//bt 1
		while(i<n) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println("\n==================");
		i=0;
		while(true) {
			System.out.print(i+ " ");
			i++;
			if(i==n) {
				break;
			}
				
			
		}
		//System.out.print("\nfinish....");
	}
	

}
