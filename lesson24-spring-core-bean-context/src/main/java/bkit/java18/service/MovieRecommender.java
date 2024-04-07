package bkit.java18.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// B2: Khi Spring IoC container được khởi tạo, scan qua class này, package chứa class này
// thấy @Component, tạo bean cho class này với bean name = tên class viết thường chữ đầu tiên

@Component // --> <bean id="movieRecommender" class="bkit.java18.service.MovieRecommender">

// Đặt tên, id cho bean thay vì dùng default name
// @Component(value = "movieTest") // --> <bean id="movieTest" class="bkit.java18.service.MovieRecommender">

// B1: Pojo Object
public class MovieRecommender {
	
	@Autowired // --> trong IOC chỉ có duy nhất 1 bean cho class MovieCatalog
	// @Qualifier("movieCatalogAct") // --> chỉ định(qualifying bean cần lấy của MovieCatalog thông qua bean name)
	private MovieCatalog movieCatalog; // NPE
	
	public void recommend() {
		System.out.println("MovieRecommender#recommend");
		movieCatalog.recommend();
	}
	
}
