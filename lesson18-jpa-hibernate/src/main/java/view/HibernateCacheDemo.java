package view;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;

public class HibernateCacheDemo {
private static ItemGroupDao itemGroupDao;
	
	static {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public static void main(String[] args) {
		
		// demo 1st level cache
		itemGroupDao.demoFirstLevelCache();
		
		System.out.println("\n===========demo second level cache=============\n");
		
		// demo 2nd level cache
		itemGroupDao.demoSecondLevelCache();
	}
}
