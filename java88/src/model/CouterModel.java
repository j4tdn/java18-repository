package model;

public class CouterModel {
	private int count;
	private int x;
	private int y;
	private String s;

	public CouterModel() {
		this.count=0;
		this.x=0;
		this.y=0;
		this.s="no";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public void addClick() {
		this.count++;
	}
	
	public void enter() {
		s = "YES";
	}
	public void exit() {
		s= "NO";
	}
	
	
}
