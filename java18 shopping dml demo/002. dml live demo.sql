-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data
-- 
-- ======================= REFRESH DATA =======================
-- 
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
-- 
-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
-- 
-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
--     -- Top 5 mặt hàng có giá bán cao nhất
	use java18_shopping;
	SELECT * FROM ITEM WHERE ITEM_GROUP_ID IN( SELECT ID FROM item_group   WHERE NAME LIKE '%Thắt lưng%');
	SELECT * FROM ITEM_DETAIL ide  JOIN ITEM  i ON ide.ITEM_ID = i.ID ORDER BY SELL_PRICE DESC LIMIT 5;
    SELECT * FROM ITEM WHERE ID IN (SELECT ITEM_ID FROM ITEM_DETAIL ORDER BY SELL_PRICE DESC) LIMIT 5;
-- 2. Đơn hàng
--     -- Được bán trong ngày 28/11/2019
--     -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
--     -- Được bán trong tháng 11/2019
--     -- Được giao hàng tại Hòa Khánh
	SELECT * FROM `ORDER` WHERE CREATE_AT like "2023-07-22%";
    SELECT * FROM `ORDER` WHERE CREATE_AT BETWEEN "2023-07-22%" AND "2023-07-23%";
	SELECT * FROM `ORDER` WHERE YEAR(CREATE_AT) =2023 AND MONTH(CREATE_AT) = 07;
    SELECT * FROM `ORDER` WHERE DELIVERY_ADDRESS = "Địa chỉ 1";
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	SELECT ITEM_ID,SIZE_ID, SELL_PRICE,FORMAT(SELL_PRICE*0.8,2) `SALED20%` FROM ITEM_DETAIL ;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
	SELECT ITEM_ID,SIZE_ID, SELL_PRICE,FORMAT(SELL_PRICE*0.8,2) `SALED20%` FROM ITEM_DETAIL WHERE ITEM_ID IN(SELECT ID FROM ITEM WHERE LAST_UPDATE_AT like "2019-11-25%");
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
	SELECT COLOR FROM ITEM GROUP BY COLOR;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
	SELECT i.ID,`NAME`,o.CREATE_AT FROM ITEM i JOIN `ORDER_DETAIL` od 
     on i.ID = od.ITEM_ID join `ORDER` o 
     on od.ORDER_ID = o.ID WHERE o.CREATE_AT like "2019-11-23%";
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT ID,NAME,COLOR,SIZE_ID,SELL_PRICE FROM ITEM i 
	 JOIN ITEM_DETAIL ide on i.ID = ide.ITEM_ID 
     WHERE ide.SELL_PRICE  BETWEEN 100 AND 300;
     -- trường hợp này phải join 2 bảng lại với nhau;
--     WHERE ID IN( SELECT ITEM_ID FROM ITEM_DETAIL WHERE SELL_PRICE BETWEEN 100 AND 300);
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	SELECT * FROM `ITEM` WHERE ITEM_GROUP_ID IN (SELECT ID FROM ITEM_GROUP WHERE NAME = "Thắt lưng" OR NAME = "Mũ");
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
	 SELECT * FROM `ORDER` WHERE CREATE_AT LIKE "2019-11-28%" OR CREATE_AT LIKE  "2019-12-14%";

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
SELECT count(*) AMOUNT_OF_ITEMS FROM item;
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
       od.CREATE_AT,
       odd.AMOUNT
  FROM MALE_SHOES ms
  JOIN ORDER_DETAIL odd
    ON ms.ITEM_DETAIL_ID = odd.ITEM_DETAIL_ID
  JOIN `ORDER` od
    ON od.ID = odd.ORDER_ID
 WHERE CAST(od.CREATE_AT AS DATE) = '2023-07-22' ;

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
	Select ig.*,
    SUM(itd.Amount) Amount_Of_Item_By_Group
    from item it 
    join item_detail itd
    on it.id = itd.ITEM_ID
    join item_group ig
    on it.ITEM_GROUP_ID= ig.ID
    GROUP BY ig.ID;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
-- nếu giá bán lớn nhất trùng nhau
-- 1.lấy hết những mặt hàng đó
SELECT  * FROM ITEM i JOIN `ITEM_DETAIL` id 
     on i.ID = id.ITEM_ID  WHERE i.ITEM_GROUP_ID in (SELECt ID FROM ITEM_GROUP WHERE NAME = "Giày") ORDER BY SELL_PRICE DESC LIMIT 1 ;
     
     
     with ITEM_GROUP_MAX_PRICE as( 
      select   id.ITEM_ID,max(SELL_PRICE) MAX_ITEM,i.ITEM_GROUP_ID 
     from  item_detail id join ITEM i on i.id = id.ITEM_ID 
     join ITEM_GROUP  ig on i.ITEM_GROUP_ID = ig.id  
     where ig.name like 'Giày')
     Select i.id,i.name, id.size_id, id.SELL_PRICE , i.ITEM_GROUP_ID from item i join item_detail id on i.id = id.item_id join ITEM_GROUP_MAX_PRICE itmp on itmp.ITEM_GROUP_ID = i.ITEM_GROUP_ID
     and itmp.max_item = id.SELL_PRICE;
-- 2.lấy mặt hàng có mã mặt hàng nhỏ nhất

     
     
     with ITEM_GROUP_MAX_PRICE as( 
      select   id.ITEM_ID,max(SELL_PRICE) MAX_ITEM,i.ITEM_GROUP_ID 
     from  item_detail id join ITEM i on i.id = id.ITEM_ID 
     join ITEM_GROUP  ig on i.ITEM_GROUP_ID = ig.id  
     where ig.name like 'Giày')
     Select i.id,i.name, id.size_id, id.SELL_PRICE , i.ITEM_GROUP_ID from item i join item_detail id on i.id = id.item_id join ITEM_GROUP_MAX_PRICE itmp on itmp.ITEM_GROUP_ID = i.ITEM_GROUP_ID
     and itmp.max_item = id.SELL_PRICE
     ORDER BY SIZE_ID  limit 1;
  
     SET @@sql_mode = sys.list_add(@@sql_mode, 'ONLY_FULL_GROUP_BY');
     SET @@sql_mode = sys.list_drop(@@sql_mode, 'ONLY_FULL_GROUP_BY');
     SELECT @@sql_mode;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
	update item_detail set SELL_PRICE = randInt(400,600) where SELL_PRICE = 400;
with data as(select  i.ITEM_GROUP_ID ,max(SELL_PRICE) MAX_PRICE_IN_GROUP
     from ITEM i  join item_detail id on i.id = id.ITEM_ID 
     group by i.ITEM_GROUP_ID)
      select  * from ITEM i  join item_detail id on i.id = id.ITEM_ID   
      right join data d on d.ITEM_GROUP_ID = i.ITEM_GROUP_ID and d.MAX_PRICE_IN_GROUP = id.SELL_PRICE;
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
Select i.ITEM_GROUP_ID,group_concat(concat('{',i.name,',',id.size_id,',',id.amount,',','}')) DETAIL_INFO,sum(id.AMOUNT)  AS AMOUNT_OF_ITEM_GROUP 
from item i join item_detail id on i.id = id.ITEM_ID 
GROUP BY i.ITEM_GROUP_ID 
having  AMOUNT_OF_ITEM_GROUP >16; 
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
WITH data as (Select i.ITEM_GROUP_ID,MAX(id.AMOUNT)  AS AMOUNT_OF_ITEM_GROUP 
from item i join item_detail id on i.id = id.ITEM_ID 
GROUP BY i.ITEM_GROUP_ID)
select  i.ID,i.NAME,i.COLOR,i.ITEM_GROUP_ID,id.SIZE_ID,id.AMOUNT from ITEM i  join item_detail id on i.id = id.ITEM_ID   
right join data d on d.ITEM_GROUP_ID = i.ITEM_GROUP_ID and d.AMOUNT_OF_ITEM_GROUP = id.AMOUNT;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
Select i.ITEM_GROUP_ID,avg(id.AMOUNT)  AS AMOUNT_OF_ITEM_GROUP 
from item i join item_detail id on i.id = id.ITEM_ID 
GROUP BY i.ITEM_GROUP_ID ;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- WITH data as (Select i.ITEM_GROUP_ID,MAX(id.AMOUNT)  AS AMOUNT_OF_ITEM_GROUP 
-- from item i join item_detail id on i.id = id.ITEM_ID 
-- GROUP BY i.ITEM_GROUP_ID  ORDER BY AMOUNT_OF_ITEM_GROUP DESC LIMIT 3)
-- select  i.ID,i.NAME,i.COLOR,i.ITEM_GROUP_ID,id.SIZE_ID,id.AMOUNT from ITEM i  join item_detail id on i.id = id.ITEM_ID   
-- right join data d on d.ITEM_GROUP_ID = i.ITEM_GROUP_ID and d.AMOUNT_OF_ITEM_GROUP = id.AMOUNT;
Select i.ITEM_GROUP_ID,SUM(id.AMOUNT)  AS AMOUNT_OF_ITEM_GROUP 
from item i join item_detail id on i.id = id.ITEM_ID 
GROUP BY i.ITEM_GROUP_ID  ORDER BY AMOUNT_OF_ITEM_GROUP DESC limit 3;
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
USE java18_shopping;
-- Select * from item i join item_detail id on i.id = id.ITEM_ID  where i.ITEM_GROUP_ID = 2 and id.id in (SELECT od.ITEM_DETAIL_ID from `order` o join  order_detail od on o.id = od.order_id where o.id = 1);
Select i.*,id.id ITEM_DETAIL_ID,od.order_id from item i 
join item_detail id on i.id = id.ITEM_ID 
join  order_detail od on id.id = od.item_detail_id 
where i.item_group_id = 2 and od.order_id = 1;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
Select i.*,id.id ITEM_DETAIL_ID,o.create_at from item i 
join item_detail id on i.id = id.ITEM_ID 
join  order_detail od on id.id = od.item_detail_id 
join `order` o on od.order_id = o.id
where i.item_group_id = 2 and month(o.create_at) = 7 and day(o.create_at) = 25;
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
select * from item i
join item_group ig on i.item_group_id = ig.id
join item_detail id on i.id = id.item_id
join order_detail od on id.id = od.item_detail_id
where ig.name = "Mũ" and not
exists (SELECT 1 from `order` o where cast(o.create_at as DATE) = "2023-07-22" and od.order_id =o.id);
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
Alter table item_detail;
 update item_detail set sell_price = 199 WHERE item_id in ( SELECT id from item WHERE item_group_id in (select id from  item_group where name = "Áo"));
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
 create table LoaiHang_SaoLuu
 (
	MaLoai INT PRIMARY KEY,
    TenLoai VARCHAR(100)
 );
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
insert into LoaiHang_SaoLuu(Maloai,TenLoai)
	select id,name from item_group;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
Select i.*, sum(id.amount) Amout from item i 
join item_detail id on i.id = id.item_id
where i.item_group_id in (Select id from item_group where name = "Áo" or name = "Quần")
group by id.item_id order by Amout desc limit 2;
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2
-- 
-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
Select o.*, sum(od.amount* id.sell_price) SUM_AMOUNT from `order`o 
 join order_detail od
 on o.id = od.order_id
 join item_detail  id
 on od.item_detail_id  = id.id
 where o.id = 2
 group by od.order_id;
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--     02   TenMH:GiaBan:SoLuong     100
--  
-- 
-- 
Select od.order_id,
 i.name,id.SIZE_ID, id.sell_price, od.amount,
 sum(od.amount* id.sell_price) As SumAmount
from order_detail od
join item_detail id
on od.item_detail_id = id.id
join item i 
on id.item_id = i.id
where od.order_id = 1
group by  od.ORDER_ID;
-- i.name,id.SIZE_ID,id.sell_price, od.amount;





