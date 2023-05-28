package common;

public enum Ectension {
	mp4(".mp4"),mp3(".mp3"),txt(".txt"),java(".java"),png(".png");
	
	private String ext;
	
	Ectension(String ext){
		this.ext=ext;
	}
	public String val() {
		return ext;
	}
}
