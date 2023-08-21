-- 1A. Liệt kê toàn bộ thông tin các loại hàng 
SELECT * FROM item_group;

-- 1B. Liệt kê loại hàng theo mã loại
SELECT * 
	FROM item_group
 WHERE ID = 3;
 
 -- 1C: Thêm mới loại hàng
 INSERT INTO item_group(ID, NAME)
 VALUES(9, 'Loại Hàng 9');
 
 -- 1D: Cập nhật loại hàng 
 UPDATE item_group
	SET NAME = "..."
 WHERE ID = 1;
 
 -- 1F: Liệt kê các mặt hàng, thông tin trả về của mỗi mặt hàng gồm 
 --     Các tham số của mặt hàng, thông tin loại hàng của nó 
 SELECT * 
   FROM item it 
   JOIN item_group itg
     ON it.ITEM_GROUP_ID = itg.ID
 