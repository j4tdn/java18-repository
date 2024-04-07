package bkit.java18.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import bkit.java18.aspects.MovieTrackerZAspect;
import bkit.java18.service.MovieService;

@Configuration

// 3. Khai báo Auto Proxy
@EnableAspectJAutoProxy
public class ApplicationConfigurer {
	
	// 1. Khai báo Join Point
	@Bean
	public MovieService movieService() {
		return new MovieService();
	}
	
	// 2. Khai báo khởi tạo Advisor(Aspect)
	@Bean
	public MovieTrackerZAspect movieTrackerZAspect() {
		return new MovieTrackerZAspect();
	}
	
}
