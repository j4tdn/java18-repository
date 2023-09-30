package dao;

import java.util.List;

import dto.ItemGroupDto;
import dto.ItemHights;
import dto.OrderDto;

public interface OrderDao {
	List<OrderDto> getAll (String date);
	
	List<ItemGroupDto> getAllItemGroupDtos ();
	
	List<ItemHights> getItemHights();
}
