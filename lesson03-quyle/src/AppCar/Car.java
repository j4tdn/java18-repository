package AppCar;

public class Car {
	private String nameCar;
	private String color;
	private float cost;
	private int cc;
	public Car() {
	}
	public Car(String nameCar, String color, float cost, int cc) {
		this.nameCar = nameCar;
		this.color = color;
		this.cost = cost;
		this.cc = cc;
	}
	public String getNameCar() {
		return nameCar;
	}
	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Car [nameCar=" + nameCar + ", color=" + color + ", cost=" + cost + ", cc=" + cc + "]";
	}
	
	
	

}
