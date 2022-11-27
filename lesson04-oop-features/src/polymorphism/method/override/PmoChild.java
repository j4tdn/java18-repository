package polymorphism.method.override;

// default extends Object
// class extends classB
// --> thua ke cac thuoc tinh, phuong thuc tu lop cha phu thuoc vao access modifier
// @override --> Anmotation --> interface
// --> ky hieu, dinh nghia(rang buoc) tai cho no khai bao

// Override 	
// 	+ 2|n phuong thuc duoc goi la override
//		. cac phuong thuc thuoc cac class co quan he thua ke
//		. ham trong class con dinh nghia lai(override) noi dung
//	+ thua ke duoc ca tt&pt
//	+ override duoc pt

public class PmoChild extends PmoParent {
	
	
	//@Override --> optional
	void log() {
		System.out.println("log --> child");
		
	}

}
