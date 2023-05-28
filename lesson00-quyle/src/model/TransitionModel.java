package model;

import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transition;

public class TransitionModel {
	public TransitionModel() {
		// TODO Auto-generated constructor stub
	}
	public static List<Transition> getTransitionModels(){
		
		Trader Raoul = new Trader("Rounl","Cambridge");
		Trader Mario = new Trader("Mario","Milan");
		Trader Alan =new Trader("Alan","Cambridge");
		Trader Brian =new Trader("Brian","Cambridge");
		
		return Arrays.asList(
			new Transition(Brian, 2011, 300),
			new Transition(Raoul, 2012, 1000),
			new Transition(Raoul, 2011, 400),
			new Transition(Mario, 2012, 710),
			new Transition(Mario, 2012, 700),
			new Transition(Alan, 2012, 950)
		);
	}
}
