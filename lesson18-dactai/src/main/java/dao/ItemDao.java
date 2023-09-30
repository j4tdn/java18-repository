package dao;

import java.util.List;

import dto.ItemDto;

public interface ItemDao {

	List<ItemDto> getAllByItemGroupId();

}
