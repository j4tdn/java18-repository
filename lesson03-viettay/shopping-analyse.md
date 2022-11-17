A. Class 
Customer : id, name, phone, address 
Item     : id, os(operating system: hệ điều hành), color, cost
=> ItemDetail : item, quantity ( số lượng )
=> Order : customer, item_details[], date_time 


B1 : Create list of customers 
B2 : Create array of items in store 
B3 : Shopping function 
+ Who is buying
+ List of items 
+ Amount of each item ( số lượng mỗi iteam )
+ DateTime
=> Order : customer, item_details[], date_time 
=> ItemDetail : item, quantity ( số lượng )

===============================================================
B. Object

Customer : 
c1 : KH01, Tay, 123, Quang Nam
c2 : KH02, Kiet, 456, Da Nang

Item :
i1 : SA20, Android, Black, 100 
i2 : SA30, Android, Red, 200 
i3 : IP8, IOS, Purple, 300 
i4 : IP14, IOS, Black, 400 
i5 : WP8, WindowPhone, Blue, 500

Order : 
o1 : c1, {id1(i1,3), id2(i3,1)}, 10:10:10 17.11.2022 
o2 : c2, {id1(i4,2), id2(i5,3)}, 20:24:12 16.11.2022 
o3 : c2, {id1(i1,1)}, 09:15:17 15.11.2022 

==============================================================

C. Function: export(order) => TotalOfAmount: void 