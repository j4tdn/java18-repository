package bkit.java18.configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import bkit.java18.bean.common.Catalog;
import bkit.java18.service.MovieCatalog;

//context -> configuration 
// -> 1. tạo bean thông qua bean method bên trong class có @Configuration
// -> 2. scan package, class tìm class có @Component, khởi tạo bean thông quan empty constructor
//       với @ComponentScan

// B2: Configuration Metadata
@Configuration
@ComponentScan(basePackages = "bkit.java18") 
public class ApplicationConfiguration {
	
	@Bean // --> bean name default = method name
	@Primary // --> trong class MovieCatalog nếu khởi tạo nhiều bean, khi thêm @Primary cho bean nào đó
	         //     thì bean này sẽ được ưu tiên sử dụng khi dùng @Autowired, k cần phải dùng @Qualified(...)
	public MovieCatalog movieCatalogAdv() {
		return new MovieCatalog(Catalog.ADVENTURE);
	}
	
	@Bean // --> bean name default = method name
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MovieCatalog movieCatalogAct() {
		return new MovieCatalog(Catalog.ACTION);
	}
	
}
