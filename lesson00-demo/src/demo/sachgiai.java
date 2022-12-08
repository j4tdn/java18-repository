package demo;

public class sachgiai extends sach {
	private boolean moi;

	public sachgiai() {
	}

	public sachgiai(String id, String name, double gia, boolean moi) {
		super(id, name, gia);
		this.moi = moi;
	}

	public boolean isMoi() {
		return moi;
	}

	public void setMoi(boolean moi) {
		this.moi = moi;
	}

	@Override
	public String toString() {
		return "sachgiai [moi=" + moi + ", toString()=" + super.toString() + "]";
	}
	

}
