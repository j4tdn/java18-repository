package bean;

import java.util.Set;

public class A {
	public int p;
	
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
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof A)) {
			return false;
		}
		A o1 = this;
		A o2 = (A) obj;
		
		return o1.p == o2.p;
	}
}
