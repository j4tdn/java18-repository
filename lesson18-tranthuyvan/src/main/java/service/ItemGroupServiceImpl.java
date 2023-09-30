package service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroupDto> countItemsByIgIds(Set<Integer> igIds) {
		if (igIds == null || igIds.isEmpty()) {
			return Collections.emptyList();
		}
		return itemGroupDao.countItemsByIgIds(igIds);
	}
	
	@Override
	public List<Item> getItemsByItemGroup() {
		return itemGroupDao.getItemsByItemGroup();
	}

}
