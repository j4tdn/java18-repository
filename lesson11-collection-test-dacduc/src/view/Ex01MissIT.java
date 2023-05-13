package view;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01MissIT {
	public static void main(String[] args) {
		List<String> lines = readFile("data.txt");
		lines.forEach(System.out::println);
		Map<Integer,String> map = new HashMap<>();
		

	}
	private static List<String> readFile(String path){
		List<String> lines = null;
		try {
			List<String> Lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
	public static int findMissIT(List<String> lines) {
		if(lines.size()<2) {
			throw new IllegalArgumentException("data is invalid!!!");
		}
//		int numberOfJudges 
		return 1;
	}
}

class Candicate {
	private int id;
	//K: selectedPosition;
	//V:
	private Map<Integer,Integer>selectedPositions = new HashMap<>();
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
	Candicate(){
		
	}
	public void addSelectedPos(int selectedPos) {
		Integer currentAmount = selectedPositions.get(selectedPos);
		Integer newAmount =selectedPositions.containsKey(selectedPos) ? ++currentAmount:1;
		selectedPositions.put(selectedPos, newAmount);
	}
	@Override
	public String toString() {
		return "Candicate [id=" + id + ", selectedPositions=" + selectedPositions + "]";
	}
	
}
