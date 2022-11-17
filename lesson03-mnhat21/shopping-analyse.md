==============================================
A. Class 
Customer : name, phone, id, address
Item	 : id, os, color, price

Step 1 : Create a list of customers
Step 2 : Create an array of items in store
Step 3 : Shopping function
	+ Who
	+ List of items 
	+ Amount of each item
	+ Time
=> Order : customer, ItemDetail[], datetime
=> Item[] items
=> ItemDetail : item, quantity

==============================================
B. Object 
Customer : 
c1 : cus01, Adam, 123, New York
c2 : cus02, Kate, 345, California

i1 : SSW, Anroid, Black, 600
i2 : SS9+, Anroid, Red, 300
i3 : IP14, IOS, Purple, 1200
i4 : AW8, WOS, Black, 400
i5 : RZ, Anroid, Black, 750

Order :
o1 : c1, {id1(i1,3), id2(i3,1)}, datetime
o2 : c2, {id1(i4,2), id2(i5,3)}, datetime 
o2 : c2, {id1(i1,1)}, datetime 

==============================================
C Function
+ export (order) => TotalAmount: Double

