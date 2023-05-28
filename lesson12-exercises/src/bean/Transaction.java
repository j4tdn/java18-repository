package bean;

public class Transaction {
	private Integer id;
	private Trader trader;
	private Integer transactionYear;
	private Long transactionValue;
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(Integer id, Trader trader, Integer transactionYear, Long transactionValue) {
		super();
		this.id = id;
		this.trader = trader;
		this.transactionYear = transactionYear;
		this.transactionValue = transactionValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public Integer getTransactionYear() {
		return transactionYear;
	}

	public void setTransactionYear(Integer transactionYear) {
		this.transactionYear = transactionYear;
	}

	public Long getTransactionValue() {
		return transactionValue;
	}

	public void setTransactionValue(Long transactionValue) {
		this.transactionValue = transactionValue;
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", transactionYear=" + transactionYear
				+ ", transactionValue=" + transactionValue + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Transaction)) {
			return false;
		}
		Transaction that = (Transaction) obj;
		return getTransactionValue() == that.getTransactionValue();
	}
	
	
	
}