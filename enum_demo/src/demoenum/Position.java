package demoenum;

public enum Position {
	ONSIDE("TREN"), INSIDE("TRONG"), OUTSIDE("NGOAI");

	private String value;

	private Position(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
