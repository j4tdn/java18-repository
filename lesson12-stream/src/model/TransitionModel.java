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
		
		Trader Raoul = new Trader(1,"Rounl","Cambridge");
		Trader Mario = new Trader(2 ,"Mario","Milan");
		Trader Alan =new Trader(3, "Alan","Cambridge");
		Trader Brian =new Trader(4, "Brian","Cambridge");
		
		return Arrays.asList(
			new Transition(55,Brian, 2011, 300),
			new Transition(66,Raoul, 2012, 1000),
			new Transition(77,Raoul, 2011, 400),
			new Transition(88,Mario, 2012, 710),
			new Transition(99,Mario, 2012, 700),
			new Transition(44,Alan, 2012, 950)
		);
	}
}
