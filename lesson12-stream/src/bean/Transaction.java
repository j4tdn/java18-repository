package bean;

public class Transaction {
    private Integer id;
    private Trader trader;
    private Integer year;
    private Long value;
    public Transaction(){}

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

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}
