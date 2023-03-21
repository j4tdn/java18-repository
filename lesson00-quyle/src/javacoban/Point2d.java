package javacoban;

public class Point2d {
	private float x;
	private float y;
	
	public Point2d() {
	}

	public Point2d(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void move(float a , float b) {
		x+=a;
		y+=b;
	}
	public float distance(Point2d a) {
		double distance = Math.sqrt(Math.pow((x-a.getX()), 2)+Math.pow((y-a.getY()), 2));
		return (float)distance;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
}
