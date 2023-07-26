use java18_shopping;
-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================

-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
		SELECT *
		FROM `item`
		WHERE NAME LIKE '%thắt lưng%';
--     -- Top 5 mặt hàng có giá bán cao nhất
	SELECT `NAME`, COLOR, MATERIAL, SIZE_ID, SELL_PRICE  
	FROM `item` od
	LEFT JOIN `item_detail` pm
	ON od.ID = pm.ITEM_ID
	ORDER BY SELL_PRICE DESC
	LIMIT 5;
-- 2. Đơn hàng
--     -- Được bán trong ngày 28/11/2019
	SELECT *
	FROM `order`
	WHERE YEAR(DELIVERY_DATE) = 2023
	AND MONTH(DELIVERY_DATE) = 10
	AND DAY(DELIVERY_DATE) = 12;
--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
	SELECT *
	FROM `order`
	WHERE DELIVERY_DATE BETWEEN DATE '2023-10-10' AND '2023/10/14';
--     -- Được bán trong tháng 11/2019
	SELECT *
	FROM `order`
	WHERE YEAR(DELIVERY_DATE) = 2023
	AND MONTH(DELIVERY_DATE) = 10;
--     -- Được giao hàng tại Hòa Khánh
	SELECT *
	FROM `order`
	WHERE DELIVERY_ADDRESS = 'Địa chỉ 5';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	SELECT `NAME`, COLOR, MATERIAL, SIZE_ID, SELL_PRICE, format(SELL_PRICE * 0.8, 2) SALE_PRICE 
	FROM `item` od
	LEFT JOIN `item_detail` pm
	ON od.ID = pm.ITEM_ID;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
	SELECT * FROM `order`;
	SELECT od.ID, DELIVERY_ADDRESS,DELIVERY_DATE, NAME,odd.AMOUNT,COLOR, MATERIAL, SELL_PRICE, format(SELL_PRICE * 0.8, 2) SALE_PRICE 
	FROM `order` od
	JOIN `order_detail` odd ON od.ID = odd.ORDER_ID
    JOIN `item` it ON odd.ITEM_ID = it.ID
    JOIN `item_detail` id ON it.ID = id.ITEM_ID
	WHERE DATE(DELIVERY_DATE) = '2023-10-10';
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
	SELECT COLOR FROM `item`
    GROUP BY COLOR;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
	
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT NAME,COLOR,MATERIAL,SELL_PRICE FROM `item` it	
    JOIN `item_detail` id ON it.ID = id.ITEM_ID
    WHERE SELL_PRICE BETWEEN 200 AND 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	SELECT it.NAME, COLOR, MATERIAL, ig.NAME CATEGORY FROM `item` it	
    JOIN `item_group` ig ON it.ITEM_GROUP_ID = ig.ID
    WHERE ig.NAME IN ('Thắt lưng','Mũ');
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
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
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100



