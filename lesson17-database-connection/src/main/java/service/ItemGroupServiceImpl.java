package service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

/**
 *  Thực thi abstract method từ ItemGroupService
 *  	+ Gọi đến Dao method tương ứng
 *  	+ Xử lí thêm Logic nếu có
 * @author Dell
 *
 */
public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll(){
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int igId) {
		return itemGroupDao.get(igId);
	}
	
	@Override
	public List<ItemGroup> get(String igName) {
		if(igName == null || igName.isBlank()) {
			return Collections.emptyList();
		}
		return itemGroupDao.get(igName);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be null");
		itemGroupDao.save(itemGroup);
	}
	
	@Override
	public void save(List<ItemGroup> itemGroups) {
		if (itemGroups.isEmpty()) {
			System.out.println("LOG info >> list of item group is empty, nothing to save");
			return;
		}
		for(ItemGroup itemGroup: itemGroups) {
			save(itemGroup);
		}
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be null");
		itemGroupDao.update(itemGroup);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be null");
		if (Optional.ofNullable(get(itemGroup.getId())).isPresent()) {
			update(itemGroup);
		}else {
			save(itemGroup);
		}
	}
}
