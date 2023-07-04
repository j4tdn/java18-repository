-- adjust pk columns for table 'size'
-- ITEM_DETAIL size_id(fk) refs SIZE(id) --> required: fk must ref to pk(index)
-- error: 10:37:09	ALTER TABLE `size` DROP PRIMARY KEY	Error Code: 1553. Cannot drop index 'PRIMARY': needed in a foreign key constraint	0.000 sec
-- error: 10:42:46	ALTER TABLE `item_detail`  ADD CONSTRAINT FK_ITEM_DETAIL_SIZE FOREIGN KEY (SIZE_ID) REFERENCES `size`(ID) ON DELETE RESTRICT ON UPDATE RESTRICT	Error Code: 1822. Failed to add the foreign key constraint. Missing index for constraint 'FK_ITEM_DETAIL_SIZE' in the referenced table 'size'	0.000 sec
-- CONSTRAINT `CHK_SIZE_ID` CHECK ((`ID` in (_utf8mb4'S',_utf8mb4'M',_utf8mb4'L',_utf8mb4'XL',_utf8mb4'XXL',_utf8mb4'XXXL')))
-- if exist

ALTER TABLE `item_detail` DROP CONSTRAINT FK_ITEM_DETAIL_SIZE;

ALTER TABLE `item_detail` CHANGE SIZE_ID SIZE_ID INT;

ALTER TABLE `size` DROP CONSTRAINT CHK_SIZE_ID;

ALTER TABLE `size` CHANGE ID ID INT;

ALTER TABLE `size` DROP PRIMARY KEY, ADD PRIMARY KEY (ID);

ALTER TABLE `size` ADD SIZE VARCHAR(10) NOT NULL;

ALTER TABLE `size` ADD CONSTRAINT `CHK_SIZE` CHECK ((SIZE in ('S', 'M', 'L', 'XL', 'XXL', 'XXXL')));

ALTER TABLE `size` ADD CONSTRAINT UNIQUE_SIZE_GENDER UNIQUE(SIZE, GENDER);

ALTER TABLE `item_detail` 
ADD CONSTRAINT FK_ITEM_DETAIL_SIZE FOREIGN KEY (SIZE_ID) REFERENCES `size`(ID)
ON DELETE RESTRICT
ON UPDATE RESTRICT;

