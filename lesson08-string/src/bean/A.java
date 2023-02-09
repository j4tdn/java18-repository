package bean;

public class A {
	private int p;
	
	public A(int p) {
		this.p = p;
	}
	
	public int getP() {
		return p;
	}
	
	public void setP(int p) {
		this.p = p;
	}
	
	//a1.equals(a2)
	@Override
	public boolean equals(Object o) {
		// trùng địa chỉ
		if(this == o) {
			return true;
		}
		
		// khác địa chỉ
		if(!(o instanceof A)) {
			return false;
		}
		
		// o chắc chắn lúc runtime là A
		A ax = this;
		A ay = (A)o;
		
		// 2 đối tượng a1 và a2 là equals
		// nếu có giá trị của p bằng nhau
		return ax.p == ay.p;
	}
}
