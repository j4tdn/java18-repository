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
 WHERE itg.ID IN (1,2,5);
 
-- 1H. Liệt kê các mặt hàng(MatHang) được bán trong ngày bất kì
SELECT * FROM `ORDER`;
SELECT odd.ORDER_ID,
	   it.ID ITEM_ID,
       it.`NAME` ITEM_NAME,
       -- itd.SIZE_ID ITEM_SIZE_ID,
       odd.AMOUNT,
       od.CREATED_AT
  FROM item it
  JOIN item_detail itd ON it.ID = itd.ITEM_ID
  JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od ON odd.ORDER_ID = od.ID
 WHERE CAST(od.CREATED_AT AS DATE) = '2023-02-15';
 
 SELECT DISTINCT it.ID ITEM_ID,
        it.`NAME` ITEM_NAME
  FROM item it
  JOIN item_detail itd ON it.ID = itd.ITEM_ID
  JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od ON odd.ORDER_ID = od.ID
 WHERE CAST(od.CREATED_AT AS DATE) = '2023-07-09';
 
 SELECT it.ID ITEM_ID,
        it.`NAME` ITEM_NAME
   FROM item it
  WHERE EXISTS (SELECT 43
                 FROM item_detail itd
                 JOIN order_detail odd ON itd.ID = odd.ITEM_DETAIL_ID
				 JOIN `order` od ON odd.ORDER_ID = od.ID
				WHERE it.ID = itd.ITEM_ID 
                  AND CAST(od.CREATED_AT AS DATE) = '2023-07-09'
               );
               
-- 2. Đếm số lượng các mặt hàng theo từng loại hàng live sql dml demo c16
SELECT ig.ID GROUP_ID,
       ig.NAME GROUP_NAME,
       SUM(itd.AMOUNT) AMOUNT_OF_ITEMS,
       GROUP_CONCAT(concat(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') ITEM_LIST
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN ITEM_GROUP ig
    ON it.ITEM_GROUP_ID = ig.ID
  GROUP BY ig.ID, ig.NAME;
  
  
  
  -- test
  select ig.id,
 ig.name,
 GROUP_CONCAT(concat( i.`NAME`, ' - ', idt.SIZE_ID, ' - ', idt.AMOUNT)) DETAIL,
 sum(amount) from item_group ig
	left join item i
	on ig.id = i.ITEM_GROUP_ID
    join item_detail idt
    on i.id = idt.ITEM_ID
    group by ig.id