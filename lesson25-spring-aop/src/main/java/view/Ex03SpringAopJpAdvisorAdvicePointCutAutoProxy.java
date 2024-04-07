package view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bkit.java18.service.MovieService;

public class Ex03SpringAopJpAdvisorAdvicePointCutAutoProxy {
	
	private static final String PATH = "03-spring-aop-jp-advisor-advice-pointcut-auto-proxy.xml";
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(PATH);
		
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);
		
		System.out.println("\n===========\n");
		
		// Khi sử dụng auto proxy thì get join point trực tiếp thay vì get proxy bean
		MovieService movieService = context.getBean("movie-service", MovieService.class);
		movieService.showMovieName();
		
		System.out.println("\n");
		
		// point cut, method name match 'displayCatalog'
		movieService.displayCatalog();
		
		context.close();
	}
	
}
