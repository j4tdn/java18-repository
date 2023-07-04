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

INSERT INTO `customer`;

INSERT INTO `order`;

INSERT INTO `bill`;

INSERT INTO `employee`;

INSERT INTO `item`;

INSERT INTO `order_delivery_status_detail`;

INSERT INTO `order_detail`;

INSERT INTO `employee_title`;

INSERT INTO `item_detail`;


-- enable all fks
SET FOREIGN_KEY_CHECKS = 1;