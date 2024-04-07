package bkit.java18.service;

public class MovieService {
	
	// Demo with @AspectJ
	public void addMovie() {
		System.out.println("  ===> MovieService#addMovie");
	}
	
	public void updateMovie(String newName) {
		System.out.println("  ===> MovieService#updateMovie(new_name)");
	}
	
	public String getMovie() {
		return " ===> MovieService#getMovie --> String Value";
	}
	
	// Demo with Spring AOP XML Schema Based

	// execution method
	public void showMovieName() {
		System.out.println("  ===> MovieService#showMovieName --> NAME = TEST-A");
	}
	
	// execution method
	public void displayCatalog() {
		System.out.println("  ===> MovieService#displayCatalog --> Catalog = ACTION");
	}
	
}
