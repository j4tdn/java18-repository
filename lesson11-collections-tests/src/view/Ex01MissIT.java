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
		List<Candidate> candidates = new ArrayList<>();
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
				Candidate candidate = null;
				if (exists(candidates, selectedId)) {
					candidate = get(candidates, selectedId);
					candidate.updateSelectedPos(selectedIndex);
				} else {
					candidate = new Candidate(selectedId);
					candidate.updateSelectedPos(selectedIndex);
					candidates.add(candidate);
				}
			}
		}
		
		candidates.sort(Comparator.comparing(Candidate::getTotalOfScore).reversed());
		
		List<Candidate> candidatesWithSameMaxScore = getCandidates(candidates, candidates.get(0).getTotalOfScore());
		if (candidatesWithSameMaxScore.size() == 1) {
			System.out.println("=======Max score==========");
			candidatesWithSameMaxScore.forEach(System.out::println);
			return map(candidates);
		}
		System.out.println("=======Same score==========");
		candidatesWithSameMaxScore.forEach(System.out::println);
		
		Candidate maxCandidateAtFirst = max(candidatesWithSameMaxScore, 1);
		
		System.out.println("=======Same first==========");
		
		List<Candidate> maxCandidateWithSameFirst = getCandidatesSameFirst(candidatesWithSameMaxScore, maxCandidateAtFirst.getSelectedPositions().get(1));
		maxCandidateWithSameFirst.forEach(System.out::println);
		
		if (maxCandidateWithSameFirst.size() == 1) {
			return map(candidates);
		}
		
		System.out.println("=======Same second==========");
		List<Candidate> maxCandidateWithSameSecond = getCandidatesSameSecond(candidatesWithSameMaxScore, maxCandidateAtFirst.getSelectedPositions().get(2));
		maxCandidateWithSameSecond.forEach(System.out::println);
		
		return map(maxCandidateWithSameSecond);
	}
	
	private static List<Integer> map(List<Candidate> candidates) {
		List<Integer> ids = new ArrayList<>();
		for (Candidate candidate: candidates) {
			ids.add(candidate.getId());
		}
		return ids;
	}
	
	// get candidates by pos
	private static Candidate max(List<Candidate> candidates, int pos) {
		int max = 0;
		Candidate maxCandidateByPos = null;
		for (Candidate candidate: candidates) {
			if (candidate.getSelectedPositions().get(pos) > max) {
				maxCandidateByPos = candidate;
			}
		}
		return maxCandidateByPos;
	}
	
	private static List<Candidate> getCandidatesSameFirst(List<Candidate> candidates, int amountOfFirst) {
		final List<Candidate> result = new ArrayList<>();
		for (Candidate candidate: candidates) {
			if (candidate.getSelectedPositions().get(1) == amountOfFirst) {
				result.add(candidate);
			}
		}
		return result;
	}
	
	private static List<Candidate> getCandidatesSameSecond(List<Candidate> candidates, int amountOfSecond) {
		final List<Candidate> result = new ArrayList<>();
		for (Candidate candidate: candidates) {
			if (candidate.getSelectedPositions().get(2) == amountOfSecond) {
				result.add(candidate);
			}
		}
		return result;
	}
	
	private static List<Candidate> getCandidates(List<Candidate> candidates, int score) {
		final List<Candidate> result = new ArrayList<>();
		for (Candidate candidate: candidates) {
			if (candidate.getTotalOfScore() == score) {
				result.add(candidate);
			}
		}
		return result;
	}
	
	private static Candidate get(List<Candidate> candidates, int id) {
		for (Candidate candidate: candidates) {
			if (candidate.getId() == id) {
				return candidate;
			}
		}
		return null;
	}
	
	private static boolean exists(List<Candidate> candidates, int candidateId) {
		for (Candidate candidate: candidates) {
			if (candidate.getId() == candidateId) {
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

class Candidate {
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

	public Candidate() {
	}

	public Candidate(int id) {
		this.id = id;
	}
	
	public Candidate(int id, Map<Integer, Integer> selectedPositions) {
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
		return "Candidate [id=" + id + ", selectedPositions=" + selectedPositions + ", totalOfScore=" + totalOfScore
				+ "]";
	}
	
}
