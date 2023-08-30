package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {

	List<ItemGroup> getAll();

	ItemGroup get(int igId);

	List<ItemGroup> get(String name);

	List<ItemGroupDto> getItemGroupDetails();

	void save(ItemGroup itemGroup);

	void save(List<ItemGroup> itemGroupss);

	void update(ItemGroup itemGroup);

}
