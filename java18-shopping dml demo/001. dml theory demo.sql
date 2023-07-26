-- DML THEORY SELECT DEMO --
SELECT * FROM item_detail;

SELECT round(22.3786, 2) ROUND_METHOD;
SELECT round(22.3, 2) ROUND_METHOD;

SELECT format(22.3786, 2) FORMAT_METHOD;
SELECT format(22.3, 2) FORMAT_METHOD;

SELECT truncate(22.3786, 2) TRUNCATE_METHOD;

SELECT ITEM_ID,
       SIZE_ID,
       AMOUNT AMOUNT_OF_ITEM, -- AS(alias)
       SELL_PRICE,
       format(SELL_PRICE * 0.9, 2) PROMOTION_PRICE
  FROM item_detail;

SELECT *
  FROM item_detail
 WHERE SELL_PRICE >= 120 AND SELL_PRICE <= 400;
 
SELECT *
  FROM item_detail
 WHERE SELL_PRICE BETWEEN 120 AND 400; -- inclusive

-- '%content'  --> endsWith
-- 'content%'  --> statrsWith
-- '%content%' --> contains

SELECT *
  FROM `order`
 WHERE DELIVERY_ADDRESS LIKE '%địa chỉ%';
 
SELECT * FROM payment_method;
-- Liệt kê các đơn hàng được thanh toán bằng thẻ tín dụng, thẻ ghi nợ
-- Kết quả: Hiển thị tất các columns trong bảng đơn hàng
-- Lưu ý: Chỉ sử dụng JOIN khi liệt các columns xuất hiện ở các tables mình cần JOIN
--        Tránh loop, get dữ liệu không cần thiết ở các table

-- input, condition: thẻ tín dụng, ghi nợ
-- input --> payment_method_id

-- sub query (truy vấn con)
-- khái niệm: là 1 câu lệnh(sub) SELECT xuất hiện 1 câu lệnh truy vấn(main) khác
-- insert, select
--   select(sub query)

-- sub query with IN clause 
-- --> sub query sẽ chạy trước được kết quả rồi dùng cho main query

-- sub query with EXISTS clause
-- --> sub query sẽ chạy song song với main query
SELECT *
  FROM `order`
 WHERE PAYMENT_METHOD_ID IN (SELECT ID
							   FROM payment_method
							  WHERE `DESC` IN ('thẻ tín dụng', 'thẻ ghi nợ'));
				
SELECT *
  FROM `order`
 WHERE EXISTS (SELECT 1 -- *
			     FROM payment_method
			    WHERE `DESC` IN ('thẻ tín dụng', 'thẻ ghi nợ')
                  AND payment_method.ID = `order`.PAYMENT_METHOD_ID);
                  

-- DIFF BETWEEN 'IN' AND 'EXISTS'
-- INT_ARRAY: VAL
CREATE TABLE INT_ARRAY(
	VAL INT NOT NULL,
    CONSTRAINT PK_INT_ARRAY PRIMARY KEY (VAL)
);


-- TẠO HÀM: function(return), procedure(void)
DELIMITER $$
CREATE PROCEDURE refreshIntArray(n int)
BEGIN
	-- body
    
    -- declare variables
    DECLARE i INT DEFAULT 1; -- int i = 1
    
    -- implementation
    DELETE FROM INT_ARRAY;
    WHILE i <= n DO
		INSERT INTO INT_ARRAY(VAL) VALUES(i);
		SET i = i + 1;
	END WHILE;
END
DELIMITER $$;

SELECT * FROM INT_ARRAY;
SELECT COUNT(VAL) FROM INT_ARRAY;

CALL refreshIntArray(1868);

-- items --> 14 rows, 14 ids [1, 14]
SELECT *
  FROM item
 WHERE ID IN (SELECT VAL FROM INT_ARRAY);
 
-- IN     --> M --> k O(M + N*k) --> tốt khi k nhỏ
-- EXISTS --> O(M * N) --> tốt khi k lớn


-- DEMO `ORDER BY`
-- Sort items by sellPrice asc, id desc
SELECT * 
	FROM item
	ORDER BY ITEM_GROUP_ID,ID DESC;
    
-- DEMO `GROUP BY, HAVING`
-- THỐNG KÊ THEO NGÀY CÁC ĐƠN HÀNG ĐƯỢC GIAO TRONG THÁNG 10 NĂM 2023
-- B1: TÌM CÁC ĐƠN HÀNG ĐƯỢC BÁN TRONG THÁNG 10/2023
-- B2: GOM NHÓM CÁC ĐƠN HÀNG THEO TỪNG NGÀY
SELECT DELIVERY_DATE, COUNT(*) ABC FROM `ORDER`
	WHERE YEAR(DELIVERY_DATE) = 2023
    AND MONTH(DELIVERY_DATE) = 10
     GROUP BY DELIVERY_DATE;
    
-- COUNT(*): ĐẾM SỐ DÒNG TRONG THÁNG, TRONG NHÓM NẾU CÓ GROUP
-- COUNT(COLUMN) : DUYỆT TỪNG DÒNG TRONG BẢNG, NẾU CÓ DÒNG COLUMN VALUE != NULL, COUNT++
-- COUNT(COLUMN NON-NUNABLE) = COUNT(*)
SELECT DELIVERY_DATE, COUNT(*) AMOUNT_OF_ORDER
  FROM `ORDER`
 WHERE YEAR(DELIVERY_DATE) = 2023
   AND MONTH(DELIVERY_DATE) = 10
   GROUP BY DELIVERY_DATE
HAVING AMOUNT_OF_ORDER > 2
 GROUP BY AMOUNT_OF_ORDER;
 
 -- DEMO JOIN
 -- ĐK: 2 BẢNG PHẢI CÓ LIÊN KẾT TRỰC TIẾP VỚI NHAU(11, 1N, N1) THÔNG QUA KHOÁ NGOẠI
 -- 	2 BẢNG CÓ LIÊN KẾT VỚI NHAU THÔNG QUA [CÁC] BẢNG TRUNG GIAN(N,N)
 -- NÊN ĐẶT BẢNG CÓ ROWS ÍT HƠN NẰM BÊN TRÁI
 SELECT * FROM PAYMENT_METHOD;
 SELECT * FROM `ORDER`;
 SELECT od.*,
		pm.`DESC`
	FROM `ORDER` od
	JOIN PAYMENT_METHOD pm
	ON pm.ID = od.PAYMENT_METHOD_ID;
    
SELECT * 
	FROM `ORDER` od
	LEFT JOIN PAYMENT_METHOD pm
	ON pm.ID = od.PAYMENT_METHOD_ID
        
-- commit, rollbak
-- default: khi thực hiện 1 câu lệnh db sẽ tự động commit, lưu cà csdl
-- set auto commit = false: khi thực hiện 1 câu lệnh, db sẽ lưu thay đổi vào staged
-- 					COMMIT --> lưu vào db
-- 					ROLLBACK --> trở về dữ liệu khi thực hiện lệnh
SET AUTOCOMMIT = 1;
SELECT * FROM BILL;


	
    