package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01MissIT {
	public static void main(String[] args) {
		List<String> lines = readFile("data.txt");
		lines.forEach(line -> System.out.println(line));
	}

	private static int findMissIT(List<String> lines) {
		if (lines.size() < 2) {
			throw new IllegalArgumentException("data is valid");
		}
		List<Candidate> candidates = new ArrayList<>();
		int numberOfJudge = Integer.parseInt(lines.get(0));
		for (int judgeIndex = 1; judgeIndex <= numberOfJudge; judgeIndex++) {
			String judge = lines.get(judgeIndex);
			String[] selectdIds = lines.get(judgeIndex).trim().split("\\s");
			int numberOfSelectedIds = Integer.parseInt(selectdIds[0]);
			
		}
		return 1;
	}

	private static List<String> readFile(String Path) {
		List<String> lines = null;
		Path path = Paths.get("data.txt");
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();

		}
		return lines;
	}
}

class Candidate {
	private int id;
	// K:
	// V: mount of
	private Map<Integer, Integer> selectedPositions = new HashMap<>() {

		private static final long serialVersionUID = -1568560741567368046L;

		{
			
		}
	};// Nên khai báo để khỏi bị nullpointException

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(int id) {
		this.id = id;
	}

	public Candidate(int id, Map<Integer, Integer> rankTime) {
		this.id = id;
		this.selectedPositions = rankTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, Integer> getRankTime() {
		return selectedPositions;
	}

	public void setRankTime(Map<Integer, Integer> rankTime) {
		this.selectedPositions = rankTime;
	}

	public void addSelectedPos(int selectedPos) {
		Integer currentAmout = selectedPositions.get(selectedPos);
		if (selectedPositions.containsKey(selectedPos)) {
			selectedPositions.put(selectedPos, currentAmout);
		} else {
			selectedPositions.put(selectedPos, 1);
		}
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", rankTime=" + selectedPositions + "]";
	}
}
