package bean;

public class CD {
	private Integer id;
	private String type;
	private String singer;
	private Integer songAmount;
	private Double price;

	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(Integer id, String type, String singer, Integer songAmount, Double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.songAmount = songAmount;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Integer getSongAmount() {
		return songAmount;
	}

	public void setSongAmount(Integer songAmount) {
		this.songAmount = songAmount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", songAmount=" + songAmount + ", price="
				+ price + "]";
	}
}
