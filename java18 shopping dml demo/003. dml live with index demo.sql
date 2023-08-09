use java18_shopping;
SELECT * from item;

-- PRIMARY FK_ITEM_ITEM_GROUP FK_ITEM_PROVIDER
-- EXPLAIN PLAN: predication(dự đoán)
-- EXECUTION PLAN: in reality(thực tế)
-- 	id	select_type	table	partitions	type	possible_keys	key	key_len	ref	rows	filtered	Extra 
-- 	1	SIMPLE	item		const	PRIMARY	PRIMARY	4	const	1	100.00	
-- 	id	select_type	table	partitions	type	possible_keys	key	key_len	ref	rows	filtered	Extra
-- 	1	SIMPLE	item		ALL					14	10.00	Using where
-- index :ID --> loop One Time
-- full table scan khi query ở column name before add index cho column này

-- interview hay hỏi + nên đọc thêm lý thuyết phần này
 SELECT * from item where id = 7;
Alter table item
add INDEX idx_item_name (name);
 SELECT * from item where name = "Mũ 2";

-- index default PK,FK
-- when we need to add more index
-- + query with normal  column many  times & encounter performance issue
-- + relate to database


