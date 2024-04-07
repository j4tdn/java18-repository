package view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java18.service.MovieService;

public class Ex02SpringAopJpAdvisorAdvicePointCutProxy {
	
	private static final String PATH = "02-spring-aop-jp-advisor-advice-name-pointcut-proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);
		
		System.out.println("\n===========\n");
		
		MovieService movieService = context.getBean("movie-proxy", MovieService.class);
		movieService.showMovieName();
		
		System.out.println("\n");
		
		// point cut, method name match 'displayCatalog'
		movieService.displayCatalog();
		
		context.close();
	}
	
}
