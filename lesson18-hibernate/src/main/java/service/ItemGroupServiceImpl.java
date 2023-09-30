package service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public List<ItemGroupDto> getItemGroupDetails(Set<Integer> igIds) {
		if (igIds == null || igIds.isEmpty()) {
			return Collections.emptyList();
		}
		return itemGroupDao.getItemGroupDetails(igIds);
	}

	@Override
	public void save(ItemGroup itemGroup) {
		itemGroupDao.save(itemGroup);
	}

	@Override
	public void demoFirstLevelCache() {
		itemGroupDao.demoFirstLevelCache();
	}

	@Override
	public void demoSecondLevelCache() {
		itemGroupDao.demoSecondLevelCache();
	}

	@Override
	public void addNewItemGroups(int newItemGroups) {
		itemGroupDao.addNewItemGroups(newItemGroups);
	}
}