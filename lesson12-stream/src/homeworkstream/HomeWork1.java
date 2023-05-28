package homeworkstream;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Transition;
import model.TransitionModel;
import utils.PrintUtils;

public class HomeWork1 {
	public static void main(String[] args) {
		// câu 1
		List<Transition> homework1 = TransitionModel.getTransitionModels().stream().filter(t -> t.getYear()==2011).sorted((t1 ,t2)-> t1.getValue()-t2.getValue()).collect(Collectors.toList());
		PrintUtils.Print("câu 1 ", homework1);
		// câu 2
		List<Transition> homework2 = TransitionModel.getTransitionModels().stream().filter(t -> t.getValue()>300).sorted((t1,t2)-> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())).collect(Collectors.toList());
		PrintUtils.Print("câu 2 ", homework2);
		// câu 3
		Set<String> homework3 = TransitionModel.getTransitionModels().stream().map(t -> t.getTrader().getCity()).collect(Collectors.toSet());
		PrintUtils.Print("câu 3", homework3);
		// câu 4
		List<String> homework4 = TransitionModel.getTransitionModels().stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(t -> t.getTrader().getName()).sorted((t1,t2)->t1.compareTo(t2)).collect(Collectors.toList());
		PrintUtils.Print("câu 4", homework4);
		// câu 5
		List<String> homework5 = TransitionModel.getTransitionModels().stream().map(t -> t.getTrader().getName()).collect(Collectors.toList());
		PrintUtils.Print("câu 5", homework5);
		// câu 6
		boolean homework6 = TransitionModel.getTransitionModels().stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
		PrintUtils.Print("câu 6", homework6);
		// câu 7
		long homework7 = TransitionModel.getTransitionModels().stream().count();
		PrintUtils.Print("câu 7", homework7);
		// câu 8
		List<Integer> homework8 = TransitionModel.getTransitionModels().stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(t -> t.getValue()).collect(Collectors.toList());
		PrintUtils.Print("câu 8", homework8);
		// câu 9
		Integer homework9 = TransitionModel.getTransitionModels().stream().map(t -> t.getValue()).reduce(Integer.MIN_VALUE, Integer::max);
		PrintUtils.Print("câu 9", homework9);
		// câu 10
		Integer homework10 = TransitionModel.getTransitionModels().stream().map(t -> t.getValue()).reduce(Integer.MAX_VALUE, Integer::min);
		PrintUtils.Print("câu 10", homework10);
		Optional<Integer> a = TransitionModel.getTransitionModels().stream().map(t -> t.getValue()).reduce(Integer::max);
	}
}
