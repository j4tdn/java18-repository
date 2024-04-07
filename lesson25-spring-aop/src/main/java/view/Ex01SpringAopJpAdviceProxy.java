package view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java18.service.MovieService;

public class Ex01SpringAopJpAdviceProxy {
	
	private static final String PATH = "01-spring-aop-jp-advice-proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);
		
		System.out.println("\n===========\n");
		
		MovieService movieService = context.getBean("movie-proxy", MovieService.class);
		movieService.showMovieName();
		
		System.out.println("\n");
		
		movieService.displayCatalog();
		
		context.close();
	}
	
}
