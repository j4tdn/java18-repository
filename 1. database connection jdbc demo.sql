-- 1A. Liệt kê toàn bộ thông tin các loại hàng
SELECT * FROM item_group;

-- 1B. Liệt kê loại hàng theo mã loại
SELECT * 
  FROM item_group
 WHERE ID = 3;
 
-- 1C. Thêm mới loại hàng
INSERT INTO item_group(ID, NAME)
VALUES(11, 'Loại Hàng 11');

-- 1D. Cập nhật loại hàng
UPDATE item_group
   SET NAME = ?
 WHERE ID = ?;

-- 1C. Test
SELECT * FROM item_group;

-- 1E. Liệt kê mã loại hàng theo tên
SELECT *
  FROM item_group 
 WHERE NAME = '...';
 
SELECT table_name FROM information_schema.tables
WHERE table_schema = 'java18_shopping';

-- 1F. Liệt kê các mặt hàng, thông tin trả về của mỗi mặt hàng gồm
--     Các tham số của mặt hàng, thông tin loại hàng
SELECT *
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
 WHERE itg.ID IN (1, 2, 5);
 
 
-- 1H. Liệt kê các mặt hàng(MATHANG) được bán trong ngày bất kì
SELECT odd.ORDER_ID,
		it.ID ITEM_ID,
	   it.`NAME` ITEM_NAME,	 
	  -- itd.SIZE_ID ITEM_SIZE_ID,       
       odd.AMOUNT,
       od.CREATE_AT
  FROM item it
  JOIN item_detail itd ON it.ID = itd.ITEM_ID
  JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od ON odd.ORDER_ID = od.ID
 WHERE CAST(od.CREATE_AT AS DATE) = '2023-08-12';
 
 
 SELECT distinct it.ID ITEM_ID, 
		it.`NAME` ITEM_NAME
   FROM item it 
   JOIN item_detail itd ON it.ID = itd.ITEM_ID 
   JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID 
   JOIN `order` od ON odd.ORDER_ID = od.ID 
  WHERE CAST(od.CREATE_AT AS DATE) = '2023-08-12';
  
 SELECT distinct it.ID ITEM_ID, 
		it.`NAME` ITEM_NAME
   FROM item it
  WHERE EXISTS (SELECT *
				FROM item_detail itd
                JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID 
				JOIN `order` od ON odd.ORDER_ID = od.ID 
				WHERE it.ID = itd.ITEM_ID 
				  AND CAST(od.CREATE_AT AS DATE) = '2023-08-12'
                );
                
                
-- 4. đăng ký tài khoản nhân viên 
INSERT INTO employee(EMAIL, PASSWORD, DEPARTMENT_ID)
VALUE('ussa2i8@gmail.com', 'admin781', 1);