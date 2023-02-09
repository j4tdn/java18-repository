package immutable;

public class Ex01StringLiteralDemo {
	public static void main(String[] args) {
		// immultable (baat bien - khong the thay doi gia tri o heap
		// immutable --> dam bao 
		// Gia tri cua bien String literal se duoc
		// luu tru o HEAP --> constant pool
		
		// string litelral --> tiet kiem vung nho tao ra o HEAP
		
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "welcome";
		String s4 = "welcome";
		String s5 = "hello";
		
		s3 = "regard";
		
		hashAndValue("s1", s1);
		hashAndValue("s2", s2);
		hashAndValue("s3", s3);
		hashAndValue("s4", s4);
		hashAndValue("s5", s5);
		
		// string object: gia tri cua doi tuong thuoc string object
		// se duoc khoi tao thong qua tu khoa new
		// du gia tri o heap co trung/khac nhau --> deu tao o nho moi
		
		String o1 = new String("xinchao");
		String o2 = new String("xinchao");
		String o3 = new String("tambiet");
		String o4 = new String("tambiet");
		
		hashAndValue("o1", o1);
		hashAndValue("o2", o2);
		hashAndValue("o3", o3);
		hashAndValue("o4", o4);
	}
	private static final void hashAndValue(String varName, String var) {
		System.out.println(varName + ": " + System.identityHashCode(var) + " --> " + var);
	}

}
