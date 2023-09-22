package service;

import java.util.List;
import java.util.Set;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroupDetail(Set<Integer> igIds);
	
	void save(ItemGroup itemGroup);

}
