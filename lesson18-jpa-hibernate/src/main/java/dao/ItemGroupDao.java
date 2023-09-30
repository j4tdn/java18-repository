package dao;

import java.util.List;
import java.util.Set;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroupDetails(Set<Integer> igIds);

	void save(ItemGroup itemGroup);
	
	void demoFirstLevelCache();
	
	void demoSecondLevelCache();
	
	void addNewItemGroups(int )
}
