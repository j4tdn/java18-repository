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
		if(this==o) {
			return true;
		}
		if(!(o instanceof A)) {
			return false;
		}
		//2 đối tượng a1 và a2 là equals
		//nếu có giá trị của p bằng nhau
		A ax = this;
		A ay =(A) o;
		return ax.p==ay.p;
	}
}
