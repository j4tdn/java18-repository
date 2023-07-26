-- create n-n relationship between item_detail & order

-- table: item_detail

-- step 1: delete primary key
ALTER TABLE item_detail DROP FOREIGN KEY FK_ITEM_DETAIL_ITEM;
ALTER TABLE item_detail DROP FOREIGN KEY FK_ITEM_DETAIL_SIZE;
ALTER TABLE item_detail DROP PRIMARY KEY;

-- step 2: create new column 'id' --> primary key
ALTER TABLE item_detail DROP COLUMN ID;
ALTER TABLE item_detail ADD ID INT FIRST;

ALTER TABLE item_detail ADD CONSTRAINT PK_ITEM_DETAIL PRIMARY KEY (ID); 
ALTER TABLE item_detail CHANGE ID ID INT AUTO_INCREMENT; 

-- step 3: create unique constraint for item_id, size_id
ALTER TABLE item_detail
ADD CONSTRAINT UNQ_ITEM_SIZE UNIQUE(ITEM_ID, SIZE_ID);

-- step 4: refresh test data
-- ID: AUTO INCREMENT
--   : SEQUENCE --> project
--   : MANUAL
INSERT INTO `item_detail`(ITEM_ID, SIZE_ID, AMOUNT, BUY_PRICE, SELL_PRICE)
WITH ITEM_DETAIL_MOCKED_DATA AS (
	-- Đơn hàng lẻ và Kích thước lẻ
	SELECT item.ID ITEM_ID,
		   size.ID SIZE_ID,
		   100 AMOUNT,
		   200 - size.ID * 5 BUY_PRICE,
		   200 + size.ID * 10 SELL_PRICE
	  FROM `item`, `size`
	 WHERE  MOD(item.ID, 2) = 1 AND MOD(size.ID, 2) = 1
	 -- ORDER BY item.ID, size.ID;

	UNION

	 -- Đơn hàng chẵn và Kích thước chẵn
	SELECT item.ID ITEM_ID,
		   size.ID SIZE_ID,
		   120 AMOUNT,
		   300 - size.ID * 8 BUY_PRICE,
		   300 + size.ID * 8 + 20 SELL_PRICE
	  FROM `item`, `size`
	 WHERE  MOD(item.ID, 2) = 0 AND MOD(size.ID, 2) = 0
	 -- ORDER BY item.ID, size.ID;
)
SELECT * FROM ITEM_DETAIL_MOCKED_DATA
ORDER BY ITEM_ID, SIZE_ID;


-- table: order_detail

-- step 1: delete FK order_detail to item, order, delete PK
ALTER TABLE order_detail DROP FOREIGN KEY FK_ORDER_DETAIL_ITEM;
ALTER TABLE order_detail DROP FOREIGN KEY FK_ORDER_DETAIL_ORDER;
ALTER TABLE order_detail DROP PRIMARY KEY;

-- step 2: delete column 'item_id'
ALTER TABLE order_detail DROP COLUMN ITEM_ID;

-- step 3: create new column 'item_detail_id' after 'order_id'
ALTER TABLE order_detail ADD ITEM_DETAIL_ID INT AFTER ORDER_ID;

--         add FK to table ITEM_DETAIL
ALTER TABLE order_detail
ADD CONSTRAINT FK_ORDER_DETAIL_ITEM_DETAIL FOREIGN KEY (ITEM_DETAIL_ID) REFERENCES item_detail(ID);

--         refersh test data for new column 'item_detail_id' -- item_deail.id(1-70)
SELECT MIN(ID) FROM ITEM_DETAIL;
SELECT MAX(ID) FROM ITEM_DETAIL;

UPDATE ORDER_DETAIL
SET ITEM_DETAIL_ID = randInt(1, 70);

--         add PK for (ORDER_ID, ITEM_DETAIL_ID)
ALTER TABLE order_detail ADD CONSTRAINT PK_ORDER_DETAIL PRIMARY KEY (ORDER_ID, ITEM_DETAIL_ID); 

