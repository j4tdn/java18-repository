package bean;

public class Dictionary {
	private String word;
	private String meaning;
	private String type;
	
	public Dictionary() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary(String word, String meaning, String type) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.type = type;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", meaning=" + meaning + ", type=" + type + "]";
	}
	
	
}
