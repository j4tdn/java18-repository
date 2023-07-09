-- disable all fks
SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO delivery_status(ID, `DESC`)
VALUES(1, 'Chờ xác nhận'),
	  (2, 'Xác nhận thành công'),
      (3, 'Đang đóng gói'),
      (4, 'Đóng gói thành công'),
      (5, 'Đang giao hàng'),
      (6, 'Giao hàng thành công'),
      (7, 'Hủy đơn hàng'), -- người dùng hủy đơn hàng
      (8, 'Giao hàng thất bại'); -- giao không thành công

INSERT INTO `item_group`(ID, `NAME`)
VALUES(1, 'Áo'),
      (2, 'Quần'),
      (3, 'Giày'),
      (4, 'Dép'),
      (5, 'Mũ'),
      (6, 'Thắt lưng');

INSERT INTO `provider`(ID, `NAME`, TAX_CODE, ADDRESS, PHONE)
SELECT 1, 'Nhà cung cấp 1', 1111, 'Địa chỉ 1A', '11119999' UNION
SELECT 2, 'Nhà cung cấp 2', 2222, 'Địa chỉ 2A', '22229999' UNION
SELECT 3, 'Nhà cung cấp 3', 3333, 'Địa chỉ 3A', '33339999' UNION
SELECT 4, 'Nhà cung cấp 4', 4444, 'Địa chỉ 4A', '44449999' UNION
SELECT 5, 'Nhà cung cấp 5', 5555, 'Địa chỉ 5A', '55559999';

INSERT INTO `department`
VALUES(1, 'Bộ phận nhân sự'),
	  (2, 'Bộ phận bán hàng'),
      (3, 'Bộ phận giao hàng'),
      (4, 'Bộ phận giảm sát'),
      (5, 'Bộ phận quảng cáo');

INSERT INTO `title`(ID, `NAME`, `DESC`, STIPEND)
WITH titles AS (
	SELECT 1 AS ID, 'Giám Đốc' AS `NAME`, 'Giám Đốc' AS `DESC`, 10 AS STIPEND UNION
    SELECT 2, 'Phó Giám Đốc',       'Phó Giám Đốc',       6 UNION
    SELECT 3, 'Quản Lý',            'Quản Lý',            4 UNION
    SELECT 4, 'Nhân Viên Fulltime', 'Nhân Viên Fulltime', 2 UNION
    SELECT 5, 'Nhân Viên Parttime', 'Nhân Viên Parttime', 1
)
SELECT * FROM titles;

INSERT INTO `payment_method`(ID, `DESC`)
VALUES(1, 'Tiền mặt'),
	  (2, 'Thẻ tín dụng'), -- credit card
      (3, 'Thẻ ghi nợ'); -- debit card

INSERT INTO `size`(ID, SIZE, GENDER, `DESC`)
VALUES(1,  'S',   0, 'Mô tả: S Nữ chi tiết ...'),
	  (2,  'S',   1, 'Mô tả: S Nam chi tiết ...'),
      (3,  'M',   0, 'Mô tả: M Nữ chi tiết ...'),
      (4,  'M',   1, 'Mô tả: M Nam chi tiết ...'),
      (5,  'L',   0, 'Mô tả: L Nữ chi tiết ...'),
      (6,  'L',   1, 'Mô tả: L Nam chi tiết ...'),
      (7,  'XL',  0, 'Mô tả: XL Nữ chi tiết ...'),
      (8,  'XL',  1, 'Mô tả: XL Nam chi tiết ...'),
      (9,  'XXL', 0, 'Mô tả: XXL Nữ chi tiết ...'),
      (10, 'XXL', 1, 'Mô tả: XXL Nam chi tiết ...');

INSERT INTO `customer`(ID, `NAME`, DATE_OF_BIRTH, ADDRESS, PHONE, GENDER, EMAIL, `PASSWORD`)
VALUES(1, 'Susan',  str_to_date('14.10.1975', '%d.%m.%Y'), 'Hòa Khánh Nam', '123456789', 0, 'susan@gmail.com',  '12345678'),
	  (2, 'Smith',  str_to_date('12.07.1999', '%d.%m.%Y'), 'Hòa Châu', '123456789', 1, 'smith@gmail.com',  '12345678'),
      (3, 'Henry',  str_to_date('10.01.1988', '%d.%m.%Y'), 'Hải Châu 1', '123456789', 1, 'henry@gmail.com',  '12345678'),
      (4, 'Pepe',   str_to_date('22.05.2002', '%d.%m.%Y'), 'Hòa Hiệp Bắc', '123456789', 1, 'pepe@gmail.com',   '12345678'),
      (5, 'Carlos', str_to_date('28.08.1992', '%d.%m.%Y'), 'Hòa Minh', '123456789', 0, 'carlis@gmail.com', '12345678');

INSERT INTO `order`(ID, DELIVERY_ADDRESS, TOTAL_FEE, DELIVERY_DATE, DELIVERY_FEE, CREATED_AT, CUSTOMER_ID, PAYMENT_METHOD_ID)
VALUES(1, 'Địa chỉ 1',   0,  str_to_date('10.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 1, 1),
      (2, 'Địa chỉ 2',   0,  str_to_date('10.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 2, 1),
      (3, 'Địa chỉ 3',   0,  str_to_date('10.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 3, 1),
      (4, 'Địa chỉ 4',   0,  str_to_date('12.10.2023', '%d.%m.%Y'), 30, current_timestamp(), 4, 2),
      (5, 'Địa chỉ 5',   0,  str_to_date('12.10.2023', '%d.%m.%Y'), 30, current_timestamp(), 2, 3),
      (6, 'Địa chỉ 6',   0,  str_to_date('14.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 5, 1),
      (7, 'Địa chỉ 7',   0,  str_to_date('14.10.2023', '%d.%m.%Y'), 40, current_timestamp(), 1, 2),
      (8, 'Địa chỉ 8',   0,  str_to_date('16.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 2, 3),
      (9, 'Địa chỉ 9',   0,  str_to_date('16.10.2023', '%d.%m.%Y'), 50, current_timestamp(), 3, 3),
      (10, 'Địa chỉ 10', 0,  str_to_date('18.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 5, 2),
      (11, 'Địa chỉ 11', 0,  str_to_date('18.10.2023', '%d.%m.%Y'), 10, current_timestamp(), 4, 2), -- demo cancel order
      (12, 'Địa chỉ 12', 0,  str_to_date('18.10.2023', '%d.%m.%Y'), 20, current_timestamp(), 3, 1); -- demo cancel order

INSERT INTO `bill`(ID, CREATED_AT, ORDER_ID)
VALUES(1,  current_timestamp(), 1),
      (2,  current_timestamp(), 2),
      (3,  current_timestamp(), 3),
      (4,  current_timestamp(), 4),
      (5,  current_timestamp(), 5),
      (6,  current_timestamp(), 6),
      (7,  current_timestamp(), 7),
      (8,  current_timestamp(), 8),
      (9,  current_timestamp(), 9),
      (10, current_timestamp(), 10);

INSERT INTO `employee`(ID, `NAME`, DATE_OF_BIRTH, ADDRESS, PHONE, GENDER, EMAIL, `PASSWORD`, DEPARTMENT_ID)
VALUES(1, 'Nhân viên A', str_to_date('18.10.2001', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 0, 'nhanviena@gmail.com', '12345678', 1),
      (2, 'Nhân viên B', str_to_date('12.10.2002', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 1, 'nhanvienb@gmail.com', '12345678', 1),
      (3, 'Nhân viên C', str_to_date('14.04.2003', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 1, 'nhanvienc@gmail.com', '12345678', 2),
      (4, 'Nhân viên D', str_to_date('22.11.2001', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 1, 'nhanviend@gmail.com', '12345678', 3),
      (5, 'Nhân viên E', str_to_date('08.06.2001', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 0, 'nhanviene@gmail.com', '12345678', 2),
      (6, 'Nhân viên F', str_to_date('10.10.2002', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 0, 'nhanvienf@gmail.com', '12345678', 2),
      (7, 'Nhân viên G', str_to_date('19.07.2001', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 1, 'nhanvieng@gmail.com', '12345678', 4),
      (8, 'Nhân viên K', str_to_date('27.02.2005', '%d.%m.%Y'), 'Đà Nẵng', '123456789', 0, 'nhanvienk@gmail.com', '12345678', 5);

INSERT INTO `item`(ID, `NAME`, COLOR, MATERIAL, IMAGE_01, IMAGE_02, LAST_UPDATED_AT, ITEM_GROUP_ID, PROVIDER_ID)
VALUES(1,  'Áo 1',        'Trắng', 'Chất Liệu 1', 'default.png', 'default.png', current_timestamp(), 1, 1),
      (2,  'Áo 2',        'Đen',   'Chất Liệu 2', 'default.png', 'default.png', current_timestamp(), 1, 1),
      (3,  'Giày 1',      'Trắng', 'Chất Liệu 3', 'default.png', 'default.png', current_timestamp(), 3, 2),
      (4,  'Giày 2',      'Đen',   'Chất Liệu 4', 'default.png', 'default.png', current_timestamp(), 3, 2),
      (5,  'Giày 3',      'Trắng', 'Chất Liệu 1', 'default.png', 'default.png', current_timestamp(), 3, 3),
      (6,  'Mũ 1',        'Đen',   'Chất Liệu 2', 'default.png', 'default.png', current_timestamp(), 5, 1),
      (7,  'Mũ 2',        'Trắng', 'Chất Liệu 3', 'default.png', 'default.png', current_timestamp(), 5, 2),
      (8,  'Dép 1',       'Đen',   'Chất Liệu 4', 'default.png', 'default.png', current_timestamp(), 4, 3),
      (9,  'Mũ 3',        'Trắng', 'Chất Liệu 5', 'default.png', 'default.png', current_timestamp(), 5, 3),
      (10, 'Thắt lưng 1', 'Đen',   'Chất Liệu 2', 'default.png', 'default.png', current_timestamp(), 6, 3),
      (11, 'Thắt lưng 2', 'Trắng', 'Chất Liệu 2', 'default.png', 'default.png', current_timestamp(), 6, 2),
      (12, 'Quần 3',      'Đen',   'Chất Liệu 3', 'default.png', 'default.png', current_timestamp(), 2, 2),
      (13, 'Quần 1',      'Đen',   'Chất Liệu 3', 'default.png', 'default.png', current_timestamp(), 2, 1),
      (14, 'Quần 2',      'Trắng', 'Chất Liệu 1', 'default.png', 'default.png', current_timestamp(), 2, 1);

INSERT INTO `order_delivery_status_detail`(ORDER_ID, STATUS_ID, EMPLOYEE_ID, LAST_UPDATED_AT)
-- common table expression
WITH CTE_ORDER_DELIVERY_STATUS_DETAIL AS (
	-- 1. Đơn hàng từ 1 - 5 --> Giao thành công (trạng thái từ 1 - 6)
	SELECT dorder.ID ORDER_ID,
		   dstatus.ID STATUS_ID,
		   1 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (6 - dstatus.ID) DAY) LAST_UPDATED_AT 
	  FROM `order` dorder, `delivery_status` dstatus
	 WHERE dorder.ID BETWEEN 1 AND 5
	   AND dstatus.ID BETWEEN 1 AND 6
	 -- ORDER BY dorder.ID, dstatus.ID

	UNION
	 
	-- .2 Đơn hàng từ 6 - 8 --> Đóng gói thành công (trạng thái từ 1 - 4)
	SELECT dorder.ID ORDER_ID,
		   dstatus.ID STATUS_ID,
		   2 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (4 - dstatus.ID) DAY) LAST_UPDATED_AT 
	FROM `order` dorder, `delivery_status` dstatus
	WHERE dorder.ID BETWEEN 6 AND 8
	AND dstatus.ID BETWEEN 1 AND 4
	-- ORDER BY dorder.ID, dstatus.ID

	UNION

	-- 3. Đơn hàng từ 9 - 10 --> Đang giao hàng (trạng thái từ 1 - 5)
	SELECT dorder.ID ORDER_ID,
		   dstatus.ID STATUS_ID,
		   3 EMPLOYEE_ID,
		   date_sub(current_timestamp(), INTERVAL (5 - dstatus.ID) DAY) LAST_UPDATED_AT 
	FROM `order` dorder, `delivery_status` dstatus
	WHERE dorder.ID BETWEEN 9 AND 10
	AND dstatus.ID BETWEEN 1 AND 5
	-- ORDER BY dorder.ID, dstatus.ID

	UNION

	-- 4. Đơn hàng từ 11 - 12 --> Hủy đơn hàng (trạng thái 7)
	SELECT ID ORDER_ID,
		   7 STATUS_ID, -- cancel
		   4 EMPLOYEE_ID,
		   current_timestamp() LAST_UPDATED_AT
	  FROM `order`
	 WHERE 	ID BETWEEN 11 AND 12
)
SELECT * FROM CTE_ORDER_DELIVERY_STATUS_DETAIL
ORDER BY ORDER_ID, STATUS_ID;

-- order_id: 1-12
-- item_id: 1-14
-- amount: random
INSERT INTO `order_detail`(ORDER_ID, ITEM_ID, AMOUNT)
VALUES(1,   1, 5),  (1, 2, 2),  (1, 5, 2),   (1, 14, 1),
      (2,   3, 2),  (2, 2, 2),  (2, 5, 3),   (2, 12, 12),
      (3,   2, 2),  (3, 3, 2),  (3, 5, 11),  (3, 13, 2),
      (4,   4, 3),  (4, 9, 2),  (4, 5, 3),   (4, 7, 3),
      (5,   5, 8),  (5, 6, 2),  (5, 2, 8),   (5, 9, 3),
      (6,   6, 11), (6, 7, 2),  (6, 5, 9),   (6, 8, 3),
      (7,  13, 10), (7, 7, 2),  (7, 5, 15),  (7, 6, 5),
      (8,   9, 9),  (8, 14, 2), (8, 5, 20),  (8, 7, 7),
      (9,   8, 1),  (9, 12, 2), (9, 5, 10),  (9, 6, 7),
      (10, 12, 2),  (10, 6, 2), (10, 5, 10), (10, 1, 10),
      (11, 10, 2),  (11, 8, 2), (11, 5, 2),  (11, 4, 11),
      (12, 11, 3),  (12, 8, 2), (12, 5, 1),  (12, 2, 12);

INSERT INTO `employee_title`(EMPLOYEE_ID, TITLE_ID)
VALUES(1, 1),
	  (2, 1), (2, 4),
      (3, 2),
      (4, 3), (4, 2),
      (5, 5),
      (6, 4),
      (7, 2), (7, 1),
      (8, 3);

-- odd item id --> odd size id(1,3,5,7,9) (gender 0)
-- amount: 100
-- BUY_PRICE: 200 - SIZE_ID*5
-- SELL_PRICE: 200 + SIZE_ID*10

-- CROSS JOIN --

-- even item id --> even size id(2,4,6,8,10) (gender 1)
-- amount: 120
-- BUY_PRICE: 300 - SIZE_ID*8
-- SELL_PRICE: 300 + SIZE_ID*8 + 20

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

-- enable all fks
SET FOREIGN_KEY_CHECKS = 1;