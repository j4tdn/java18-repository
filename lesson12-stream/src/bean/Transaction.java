package bean;

public class Transaction {
	private Trader trader;
	private int transactionYear;
	private double transactionValue;
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(Trader trader, int transactionYear, double transactionValue) {
		super();
		this.trader = trader;
		this.transactionYear = transactionYear;
		this.transactionValue = transactionValue;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getTransactionYear() {
		return transactionYear;
	}
	public void setTransactionYear(int transactionYear) {
		this.transactionYear = transactionYear;
	}
	public double getTransactionValue() {
		return transactionValue;
	}
	public void setTransactionValue(double transactionValue) {
		this.transactionValue = transactionValue;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", transactionYear=" + transactionYear + ", transactionValue="
				+ transactionValue + "]";
	}
	
	
	
}
