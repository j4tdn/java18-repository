package model;

import java.util.Arrays;
import java.util.List;

import bean.Trader;

public class TraderModel {
	public TraderModel() {
		// TODO Auto-generated constructor stub
	}

	public static List<Trader> getTrader(){
		return Arrays.asList(
			new Trader("Rounl","Cambridge"),
			new Trader("Mario","Milan"),
			new Trader("Alan","Cambridge"),
			new Trader("Brian","Cambridge")
		);
	}
}
