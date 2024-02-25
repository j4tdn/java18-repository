INSERT INTO KHACHHANG
VALUES 	("KH001", "Tran Van Nam", 		"Hai Chau", 	"0905123456", 12345678),
		("KH002", "Nguyen Mai Anh", 	"Lien Chieu", 	"0905123457", 12345679),
        ("KH003", "Phan Hoai Lan Khue", "Hoa Vang", 	"0905123458", 12345680);

INSERT INTO PHONG
VALUES 	("VIP01", 	5, 		"Duoc su dung", "phong vip"),
		("P02", 	10, 	"Duoc su dung", "phong binh thuong"),
        ("P03", 	15, 	"Duoc su dung", "phong binh thuong"),
        ("VIP04", 	20, 	"Duoc su dung", "phong vip");
        
INSERT INTO DICHVU
VALUES 	("DV01", "Hat Dua", 	"Bao", 5000),
		("DV02", "Trai cay", 	"Dia", 30000),
        ("DV03", "Bia", 		"Lon", 35000);
        
INSERT INTO MUCTIENGIO
VALUES	("MT01", 60000, 	"Ap dung tu 6 gio den 17 gio"),
		("MT02", 80000, 	"Ap dung tu 17 gio den 22 gio"),
		("MT03", 100000, 	"Ap dung tu sau 22 gio den 6 gio sang");
        
INSERT INTO HOADON
VALUES 	("HD001", "KH001", "VIP01", 	"MT01", '2015-11-20 08:15', '2015-11-20 12:30', "Da thanh toan" ),
		("HD002", "KH002", "P02", 		"MT01", '2015-12-12 13:10', '2015-11-20 17:20', "Chua thanh toan" ),
		("HD003", "KH001", "P02",		"MT01", '2014-10-15 12:12', '2014-10-15 16:30', "Da thanh toan" );
        
INSERT INTO CHITIET_SUDUNGDV
VALUES	("HD001", "DV01", 5),
		("HD002", "DV01", 8),
        ("HD002", "DV02", 5),
        ("HD002", "DV03", 2);