-- 1A. Liệt kê
SELECT * FROM item_group

-- 1B
SELECT * 
FROM item_group
WHERE ID = 3

-- 1D: Cật nhật loại hàng
UPDATE item_group
	SET `NAME` = ?
    WHERE ID = ?
    
-- 1F:
SELECT *
  FROM item it
  JOIN item_group itg
    ON it.ITEM_GROUP_ID = itg.ID
 WHERE itg.ID IN (%s);