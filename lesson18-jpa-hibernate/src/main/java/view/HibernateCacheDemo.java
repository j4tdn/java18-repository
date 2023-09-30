package view;

import dao.ItemGroupDao;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class HibernateCacheDemo {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		itemGroupService.demoFirstLevelCache();
		
		System.out.println("\n======demo second level cache======\n");
		
		// demo 2nd levle cach
		itemGroupService.demoSecondLevelCache();
	}
}
