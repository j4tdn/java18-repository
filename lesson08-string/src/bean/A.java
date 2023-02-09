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
	
	@Override
	public boolean equals(Object o) {
		// trung dia chi
		if (this == o) {
			return true;
		}
		
		// khac dia chi
		if (!(o instanceof A)) {
			return false;
		}
		
		// o chac chan luc runtime
		A ax = this;
		A ay = (A) o;
		
		//2 doi tuong a1 va a2 la equals
		// neu co gia tri cua p bang nhau
		return ax.p == ay.p;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
