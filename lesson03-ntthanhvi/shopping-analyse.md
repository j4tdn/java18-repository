+ Class
   Customer: name; phone; address
   Item    : id, os, color, cost
   
 B1: tạo danh sách (mảng) khách hàng
 B2: tạo mảng chứa những item trong cửa hàng
 B3: chức năng mua hàng
 
	+ Ai đang mua hàng (who is buying)
	
	+ Danh sách của những mặt hàng người đã mua (list of items)
	
	+ Số lượng của mỗi Item (amount of each item)
	
	+ Time mua hàng
	
==> Order: Customer, item_Details[],quantity (số lượng), datetime
==> itemDetail: item,  quantity (số lượng),

==================

c1: KH1, Adam, 123, NewYork
c2: KH2, Kate, 234, California

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4, ISO, White, 280
i4: IP12, ISO, Black, 880
i5: WP8, WindowPhone, Blue, 560


Order1: c1, {id1(i1,3), id2(i4,1), id3(i2,1}, date_time (10:10:10 08.05.2021)

Order2: c2, {id1(i3,2), id2(i5,1)}, date_time (20:10:12 07.05.2021)

Order3: c2, {id1(i4,1)}, date_time (9:28:32 08.05.2021)

Function: export(order)
	==> TotalOfAmount: Void




