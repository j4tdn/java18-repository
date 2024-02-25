CREATE DATABASE lesson23_tests;
USE lesson23_tests;
-- cau 1
CREATE TABLE KHANHHANG (
    MaKH VARCHAR(50) PRIMARY KEY,
    TenKH VARCHAR(255),
    DiaChi VARCHAR(255),
    SoDT VARCHAR(255),
    MaSoThue INT
);

CREATE TABLE MUCTIENGIO (
	MaTienGio VARCHAR(50) PRIMARY KEY,
    DonGia DOUBLE,
    MoTa VARCHAR(255)
);

CREATE TABLE PHONG (
	MaPhong VARCHAR(50) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(255),
    MoTa VARCHAR(255)
);

CREATE TABLE DICHVU (
	MaDV VARCHAR(50) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia DOUBLE
);

CREATE TABLE HOADON (
	MaHD VARCHAR(50) PRIMARY KEY,
    MaKH VARCHAR(50),
    MaPhong VARCHAR(50),
    MaTienGio VARCHAR(50),
    ThoiGianBatDauSD DATETIME,
    ThoiGianKetThucSD DATETIME,
    TrangThaiHD VARCHAR(255),
    CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MaKH) REFERENCES khanhhang(MaKH),
    CONSTRAINT FK_HOADON_PHONG FOREIGN KEY (MaPhong) REFERENCES phong(MaPhong),
    CONSTRAINT FK_HOADON_MATIENGIO FOREIGN KEY (MaTienGio) REFERENCES muctiengio(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
	MaHD VARCHAR(50),
    MaDV VARCHAR(50),
    SoLuong INT,
    CONSTRAINT PK_CHITIET_HOADON FOREIGN KEY (MaHD) REFERENCES hoadon(MaHD),
    CONSTRAINT PK_CHITIET_DICHVU FOREIGN KEY (MaDV) REFERENCES dichvu(MaDV)
);
-- cau 2
INSERT INTO khanhhang(MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUES ('KH001', 'Tran Van Nam', 'Hai CHau', '0905123456', '12345678'),
	   ('KH002', 'Nguyen Mai Anh', 'LienChieu', '0905123457', '12345679');

INSERT INTO phong(MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES ('VIP01', 5, 'Duoc su dung', 'phong vip'),
	   ('P02', 10, 'Duoc su dung', 'phong binh thuong');
		
INSERT INTO dichvu(MaDV, TenDV, DonViTinh, DonGia)
VALUES ('DV01', 'hat dua', 'bao', 5.0),
	   ('DV02', 'trai cay', 'dia', 30.0);
       
INSERT INTO muctiengio(MaTienGio, DonGia, MoTa)
VALUES ('MT01', 60.0, 'ap dung tu 6 gio den 17 gio'),
	   ('MT02', 80.0, 'ap dung tu 17 gio den 22 gio');
       
INSERT INTO hoadon (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES ('HD001','KH001', 'VIP01', 'MT01','2015-11-20 8:15:00', '2015-11-20 12:30:00', 'Da thanh toan'),
	   ('HD002','KH002', 'P02', 'MT01','2015-12-12 13:10:00', '2015-12-12 17:20:00', 'Chua thanh toan');

INSERT INTO chitiet_sudungdv (MaHD, MaDV, SoLuong)
VALUES ('HD001', 'DV01', 5),
	   ('HD002', 'DV01', 8);

SELECT * FROM khanhhang;
SELECT * FROM phong;
SELECT * FROM dichvu;
SELECT * FROM muctieugio;
SELECT * FROM hoadon;
SELECT * FROM chitiet_sudungdv;

-- cau 3
SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM hoadon
WHERE ThoiGianBatDauSD BETWEEN '2014-02-01 00:00:00' AND '2015-02-28 23:59:59'
GROUP BY MaPhong;

-- cau 4
SELECT chitiet_sudungdv.MaDV, COUNT(*) AS SoLanSuDung
FROM chitiet_sudungdv
JOIN hoadon
ON hoadon.MaHD = chitiet_sudungdv.MaHD
WHERE ThoiGianBatDauSD BETWEEN '2014-01-01 00:00:00' AND '2014-12-31 23:59:59'
GROUP BY chitiet_sudungdv.MaDV;

-- cau 5
SELECT *
FROM phong
WHERE MaPhong LIKE 'VIP%';





