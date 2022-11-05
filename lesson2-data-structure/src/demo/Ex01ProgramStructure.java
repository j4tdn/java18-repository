package demo;

public class Ex01ProgramStructure {
	//main: ctrl space
	//sysout: ctrl space
	//format code: ctrl shift f
	//Program(C/C++/JAVA)
	//+ data structure : luu tru du lieu
	//+ method/dunction:
	
	//Bai toan +2 so
	//du lieu: 2 so nguyen a va b
	// chuc nang: tinh tong(input: a va b -- output: tong cua a va b)
	// Run : chay 1 phat xong luon --> Ctrl F11
    public static void main(String[] args) {
		System.out.println("Welcome to class");
		int value = sum(5,10);
		System.out.println("Result "+ value);
	}
    
    //khai bao ham, chuc nang
    public static int sum(int a, int b) {
    	return a + b;
    }
}
