package view;

import java.util.List;

import dto.ItemDto;
import dto.ItemGroupDto;
import service.HibernateItemGroupService;
import service.HibernateItemService;
import service.ItemGroupService;
import service.ItemService;

public class MainView {

	private static ItemGroupService itemGroupService;
	private static ItemService itemService;

	static {
		itemGroupService = new HibernateItemGroupService();
		itemService = new HibernateItemService();
	}

	public static void main(String[] args) {

		List<ItemGroupDto> Q2 = itemGroupService.getItemStock();

		List<ItemDto> Q4 = itemService.getAllByItemGroupId();

		System.out.println(Q4);
	}

}
