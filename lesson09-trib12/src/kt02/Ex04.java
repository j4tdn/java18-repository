package kt02;

public class Ex04 {
	public static void main(String [] args){
		int [] arrays = new int[] {1,2,3,4};
		Ex04 p = new Ex04();
		p.getPermutation(arrays);
	}
	
	public void getPermutation(int [] array){
		printPermutation(array, 0, true);
	} 
	
	private void printPermutation(int [] array, int start, boolean display){
		if(display){
			System.out.println("");
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + ", ");
			}
		}
		
		for(int j = start; j < array.length; j++){
			int temp = array[start];
			array[start] = array[j];
			array[j] = temp;
			if(j == start){
				printPermutation(array, start+1, false);
			}else{
				printPermutation(array, start+1, true);
			}	 
			temp = array[start];
			array[start] = array[j];
			array[j] = temp;
		}
	}

}
