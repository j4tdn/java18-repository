package service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import dao.ItemDao;
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
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll(){
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> get(String igName) {
		if(igName == null || igName.isBlank()) {
			return Collections.emptyList();
		}
		return itemGroupDao.get(igName);
	}
	
	@Override
	public List<ItemGroup> getItemGroupById(Set<Integer> ids) {
		List<Item> items = itemDao.getItems(ids);
		
		Map<ItemGroup, List<Item>> itemGroupMap = items.stream()
				.collect(Collectors.groupingBy(Item::getItemGroup));
		
		return null;
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
