package bean;

import java.util.Objects;

public class Transaction {
	private Integer id;
	private Trader trader;
	private Integer year;
	private Long value;
	
	
	public Transaction(Integer id, Trader trader, Integer year, Long value) {
		super();
		this.id = id;
		this.trader = trader;
		this.year = year;
		this.value = value;
	}


	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}
	
	public String getCityTrader() {
		return trader.getCity();
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
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	
	public String getNameTrader() {
		return trader.getName();
	}


	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Transaction)) {
			return false;
		}
		Transaction that = (Transaction)obj;
		
		return getId() == that.getId();
	}
	
}
