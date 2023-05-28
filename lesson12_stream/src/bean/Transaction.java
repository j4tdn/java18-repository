package bean;

public class Transaction {
	// OOP --> Item -> Store ===> HAS-A
	// OOP --> Table extends Device ===> IS-A
	private Integer id;
	private Trader trader;
	private Integer year;
	private Long value;

	// Item: itemId(Integer), qty(Long), brand(String),
	// store(Store), warehouse(Warehouse), country(Country)

	// Store: storeId(Integer), warehouse(Warehouse), items(List<Item>)

	private final Trader trader;
	private final int year;
	private final int value;
	public Transaction() {
	}

	public Transaction(Trader trader, int year, int value) {
	public Transaction(Integer id, Trader trader, Integer year, Long value) {
		this.id = id;
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Trader getTrader() {
		return this.trader;
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public Integer getYear() {
		return year;
	}

	public int getYear() {
		return this.year;
	public void setYear(Integer year) {
		this.year = year;
	}

	public Long getValue() {
		return value;
	}

	public int getValue() {
		return this.value;
	public void setValue(Long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "{" + this.trader + ", " + "year: " + this.year + ", " + "value:" + this.value + "}";
		return "Transaction [id=" + id + ", trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
}
}