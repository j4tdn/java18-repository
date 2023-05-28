package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import bean.Transition;
import model.TransitionModel;

public class HomeWork {
	public static void main(String[] args) {
		List<Transition> inventory = TransitionModel.getTransitionModels();
		System.out.println("================homework1===========");
		List<Transition> home1 = finderList(inventory, t -> t.getYear() == 2011);
		home1.sort((t1, t2) -> t1.getValue() - t2.getValue());
		home1.forEach(System.out::println);
		System.out.println("================homework2===========");
		List<Transition> home2 = finderList(inventory, t -> t.getValue() > 300);
		home2.sort((t1, t2) -> {
			if (!t1.getTrader().getCity().equals(t2.getTrader().getCity())) {
				return 1;
			} else {
				return -1;
			}
		});
		home2.forEach(System.out::println);
		System.out.println("================homework3===========");

		Set<String> strings = new HashSet<>();
		for (Transition transition : inventory) {
			strings.add(transition.getTrader().getCity());
		}
		Set<String> home3 = strings;
		home3.forEach(System.out::println);

		System.out.println("================homework4==========");
		List<Transition> testHome4 = finderList(inventory, t -> (t.getTrader().getCity()).equals("Cambridge"));
		testHome4.sort((t1, t2) -> {
			if (t1.getTrader().getName().equals(t2.getTrader().getName())) {
				return 1;
			} else {
				return -1;
			}
		});
		List<String> home4 = new ArrayList<>();
		for (Transition transition : testHome4) {
			home4.add(transition.getTrader().getName());
		}
		home4.forEach(System.out::println);
		System.out.println("================homework5==========");
		List<String> home5 = new ArrayList<>();
		for (Transition transition : inventory) {
			home5.add(transition.getTrader().getName());
		}
		home5.forEach(System.out::println);
		System.out.println("================homework6==========");
		List<Transition> home6 = finderList(inventory, t -> t.getTrader().getCity() == "Milan");
		if (home6.size() >= 1) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		System.out.println("================homework7==========");
		List<Transition> home7 = home6;
		System.out.println(home7.size());
		System.out.println("================homework8==========");
		List<Transition> home8 = finderList(inventory, t -> t.getTrader().getCity().equals("Cambridge"));
		home8.forEach(System.out::println);
		System.out.println("================homework9==========");
		List<Transition> home9 = inventory;
		home9.sort((t1, t2) -> t2.getValue() - t1.getValue());
		System.out.println(home9.get(0));
		System.out.println("================home10=============");
		List<Transition> home10 = inventory;
		home10.sort((t1, t2) -> t1.getValue() - t2.getValue());
		System.out.println(home9.get(0));

	}

	public static List<Transition> finderList(List<Transition> inventory, Predicate<Transition> predicate) {
		List<Transition> transitions = new ArrayList<>();
		for (Transition transition : inventory) {
			if (predicate.test(transition)) {
				transitions.add(transition);
			}
		}

		return transitions;
	}
}
