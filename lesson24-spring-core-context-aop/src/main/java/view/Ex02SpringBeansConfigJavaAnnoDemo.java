package view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bkit.java18.configuration.ApplicationConfiguration;
import bkit.java18.service.MovieRecommender;

public class Ex02SpringBeansConfigJavaAnnoDemo {

	private static Class<?> APP_CONFIG_METADATA = ApplicationConfiguration.class;

	public static void main(String[] args) {

		// Setup IoC container via Java - Annotation Configuration
		// B3. Thường, các framework sẽ scan, đọc config từ @Component, @Configuration và bỏ vào IoC của nó
		// ko cần phải tạo context ra
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(APP_CONFIG_METADATA);

		// Get beans in IoC container
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);

		System.out.println("\n===========\n");

		MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
		movieRecommender.recommend();
		
		context.close();
	}

}
