-- adjust pk columns for table `size`

ALTER TABLE `item_detail` DROP CONSTRAINT FK_ITEM_DETAIL_SIZE;

ALTER TABLE `item_detail` CHANGE SIZE_ID SIZE_ID INT;

ALTER TABLE `size` DROP CONSTRAINT CHK_SIZE_ID;

ALTER TABLE `size` CHANGE ID ID INT;

ALTER TABLE `size` DROP PRIMARY KEY, ADD PRIMARY KEY (ID);

ALTER TABLE `size` ADD SIZE VARCHAR(10) NOT NULL;

ALTER TABLE `size` ADD CONSTRAINT `CHK_SIZE` CHECK ((SIZE in ('S', 'M', 'L', 'XL', 'XXL', 'XXXL')));

ALTER TABLE `size` ADD CONSTRAINT UNIQUE_SIZE_GENDER UNIQUE(SIZE, GENDER);

ALTER TABLE `item_detail`
ADD CONSTRAINT FK_ITEM_DETAIL_SIZE FOREIGN KEY (SIZE_ID) REFERENCES `size` (ID)
ON DELETE RESTRICT
ON UPDATE RESTRICT;
