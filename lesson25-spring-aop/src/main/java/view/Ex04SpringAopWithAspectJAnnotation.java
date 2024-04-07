package view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bkit.java18.configuration.ApplicationConfigurer;
import bkit.java18.service.MovieService;

public class Ex04SpringAopWithAspectJAnnotation {
	
	private static final Class<?> CLASSPATH = ApplicationConfigurer.class;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CLASSPATH);
		
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);
		
		System.out.println("\n===========\n");
		
		// Khi sử dụng auto proxy thì get join point trực tiếp thay vì get proxy bean
		MovieService movieService = context.getBean("movieService", MovieService.class);
		movieService.addMovie();
		
		System.out.println("\n");
		movieService.updateMovie("HELLO");
	
		System.out.println("\n");
		System.out.println("  ===> Context getMovie --> " + movieService.getMovie());
		
		System.out.println("\n");
		movieService.displayCatalog();
		
		System.out.println("\n");
		movieService.showMovieName();
		
		context.close();
	}
	
}
