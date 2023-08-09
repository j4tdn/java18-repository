-- create n t n  relationship between item_detail & order


-- table : item_detail
-- step 1 : delete pK 
ALTER TABLE item_detail DROP PRIMARY KEY;
-- step 2 : create new column 'id' ->pk




-- step 1: delete FK order_detail -> item
-- step 2: create 



-- create n t n relationship between item_detail & order

DELETE FROM item_detail;

-- table: iteam 
ALTER TABLE item_detail DROP FOREIGN KEY FK_ITEM_DETAIL_ITEM;
ALTER TABLE item_detail DROP FOREIGN KEY FK_ITEM_DETAIL_SIZE;
ALTER TABLE item_detail DROP PRIMARY KEY;

-- step 1: delete FK order_detail to item 
ALTER TABLE item_detail DROP COLUMN ID;
ALTER TABLE item_detail ADD ID INT AUTO_INCREMENT FIRST;
ALTER TABLE item_detail 
	ADD CONSTRAINT PK_ITEM_DETAIL PRIMARY KEY (ID);
-- step 3 : create unikey constraint for item_id, size_id
ALTER TABLE item_detail 
	ADD CONSTRAINT UNQ_ITEM_SIZE UNIQUE (ITEM_ID, SIZE_ID);
-- step4 : refresh test data