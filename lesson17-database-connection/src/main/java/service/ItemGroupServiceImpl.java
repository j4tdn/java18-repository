package service;

/**
 * Thực thi abstract method từ ItemGroupService
 *   + Gọi đến DAO method tương ứng 
 *   + Xử lý thêm LOGIC nếu có
 */

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
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
		
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> get(String name) {
		return itemGroupDao.get(name);
	}
	
	@Override
	public List<ItemGroup> getItemsGroupByIds(Set<Integer> ids) {
		List<Item> items = itemDao.getItems(ids);
		Map<ItemGroup, List<Item>> itemGroupMap = items.stream().collect(Collectors.groupingBy(Item::getItemGroup));
		
		itemGroupMap.forEach((k, v) -> {
			k.getItems().addAll(v);
		});
		return List.copyOf(itemGroupMap.keySet());
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDao.getItemGroupDetails();
	}
	
	@Override
	public ItemGroup get(int igId) {
		return itemGroupDao.get(igId);
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
