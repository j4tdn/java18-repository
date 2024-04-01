package bkit.java18.service;

import bkit.java18.bean.common.Catalog;

// @Component -> dùng cho empty constructor, no define properties
public class MovieCatalog {

	private Catalog catalog;

	public MovieCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public void recommend() {
		System.out.println("MovieCatalog#recommend");
		switch (catalog) {
		case ACTION:
			System.out.println("We prefer watching 'Action 123' series");
			break;
		case ADVENTURE:
			System.out.println("We prefer watching 'ADVENTURE 789' series");
			break;
		}
	}

}
