package Ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String s = "Welcome   to JAVA10 class";
		System.out.println("s --> " + s);
		s = s.strip();
	    s = s.replaceAll("\\s+", " ");
		System.out.println("s replaceAll --> " + s);
		
		String[] tokens = s.split(" ");
		
		for(String token: tokens) {
			char []stt = token.toCharArray();
			   for(int i =stt.length-1 ;i>=0;i--){
			    System.out.print(stt[i]);
			    
			    }
				
			}
		}
			   
	

	}
	
