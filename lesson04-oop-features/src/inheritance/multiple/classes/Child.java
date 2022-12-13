package inheritance.multiple.classes;

// class Father: codeGit
// class Mother: codeDatabase

// Phương thức trong CLASS cha 
// --> không bắt buộc override trong CLASS con

public class Child extends Father {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.codeFrontEnd();
	}
}
