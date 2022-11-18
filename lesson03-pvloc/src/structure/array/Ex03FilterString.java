package structure.array;

import java.util.Arrays;

public class Ex03FilterString {
      public static void main(String[] args) {
		String[] students = {"Peter Crou","Kaka","Valdes","Piter"};
		System.out.println(Arrays.toString(getStudents(students)));
	}
      private static String[] getStudents(String[] elements) {
    	  //Peter Crou,Piter, null, null
    	  String[] result = new String[elements.length];
    	  int count = 0;
    	  for(String element: elements) {
    		  if(element.startsWith("P")) {
    			  result[count] = element;
    			  count++;
    		  }
    	  }
    	  return Arrays.copyOfRange(result,0, count);
       }
}
