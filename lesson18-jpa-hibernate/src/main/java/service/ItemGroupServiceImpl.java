package service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import dao.ItemGroupDao;
import dto.ItemGroupDto;
import dao.HibernateItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	/**
	 * Cần phải kiểm tra ko null và isEmpty
	 * Nếu không có igIds --> chắc chắn trả về list rỗng
	 * Nhưng nếu ko có sẽ mất công truy vấn database, ko có --> trả về list rỗng 
	 * Nếu có --> trả về rỗng lun, đỡ phải truy vấn DB
	 */
	@Override
	public List<ItemGroupDto> getItemGroupDetail(Set<Integer> igIds) {
		if (igIds == null || igIds.isEmpty()) {
			return Collections.emptyList();
		}
		return itemGroupDao.getItemGroupDetail(igIds);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		itemGroupDao.save(itemGroup);
	}

}
