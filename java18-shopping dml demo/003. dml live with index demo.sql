SELECT * FROM item;
-- INDEXES: PRIMARY, FK_ITEM_GROUP, FK_ITEM_PROVIDER

-- EXPLAIN PLAN: predication (dự đoán)

-- EXECUTION PLAN: in reality(thực tế)

-- INDEX: ID --> loop ONE time 


SELECT* FROM item WHERE ID = 1;

ALTER TABLE item ADD INDEX IDX_ITEM_NAME(`NAME`);

SELECT* FROM item WHERE `NAME` = 'Áo 1';

-- INDEX: default PK, FK
-- when we need add more index
-- + query with normal columns many times 