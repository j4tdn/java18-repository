-- SET SQL_SAFE_UPDATES = 0;
-- SET @@sql_mode = sys.list_add(@@sql_mode, 'NO_ENGINE_SUBSTITUTION');
-- SET @@sql_mode = sys.list_drop(@@sql_mode, 'ONLY_FULL_GROUP_BY');
-- SET @@sql_mode = sys.list_add(@@sql_mode, 'ONLY_FULL_GROUP_BY');
-- SELECT @@sql_mode;

-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================

-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
/*2. Xóa bộ phận giao hàng trong hệ thống
3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
4. Xóa tất cả các mặt hàng trong hệ thống
5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
   Thực hiện xóa các đơn hàng bị lỗi

======================= REFRESH DATA =======================
C. UPDATE
1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
   MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
D. SELECT - SLIDE 25-44
1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'*/
    SELECT *
      FROM item
      WHERE ITEM_GROUP_ID IN (SELECT ID 
						 FROM item_group
                         WHERE `NAME` IN ('Thắt lưng'));
    -- Top 5 mặt hàng có giá bán cao nhất
    SELECT * 
    FROM item_detail
	ORDER BY BUY_PRICE DESC
    LIMIT 5;
			
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    SELECT *
      FROM `ORDER`
	 WHERE CREATED_AT IN (str_to_date('12.07.2023', '%d.%m.%Y'));
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    SELECT *
      FROM `ORDER`
      WHERE CREATED_AT BETWEEN str_to_date('10.07.2023', '%d.%m.%Y') AND str_to_date('13.07.2023', '%d.%m.%Y');
    -- Được bán trong tháng 11/2019
     SELECT *
      FROM `ORDER`
	 WHERE CREATED_AT BETWEEN str_to_date('01.07.2023', '%d.%m.%Y') AND str_to_date('31.07.2023', '%d.%m.%Y');
    -- Được giao hàng tại Hòa Khánh
    SELECT *
      FROM `ORDER`
      WHERE DELIVERY_ADDRESS LIKE ('%địa chỉ 1%');
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT 	ITEM_ID,
		SIZE_ID,
        AMOUNT AS AMOUNT_OF_ITEM, -- AS(alias)
        SELL_PRICE,
        format(SELL_PRICE *0.8, 2) PROMOTON_PRICE
  FROM 	item_detail;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT 	ITEM_ID,
		SIZE_ID,
        AMOUNT AS AMOUNT_OF_ITEM, -- AS(alias)
        SELL_PRICE,
        format(SELL_PRICE *0.8, 2) PROMOTON_PRICE
  FROM 	item_detail
  WHERE ITEM_ID IN (SELECT ITEM_ID 
					  FROM order_detail
					 WHERE ORDER_ID IN (SELECT ID
										  FROM `ORDER` 
										 WHERE day(CREATED_AT) = 12 AND month(CREATED_AT) = 07 AND year(CREATED_AT) = 2023 ));
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT it.ID,
        it.`NAME`,
        id.BUY_PRICE,
        id.SELL_PRICE,
        id.AMOUNT,
        id.SIZE_ID
FROM item_detail id
LEFT JOIN item it 
ON id.ITEM_ID = it.ID
ORDER BY id.SELL_PRICE;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT it.ID,
        it.`NAME`,
        id.BUY_PRICE,
        id.SELL_PRICE,
        id.AMOUNT,
        id.SIZE_ID
FROM item_detail id
LEFT JOIN item it 
ON id.ITEM_ID = it.ID
ORDER BY id.BUY_PRICE DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT it.ID,
        it.`NAME`,
        id.BUY_PRICE,
        id.SELL_PRICE,
        id.AMOUNT,
        id.SIZE_ID
FROM item_detail id
LEFT JOIN item it 
ON id.ITEM_ID = it.ID
ORDER BY id.SELL_PRICE, id.BUY_PRICE DESC;
-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- QUan Tay Nam 
-- Quan Tay Nu
-- --> 2
SELECT COUNT(*) AMOUNT_OF_ITEMS FROM item_detail;

SELECT SUM(AMOUNT)
  FROM item_detail;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
WITH MALE_SHOES AS (
SELECT itd.ID ITEM_DETAIL_ID,
       itd.ITEM_ID,
       it.`NAME` ITEM_NAME,
       itd.SIZE_ID,
       s.SIZE,
       s.GENDER,
       s.`DESC`
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN size s
	ON s.ID = itd.SIZE_ID
  WHERE it.`NAME` LIKE '%Giày%'
    AND s.GENDER = 1
)
SELECT ms.*,
       odd.ORDER_ID,
       od.CREATED_AT,
       odd.AMOUNT
  FROM MALE_SHOES ms
  JOIN ORDER_DETAIL odd
    ON ms.ITEM_DETAIL_ID = odd.ITEM_DETAIL_ID
  JOIN `ORDER` od
    ON od.ID = odd.ORDER_ID
 WHERE CAST(od.CREATED_AT AS DATE) = '2023-07-09' ;
 
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--    MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

SELECT it.ID GROUP_ID,
		ig.`NAME` GROUP_NAME,
		SUM(itd.AMOUNT) AMOUNT_OF_ITEMS
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN item_group ig
    ON it.ITEM_GROUP_ID = ig.ID
GROUP BY ig.ID;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
 -- nếu giá bán lớn nhất trùng nhau
 -- 1. Lấy hết những mặt hàng đó
 
 SELECT * FROM item_detail WHERE ITEM_ID IN (3, 4, 5);
 UPDATE item_detail SET SELL_PRICE = 400 WHERE ID IN (14, 19, 24);
 
 WITH ITEM_GROUP_MAX_PRICE AS(
 SELECT it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        it.ITEM_GROUP_ID ITEM_GROUP_ID,
        MAX(itd.SELL_PRICE) MAX_SELL_PRICE
FROM item it
JOIN item_detail itd
ON it.ID = itd.ITEM_ID
JOIN item_group itg
ON it.ITEM_GROUP_ID = itg.ID
WHERE itg.`NAME` LIKE 'Giày'
)
SELECT  it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        it.ITEM_GROUP_ID GROUP_ID,
        itd.SELL_PRICE MAX_SELL_PRICE
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN ITEM_GROUP_MAX_PRICE itgm
  ON it.ITEM_GROUP_ID = itgm.ITEM_GROUP_ID
  AND itd.SELL_PRICE = itgm.MAX_SELL_PRICE;
  
   -- 2. Lấy mặt hàng có mã mặt hàng nhỏ nhất
   
  SELECT it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        it.ITEM_GROUP_ID ITEM_GROUP_ID,
        itd.SELL_PRICE MAX_SELL_PRICE
  FROM item it
  JOIN item_detail itd
	ON it.ID = itd.ITEM_ID
  JOIN item_group itg
	ON it.ITEM_GROUP_ID = itg.ID
 WHERE itg.`NAME` LIKE 'Giày'
 ORDER BY itd.SELL_PRICE DESC, it.ID, itd.SIZE_ID
 LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

 SELECT it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        it.ITEM_GROUP_ID ITEM_GROUP_ID,
        MAX(itd.SELL_PRICE) MAX_SELL_PRICE
FROM item_detail itd
JOIN item it 
ON itd.ITEM_ID = it.ID
GROUP BY it.ITEM_GROUP_ID;

WITH ITEM_GROUP_MAX_PRICE AS(
 SELECT itg.ID ITEM_GROUP_ID,
        MAX(itd.SELL_PRICE) MAX_SELL_PRICE
FROM item it
JOIN item_detail itd
ON it.ID = itd.ITEM_ID
JOIN item_group itg
ON it.ITEM_GROUP_ID = itg.ID
GROUP BY itg.ID
)
SELECT  it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        it.ITEM_GROUP_ID GROUP_ID,
        itd.SELL_PRICE MAX_SELL_PRICE
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN ITEM_GROUP_MAX_PRICE itgm
  ON it.ITEM_GROUP_ID = itgm.ITEM_GROUP_ID
  AND itd.SELL_PRICE = itgm.MAX_SELL_PRICE;
  
  UPDATE item_detail SET SELL_PRICE = randInt(400, 600)
  WHERE SELL_PRICE = 400;
  
-- 19. Hiển thị tổng số lượng mặt hàng(số mặt hàng còn lại) của mỗi loại hàng trong hệ thống >> 16

SELECT GROUP_CONCAT(concat('{', `NAME`, ',', COLOR, '}'));

SELECT it.ITEM_GROUP_ID GROUP_ID,
		GROUP_CONCAT(concat('{', it.`NAME`, ',', itd.SIZE_ID, ',', itd.AMOUNT, '}')) DETAIL,
		SUM(itd.AMOUNT) AMOUNT_OF_ITEM
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
GROUP BY it.ITEM_GROUP_ID;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--    Điều kiện tổng số lượng > 20 mặt hàng >> HAVING

SELECT it.ITEM_GROUP_ID GROUP_ID,
		ig.`NAME` GROUP_NAME,
		SUM(itd.AMOUNT) AMOUNT_OF_ITEMS
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN item_group ig
    ON it.ITEM_GROUP_ID = ig.ID
GROUP BY ig.ID
HAVING SUM(itd.AMOUNT) > 1000;

-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT 	it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        it.ITEM_GROUP_ID GROUP_ID,
        MAX(itd.AMOUNT) AMOUNT_OF_ITEM
FROM item_detail itd
JOIN item it 
ON itd.ITEM_ID = it.ID
GROUP BY it.ITEM_GROUP_ID;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT  ig.ID GROUP_ID,
        ig.`NAME` GROUP_NAME,
        AVG(itd.SELL_PRICE) AVG_SELL_PRICE
FROM item_detail itd
JOIN item it 
ON itd.ITEM_ID = it.ID
JOIN item_group ig
ON ig.ID = it.ITEM_GROUP_ID
GROUP BY ig.ID;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT it.ID GROUP_ID,
		ig.`NAME` GROUP_NAME,
		SUM(itd.AMOUNT) AMOUNT_OF_ITEMS
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN item_group ig
    ON it.ITEM_GROUP_ID = ig.ID
GROUP BY ig.ID
ORDER BY SUM(itd.AMOUNT) DESC
LIMIT 3;
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT it.ID ITEM_ID,
		it.`NAME` ITEM_NAME,
        odd.ORDER_ID 
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
 WHERE it.ITEM_GROUP_ID = 2
 AND odd.ORDER_ID = 2;
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT it.ID ITEM_ID,
		it.`NAME` ITEM_NAME,
        it.ITEM_GROUP_ID GROUP_ID,
        od.CREATED_AT
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od
  ON odd.ORDER_ID = od.ID
 WHERE it.ITEM_GROUP_ID = 2
 AND day(od.CREATED_AT) = 12 AND month(od.CREATED_AT) = 07 AND year(od.CREATED_AT) = 2023;
 
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

SELECT it.ID ITEM_ID,
		it.`NAME` ITEM_NAME,
        it.ITEM_GROUP_ID GROUP_ID,
        od.CREATED_AT
  FROM item it
  JOIN item_detail itd
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  JOIN `order` od
  ON odd.ORDER_ID = od.ID
 WHERE it.`NAME` LIKE ('%Mũ%')
 AND day(od.CREATED_AT) <> 11 OR month(od.CREATED_AT) <> 07 OR year(od.CREATED_AT) <> 2023;
 
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE item_detail
SET BUY_PRICE = 199
WHERE ITEM_ID IN (SELECT ID 
					FROM item
				   	WHERE `NAME` LIKE ('%Áo%'));

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
-- Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu -- migrate data

CREATE TABLE item_group_backup
(
	ID INT,
    `NAME` VARCHAR(100)
    );
INSERT INTO item_group_backup(ID, `NAME`)
SELECT ID, `NAME` FROM item_group;
SELECT * FROM item_group_backup;

CREATE TABLE LoaiHang_SaoLuu LIKE item_group;
INSERT INTO LoaiHang_SaoLuu
SELECT * FROM item_group;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2

SELECT it.ID ITEM_ID,
		it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        itd.AMOUNT AMOUNT_OF_ITEM,
        odd.AMOUNT ORDER_AMOUNT,
        (itd.AMOUNT - odd.AMOUNT) SoluongTon
  FROM item it
JOIN item_detail itd
ON it.ID = itd.ITEM_ID
JOIN order_detail odd
ON itd.ID = odd.ITEM_DETAIL_ID
WHERE `NAME` LIKE ('%Áo%') OR ('%Quần%')
ORDER BY SoluongTon DESC
LIMIT 2;

SELECT it.ID ITEM_ID,
		it.`NAME` ITEM_NAME,
        itd.SIZE_ID,
        AMOUNT AMOUNT_OF_ITEM
  FROM item it
JOIN item_detail itd
ON it.ID = itd.ITEM_ID
WHERE `NAME` LIKE ('%Áo%') OR ('%Quần%')
ORDER BY AMOUNT DESC
LIMIT 2;
-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

SELECT odd.ORDER_ID,
		GROUP_CONCAT(concat('{', it.`NAME`,', ', itd.SELL_PRICE,', ', odd.AMOUNT, '}')) ORDER_DETAIL,
        SUM(odd.AMOUNT*itd.SELL_PRICE) TOTAL
  FROM item it
  JOIN item_detail itd 
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  GROUP BY odd.ORDER_ID
  ORDER BY odd.ORDER_ID;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--  02   TenMH:GiaBan:SoLuong     100

SELECT odd.ORDER_ID,
		it.ID ITEM_ID,
        it.`NAME` ITEM_NAME,
        it.ITEM_GROUP_ID GROUP_ID,
        itd.SIZE_ID,
        itd.SELL_PRICE,
        odd.AMOUNT*itd.BUY_PRICE TongTien
  FROM item it
  JOIN item_detail itd 
  ON it.ID = itd.ITEM_ID
  JOIN order_detail odd
  ON itd.ID = odd.ITEM_DETAIL_ID
  WHERE odd.ORDER_ID = 1;


