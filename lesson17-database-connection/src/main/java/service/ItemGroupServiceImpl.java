package service;

/**
 * Thực thi abstract method từ ItemGroupService
 *   + Gọi đến DAO method tương ứng 
 *   + Xử lý thêm LOGIC nếu có
 */

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
		
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int igId) {
		return itemGroupDao.get(igId);
	}
	
	@Override
	public List<ItemGroup> get(String name) {
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be NULL !!!");
		itemGroupDao.save(itemGroup);
	}
	
	@Override
	public void save(List<ItemGroup> itemGroups) {
		if(itemGroups.isEmpty()) {
			System.out.println("LOG info >> list of item group is empty, nothing to save");
			return;
		}
		itemGroupDao.save(itemGroups);
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be NULL !!!");
		itemGroupDao.update(itemGroup);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be NULL !!!");
		if(Optional.ofNullable(get(itemGroup.getId())).isPresent()) {
			update(itemGroup);
		} else {
			save(itemGroup);
		}
		
	}
}
