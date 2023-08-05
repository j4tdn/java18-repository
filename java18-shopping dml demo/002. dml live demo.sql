
-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
   SELECT * FROM item_group;
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    -- Top 5 mặt hàng có giá bán cao nhất
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    SELECT str_to_date('02-12-2023', '%d-%m-%Y');
    SELECT * 
      FROM `ORDER`
      WHERE DELIVERY_DATE BETWEEN '2023-04-28' AND str_to_date('15-10-2023', '%d-%m-%Y');
    -- Được bán trong tháng 11/2019
    -- Được giao hàng tại Hòa Khánh
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT it.ID,
       it.`NAME`,
       itd.AMOUNT,
       itd.BUY_PRICE,
       itd.SELL_PRICE,
       itd.SIZE_ID
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 ORDER BY itd.SELL_PRICE;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT it.ID,
       it.`NAME`,
       itd.AMOUNT,
       itd.BUY_PRICE,
       itd.SELL_PRICE,
       itd.SIZE_ID
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 ORDER BY itd.BUY_PRICE DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT it.ID,
       it.`NAME`,
       itd.AMOUNT,
       itd.BUY_PRICE,
       itd.SELL_PRICE,
       itd.SIZE_ID
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
 ORDER BY itd.SELL_PRICE, itd.BUY_PRICE DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- Quần Tây Nam
-- Quây Tây Nữ 
-- --> 2
SELECT count(*) AMOUNT_OF_ITEMS FROM item;

-- Quần Tây Nam S 50
-- Quần Tây Nam M 40
-- Quần Tây Nữ S 20
SELECT * FROM size;
SELECT sum(AMOUNT) AMOUNT_OF_ITEMS from item_detail;

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
--     MaLoai  TenLoai SoLuong
-- 	     1       Giày    20
-- 	     2       Áo      28

SELECT ig.ID GROUP_ID,
       ig.NAME GROUP_NAME,
       SUM(itd.AMOUNT) AMOUNT_OF_ITEMS
  FROM item it
  JOIN item_detail itd
    ON it.ID = itd.ITEM_ID
  JOIN ITEM_GROUP ig
    ON it.ITEM_GROUP_ID = ig.ID
  GROUP BY ig.ID;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'


-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--  02   TenMH:GiaBan:SoLuong     100



