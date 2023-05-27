package excercise;

import java.util.ArrayList;
import java.util.List;

import bean.Dictionary;

public class Ex04Dictionary {
	public static void main(String[] args) {
		List<Dictionary> dictionaries = new ArrayList<>(List.of(
				new Dictionary("hello","xin chào","verb"),
				new Dictionary("fuck","**","verb"),
				new Dictionary("student","sinh viên","noun"),
				new Dictionary("stupid","ngu","adj"),
				new Dictionary("rarely","hiếm khi","adv")
				));
		dictionaries.forEach(System.out::println);
	}
	
	public static void addNewWord(List<Dictionary> dictionaries,Dictionary newWord) {
		if(dictionaries.stream().map(word->word.getWord()).anyMatch(word->word.equals(newWord.getWord()))) {
			System.out.println("The word is available");
		}else {
			dictionaries.add(newWord);
		}	
	}
}
