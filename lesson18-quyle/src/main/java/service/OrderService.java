package service;

import java.util.List;

import dto.ItemGroupDto;
import dto.OrderDto;

public interface OrderService {
	List<OrderDto> getAll (String date);
	
	List<ItemGroupDto> getAllItemGroupDtos ();
}
