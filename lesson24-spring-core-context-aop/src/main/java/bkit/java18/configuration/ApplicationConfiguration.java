package bkit.java18.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import bkit.java18.bean.common.Catalog;
import bkit.java18.service.MovieCatalog;

// B2: Configuration Metadata
@Configuration
@ComponentScan(basePackages = "bkit.java18")
public class ApplicationConfiguration {
	
	@Bean // --> bean name default = method name
	public MovieCatalog movieCatalog() {
		return new MovieCatalog(Catalog.ADVENTURE);
	}
	
}
