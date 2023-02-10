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
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if (!(obj instanceof A)) {
			return false;
		}
		
		A ax = this;
		A ay = (A)obj;
		return ax.p == ay.p;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
