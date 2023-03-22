package demoenum;

public enum Position {
	// private static final String ONSIDE = "TREN";	
	// private static final String INSIDE = "TRONG";	
	// private static final String OUTSIDE = "NGOAI";	
	ONSIDE("TREN"), // Position ONSIDE = new Positon("TREN")
	INSIDE("TRONG"),
	OUTSIDE("NGOAI");
	private String value;
	
	Position(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
