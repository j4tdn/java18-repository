package polymorphism.method.override;

import org.w3c.dom.ls.LSOutput;

//default extends Object
//classA extends classB
//--> thừa kế các thuộc tính, phương thức từ lớp cha
//	  phụ thuộc vào object modifier

public class PmoChild extends PmoParent{
	
	@Override
	void log() {
		System.out.println("log --> child");
	}
}
