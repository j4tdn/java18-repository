package view;

import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01MissIT {
	public static void main(String[] args) {
		List<String> lines = readFile("data.txt");
		lines.forEach(System.out::println);

		System.out.println("===========");
		findMissesIT(lines);
	}

	private static List<Integer> findMissesIT(List<String> lines) {
		if (lines.size() < 2) {
			throw new IllegalArgumentException("data is invalid !!!");
		}
		List<candidatee> candidatees = new ArrayList<>();
		int numberOfJudges = Integer.parseInt(lines.get(0)); // 4

		for (int judgeIndex = 1; judgeIndex <= numberOfJudges; judgeIndex++) {
			// 1 --> 3 5 2 1
			String[] selectedIds = lines.get(judgeIndex).trim().split("\\s");

			// 1 --> 3
			int numberOfSelectedIds = Integer.parseInt(selectedIds[0]);

			// list: (5, [1, 0, 0])-H1 (2, [0, 1, 0])-H2, (1, [0, 0, 1])-H3
			//       (12, [1, 0, 0])-H4,

			for (int selectedIndex = 1; selectedIndex <= numberOfSelectedIds; selectedIndex++) {
				int selectedId = Integer.parseInt(selectedIds[selectedIndex]);
				candidatee candidatee = null;
				if (exists(candidatees, selectedId)) {
					candidatee = get(candidatees, selectedId);
					candidatee.updateSelectedPos(selectedIndex);
				} else {
					candidatee = new candidatee(selectedId);
					candidatee.updateSelectedPos(selectedIndex);
					candidatees.add(candidatee);
				}
			}
		}

		candidatees.sort(Comparator.comparing(candidatee::getTotalOfScore).reversed());

		List<candidatee> candidateesWithSameMaxScore = getcandidatees(candidatees, candidatees.get(0).getTotalOfScore());
		if (candidateesWithSameMaxScore.size() == 1) {
			System.out.println("=======Max score==========");
			candidateesWithSameMaxScore.forEach(System.out::println);
			return map(candidatees);
		}
		System.out.println("=======Same score==========");
		candidateesWithSameMaxScore.forEach(System.out::println);

		candidatee maxcandidateeAtFirst = max(candidateesWithSameMaxScore, 1);

		System.out.println("=======Same first==========");

		List<candidatee> maxcandidateeWithSameFirst = getcandidateesSameFirst(candidateesWithSameMaxScore, maxcandidateeAtFirst.getSelectedPositions().get(1));
		maxcandidateeWithSameFirst.forEach(System.out::println);

		if (maxcandidateeWithSameFirst.size() == 1) {
			return map(candidatees);
		}

		System.out.println("=======Same second==========");
		List<candidatee> maxcandidateeWithSameSecond = getcandidateesSameSecond(candidateesWithSameMaxScore, maxcandidateeAtFirst.getSelectedPositions().get(2));
		maxcandidateeWithSameSecond.forEach(System.out::println);

		return map(maxcandidateeWithSameSecond);
	}

	private static List<Integer> map(List<candidatee> candidatees) {
		List<Integer> ids = new ArrayList<>();
		for (candidatee candidatee: candidatees) {
			ids.add(candidatee.getId());
		}
		return ids;
	}

	// get candidatees by pos
	private static candidatee max(List<candidatee> candidatees, int pos) {
		int max = 0;
		candidatee maxcandidateeByPos = null;
		for (candidatee candidatee: candidatees) {
			if (candidatee.getSelectedPositions().get(pos) > max) {
				maxcandidateeByPos = candidatee;
			}
		}
		return maxcandidateeByPos;
	}

	private static List<candidatee> getcandidateesSameFirst(List<candidatee> candidatees, int amountOfFirst) {
		final List<candidatee> result = new ArrayList<>();
		for (candidatee candidatee: candidatees) {
			if (candidatee.getSelectedPositions().get(1) == amountOfFirst) {
				result.add(candidatee);
			}
		}
		return result;
	}

	private static List<candidatee> getcandidateesSameSecond(List<candidatee> candidatees, int amountOfSecond) {
		final List<candidatee> result = new ArrayList<>();
		for (candidatee candidatee: candidatees) {
			if (candidatee.getSelectedPositions().get(2) == amountOfSecond) {
				result.add(candidatee);
			}
		}
		return result;
	}

	private static List<candidatee> getcandidatees(List<candidatee> candidatees, int score) {
		final List<candidatee> result = new ArrayList<>();
		for (candidatee candidatee: candidatees) {
			if (candidatee.getTotalOfScore() == score) {
				result.add(candidatee);
			}
		}
		return result;
	}

	private static candidatee get(List<candidatee> candidatees, int id) {
		for (candidatee candidatee: candidatees) {
			if (candidatee.getId() == id) {
				return candidatee;
			}
		}
		return null;
	}

	private static boolean exists(List<candidatee> candidatees, int candidateeId) {
		for (candidatee candidatee: candidatees) {
			if (candidatee.getId() == candidateeId) {
				return true;
			}
		}
		return false;
	}

	private static List<String> readFile(String path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
}

class candidatee {
	private static final int min = 1;
	private static final int max = 3;

	private int id;
	// K: selected position
	// V: amount of selected position
	private Map<Integer, Integer> selectedPositions = new HashMap<>(){
		private static final long serialVersionUID = -1568560741567368046L;
		{
			put(1, 0);
			put(2, 0);
			put(3, 0);
		}
	};
	private int totalOfScore;

	public candidatee() {
	}

	public candidatee(int id) {
		this.id = id;
	}

	public candidatee(int id, Map<Integer, Integer> selectedPositions) {
		this.id = id;
		this.selectedPositions = selectedPositions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, Integer> getSelectedPositions() {
		return selectedPositions;
	}

	public void setSelectedPositions(Map<Integer, Integer> selectedPositions) {
		this.selectedPositions = selectedPositions;
	}

	public void updateSelectedPos(int selectedPos) {
		Integer currentAmount = selectedPositions.get(selectedPos);
		selectedPositions.put(selectedPos, ++currentAmount);
		setTotalOfScore(selectedPos);
	}

	public int getTotalOfScore() {
		return totalOfScore;
	}

	// 1 -> 3
	// 2 -> 2
	// 3 -> 1
	public void setTotalOfScore(int selectedPos) {
		this.totalOfScore += (min + max) - selectedPos;
	}

	@Override
	public String toString() {
		return "candidatee [id=" + id + ", selectedPositions=" + selectedPositions + ", totalOfScore=" + totalOfScore
				+ "]";
	}

}
