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
 
 select * from `order`;
 
 -- 1F: Liệt kê các mặt hàng, thông tin trả về của mỗi mặt hàng gồm 
 --     Các tham số của mặt hàng, thông tin loại hàng của nó 
 SELECT * 
   FROM item it 
   JOIN item_group itg
     ON it.ITEM_GROUP_ID = itg.ID 
  WHERE itg.ID IN (1, 2, 5);
  
  select * from `order`;
  
  -- 1. Liệt kê các mặt hàng được bán trong ngày ...
  SELECT DISTINCT it.ID ITEM_ID,
         it.`NAME` ITEM_NAME,
         CAST(od.CREATE_AT AS TIME) ORDER_TIME
   FROM item it
   JOIN item_detail itd ON it.ID = itd.ITEM_ID
   JOIN order_detail odd ON odd.ITEM_DETAIL_ID = itd.ID
   JOIN `order` od ON itd.ID = od.ID
   WHERE CAST(od.CREATE_AT AS DATE) = '2023-09-09';
   
   -- reviewed
   SELECT it.ID ITEM_ID,
         it.`NAME` ITEM_NAME
   FROM item it
   WHERE EXISTS (SELECT *
				   FROM item_detail itd 
				   JOIN order_detail odd ON odd.ITEM_DETAIL_ID = itd.ID
				   JOIN `order` od ON od.ID = odd.ORDER_ID
				   WHERE it.ID = itd.ITEM_ID
                     AND CAST(od.CREATE_AT AS DATE) = '2023-09-09'
                     );
   
  
  -- 2. Đếm số lượng các mặt hàng của từng loại hàng
  
  -- reviewed
  SELECT ig.ID GROUP_ID,
         ig.`NAME` GROUP_NAME,
         GROUP_CONCAT(concat(it.`NAME`, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') ITEMS_LIST,
         SUM(itd.AMOUNT) AMOUNT_OF_ITEMS
	FROM item it 
	JOIN item_group ig ON it.ITEM_GROUP_ID = ig.ID
	JOIN item_detail itd ON it.ID = itd.ITEM_ID
    WHERE ig.ID IN (1, 2, 3, 4)
	GROUP BY ig.ID, ig.`NAME`;
  
  
  SELECT ig.ID ITEM_GROUP_ID,
         ig.`NAME` ITEM_GROUP_NAME,
         GROUP_CONCAT(concat(it.`NAME`, ' - ', s.GENDER, ' - ', s.SIZE, ' - ', id.AMOUNT)) LIST_OF_ITEMS,
         SUM(id.AMOUNT) TOTAL_AMOUNT
  FROM item it
  JOIN item_group ig 
  ON it.ITEM_GROUP_ID = ig.ID
  JOIN item_detail id
  ON it.ID = id.ITEM_ID
  JOIN size s
  ON id.SIZE_ID = s.ID
  GROUP BY ig.ID;
  
  -- 3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm ...
  SELECT it.ID ITEM_ID,
         it.`NAME`ITEM_NAME,
		 sum(itd.AMOUNT) TOTAL_AMOUNT,
         od.CREATE_AT
  FROM item it
   JOIN item_detail itd ON it.ID = itd.ITEM_ID
   JOIN order_detail odd ON odd.ITEM_DETAIL_ID = itd.ID
   JOIN `order` od ON itd.ID = od.ID
  WHERE year(od.CREATE_AT) = 2023
  GROUP BY ITEM_ID
  ORDER BY itd.AMOUNT DESC
  LIMIT 3;
  
SELECT it.ID AS ITEM_ID,
       it.`NAME` AS ITEM_NAME,
       SUM(itd.AMOUNT) AS TOTAL_AMOUNT
  FROM item it
  JOIN item_detail itd ON it.ID = itd.ITEM_ID
  JOIN order_detail odd ON odd.ITEM_DETAIL_ID = itd.ID
  JOIN `order` od ON itd.ID = od.ID
  WHERE YEAR(od.CREATE_AT) = 2023
  GROUP BY ITEM_ID, ITEM_NAME
  ORDER BY TOTAL_AMOUNT DESC
  LIMIT 3;
  
SELECT it.`NAME` AS ITEM_NAME
	FROM (
	  SELECT it.ID AS ITEM_ID
	  FROM item it
	  JOIN item_detail itd ON it.ID = itd.ITEM_ID
	  JOIN order_detail odd ON odd.ITEM_DETAIL_ID = itd.ID
	  JOIN `order` od ON itd.ID = od.ID
	  WHERE YEAR(od.CREATE_AT) = 2023
	  GROUP BY ITEM_ID
	  ORDER BY SUM(itd.AMOUNT) DESC
	  LIMIT 3
	) top_items
	JOIN item it ON top_items.ITEM_ID = it.ID;


  
  select * from `order`;
  
  -- 4. tìm mặt hàng có giá bán cao nhất của mỗi loại hàng. 
  -- Nếu các mặt hàng trong cùng loại hàng có giá bán cao nhất và bằng nhau thì hiển thị tất cả mặt hàng đó
  
 WITH ITEM_GROUP_MAX_PRICE AS (
SELECT ig.ID ITEM_GROUP_ID,
       it.`NAME`,
	   max(id.SELL_PRICE) MAX_PRICE_IN_GROUP
FROM item it 
JOIN item_group ig ON it.ITEM_GROUP_ID = ig.ID
JOIN item_detail id ON it.ID = id.ITEM_ID
GROUP BY ig.ID, it.`NAME`
)
SELECT it.ID,
       it.`NAME`,
       it.COLOR,
       id.SELL_PRICE,
       it.ITEM_GROUP_ID
FROM item it 
JOIN item_detail id ON it.ID = id.ITEM_ID
JOIN ITEM_GROUP_MAX_PRICE igm ON it.ITEM_GROUP_ID = igm.ITEM_GROUP_ID
 AND id.SELL_PRICE = igm.MAX_PRICE_IN_GROUP;
 
 -- DEMO TRÊN LỚP
 -- 4. Đăng ký, đăng nhập tài khoản nhân viên 
 INSERT INTO employee(EMAIL, PASSWORD, DEPARTMENT_ID)
 VALUES('maymay2105@gmail.com', '12345', 1);
 
 select * from item ;
 
 