-- when create a new procedure, function
-- resue, aoid duplicated sql code

-- procudure: return void
-- fuction: return value(exception table[mysql])
-- Viết phương thức liệt kê các mặt hàng theo loại hàng
DELIMITER $$
CREATE PROCEDURE getItems(pIgId INT)
BEGIN
	SELECT * FROM item WHERE ITEM_GROUP_ID = pIgId;
END $$
DELIMITER ;

CALL getItems(2);

-- Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng
DELIMITER $$
CREATE PROCEDURE addNewItemGroups(N INT)
BEGIN
	DECLARE MAX_ID INT DEFAULT (SELECT MAX(ID) FROM ITEM_GROUP);
    DECLARE i INT DEFAULT 1;
    
    WHILE i < N DO
		INSERT INTO item_group(ID, `NAME`)
        VALUES(MAX_ID + i, concat('Loại hàng ', (MAX_ID + i)));
        SET i = i + 1;
    END WHILE;
END $$
DELIMITER ;

CALL addNewItemGroups(3);
SELECT * FROM item_group;