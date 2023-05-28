package bean;

public class Transition {
	private Trader trader;
	private int year;
	private int value;
	public Transition() {
		// TODO Auto-generated constructor stub
	}
	public Transition(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "transition [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
