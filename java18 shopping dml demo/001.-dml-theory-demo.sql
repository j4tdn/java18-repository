-- DML THEORY SELECT DEMO --
use java18_shopping;
SELECT * FROM item_detail;

SELECT ITEM_ID,
	   SIZE_ID,
       AMOUNT AMOUNT_OF_ITEM, -- AS(alias)
       SELL_PRICE,
       FORMAT(SELL_PRICE * 0.9, 2) PROMOTION_PRICE 
  FROM item_detail;

SELECT * 
  FROM item_detail
 where SELL_PRICE >= 120 AND SELL_PRICE <= 400;
 
 SELECT * 
  FROM item_detail
 where SELL_PRICE BETWEEN 120 AND 400; -- inclusive
 
 -- '%content' --> endWith
 -- 'content%' --> startWith
 -- '%content%' --> contains
 
 SELECT *
   FROM `order`
  WHERE DELIVERY_ADDRESS LIKE '%địa chỉ%';
  
  SELECT * FROM payment_method;
  -- Liệt kê các đơn hàng được thanh toán bằng thẻ tín dụng, thẻ ghi nợ
  -- kết quả: Hiển thị tất cả các collumns trong bảng đơn hàng
  -- Lưu ý: Chỉ sử dụng JOIN khi liệt kê các columns xuất hiện ở các tables muốn JOINS
  -- 	Tránh loop, get dữ liệu không cần thiết ở các table
  -- input, condition: thẻ tín dụng, ghi nợ
  -- input --> payment_method_id
  -- sub query (truy vấn con --> trong 1 câu lệnh xuất hiện 1 câu lệnh truy vấn khác)
  -- insert, select
  -- 	select(sub query)
  -- sub query IN clause
  -- --> sub query sẽ chạy trước được kết quả rồi dùng cho main query

  -- sub query with EXISTS clause
  -- --> sub query sẽ chạy song song với 
  SELECT *
	FROM `order`
	WHERE PAYMENT_METHOD_ID IN (SELECT ID
								FROM payment_method
								WHERE `DESC` IN ('Thẻ tín dụng', 'Thẻ ghi nợ'));

SELECT *
  FROM `order`
 WHERE PAYMENT_METHOD_ID IN (SELECT ID
								FROM payment_method
								WHERE `DESC` IN ('Thẻ tín dụng', 'Thẻ ghi nợ'));
                                
SELECT *
  FROM `order`
 WHERE EXISTS (SELECT 1 -- *
				FROM payment_method
				WHERE `DESC` IN ('Thẻ tín dụng', 'Thẻ ghi nợ')
                AND payment_method.ID = `order`.PAYMENT_METHOD_ID);
	
    
CREATE TABLE INT_ARRAY(
	VAL INT NOT NULL,
    CONSTRAINT PK_INT_ARRAY PRIMARY KEY (VAL)
);

DELIMITER $$
CREATE PROCEDURE refreshIntArray(n int)
BEGIN
	-- declare variables
	DECLARE i INT DEFAULT 1; -- int i = 1
    
    -- implementation
    DELETE FROM INT_ARRAY;
    WHILE i <= n DO
		INSERT INTO INT_ARRAY(VAL) VALUES(i);
		SET i = i + 1;
	END WHILE;
END
DELIMITER $$ ;

SELECT * FROM INT_ARRAY;

CALL refreshIntArray(2000);

SELECT *
  FROM ITEM
 WHERE ID IN (SELECT VAL FROM INT_ARRAY);
 
 
-- demo 'order by'
-- sắp xếp các mặt hàng tăng dần theo giá bán 
-- sort items by item group asc, id desc

SELECT *
 FROM item
 ORDER BY ITEM_GROUP_ID, ID DESC  ;
 
 -- DEMO 'GROUP BY','HAVING'
 -- THỐNG KÊ THEO NGÀY CÁC ĐƠN HÀNG ĐƯỢC BÁN TRONG THÁNG 10 NĂM 2023
 SELECT  * 
 FROM `ORDER`
 WHERE YEAR (DELIVERY_DATE) =2023 AND MONTH (DELIVERY_DATE) = 10;
 
 -- COUNT(*) ĐẾM SỐ DÒNG TRONG BẢNG ,TRONG NHÓM NẾU CÓ GROUP BY
 -- COUNT(COLUMN): DUYỆT TỪNG DÒNG DỮ LIỆU TRONG BẢNG ,NẾU DÒNG ĐÓ CÓ COLUMN VALUE != NULL T,COUNT++
 -- COUNT(

 SELECT  DELIVERY_DATE,COUNT(DELIVERY_DATE)  `AMOUNT _OF_ORDER`
 FROM `ORDER`
 WHERE YEAR (DELIVERY_DATE) =2023 AND MONTH (DELIVERY_DATE) = 10
 GROUP BY DELIVERY_DATE 
 HAVING `AMOUNT _OF_ORDER` > 2
 ORDER BY `AMOUNT _OF_ORDER`;
 
 -- DEMO JOIN
 -- ĐIỀU KIỆN:2 BẢNG PHẢI CÓ LIÊN KẾT TRỰC TIẾP VỚI NHAU (11,1N,NN) THÔNG QUA LIÊN KẾT KHÓA NGOẠI 
		--    2 BẢNG CÓ LIÊN KẾT VỚI NHAU THÔNG QUA [CÁC] BẢNG TRUNG GIAN (N,N)
 -- NÊN ĐẶT BẢNG CÓ ROWS ÍT NẰM BÊN TRÁI
	SELECT * FROM PAYMENT_METHOD;
    SELECT * FROM `ORDER`	;
    
    SELECT od.*,pm.`Desc` 
    FROM `ORDER` od JOIN PAYMENT_METHOD pm
    ON pm.ID == od.PAYMENT_METHOD_ID;
    
	SELECT *
     FROM `ORDER` od 
     RIGHT JOIN  PAYMENT_METHOD pm
     ON pm.ID == od.PAYMENT_METHOD_ID;
	SELECT *
     FROM PAYMENT_METHOD pm
     LEFT JOIN  `ORDER` od
     ON pm.ID == od.PAYMENT_METHOD_ID;
    
-- INSERT,DELETE,UPDATE    
-- COMMIT ,ROLLBACK(DML)
-- DEFAULT AUTO COMMIT = TRUE: KHI THỰC HIỆN 1 CÂU LỆNH DATABASE SẼ TỰ ĐỘNG COMMIT, LƯU KẾT QUẢ VÀO CSDL(MEMORY)
-- SET AUTO COMMIT = FALSE :KHI THỰC HIỆN 1 CÂU LỆNH DATABASE SẼ LƯU THAY ĐỔI VÀO STAGED
					-- COMMIT --> LƯU VÀO CSDL
                    -- ROLLBACK --> TRỞ VỀ DỮ LIỆU TRƯỚC KHI THỰC HIỆN LỆNH
 SET AUTOCOMMIT = 0                   
SELECT * FROM BILL; -- 10
DELETE FROM BILL WHERE ID = 6;
COMMIT;
ROLLBACK ;
 
