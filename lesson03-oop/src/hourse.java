import java.util.Scanner;

public class hourse {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("enter how many rows?: ");
		int row = Integer.parseInt(ip.nextLine());
		System.out.println("enter how many colums");
		int col = Integer.parseInt(ip.nextLine());
		int[][] arr2D = new int[row][col];
		// code enter parameter
		for(int i=0; i < row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("enter the parameter at localtion arr2D["+i+"]["+j+"]");
				arr2D[i][j] = Integer.parseInt(ip.nextLine());
			}
		}
		for(int i=0; i < row; i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr2D[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i< row;i++) {
			for(int j=0;j<col;j++) {
				int a=0;
				int	b=0;
				for(int x=0;x<row;x++) {
					if (arr2D[x][j]>arr2D[i][j]) {
						a=1;
					}
				}
				for(int y=0;y<col;y++) {
						if (arr2D[i][y]<arr2D[i][j]) {
							b=1;
						}
						
				}
				
				if(a+b==0) {
					System.out.println(arr2D[i][j]);
				}
				else {
					a=0;
					b=0;
				}
				
			}
				
				
		}
		
	}

}

