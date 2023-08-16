package service;

import java.util.List;
import java.util.Objects;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

/**
 * Thực thi abstract method từ ItemGroupService + Gọi đến DAO method tương ứng +
 * Xử lý thêm LOGIC nếu có
 * 
 * @author qphan
 *
 */
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
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup cannot be null");
		itemGroupDao.save(itemGroup);
	}

}
