use karaoke;

DROP TABLE IF EXISTS `KHACHHANG` ;
CREATE TABLE `KHACHHANG` (
MaKH VARCHAR(52),
TenKH VARCHAR(52) NOT NULL,
DiaChi TEXT NOT NULL,
SoDT VARCHAR(52) NOT NULL,
MaSoThue VARCHAR(52) NOT NULL,
CONSTRAINT PK_KHACHHANG PRIMARY KEY(MaKH)
);

DROP TABLE IF EXISTS `PHONG` ;
CREATE TABLE `PHONG` (
MaPhong VARCHAR(52),
SoKhachToiDa INT NOT NULL,
TrangThai VARCHAR(52) NOT NULL,
Mota TEXT NOT NULL,
CONSTRAINT PK_PHONG PRIMARY KEY(MaPhong),
CONSTRAINT CHK_TrangThai CHECK (TrangThai IN ('Duoc su dung', 'Khong duoc su dung')),
CONSTRAINT CHK_Mota CHECK (Mota IN ('phong vip', 'phong binh thuong'))
);

DROP TABLE IF EXISTS `DICHVU` ;
CREATE TABLE `DICHVU` (
MaDV VARCHAR(52),
TenDV VARCHAR(52) NOT NULL,
DonViTinh VARCHAR(52) NOT NULL,
DonGia FLOAT NOT NULL,
CONSTRAINT PK_DICHVU PRIMARY KEY(MaDV)
);

DROP TABLE IF EXISTS `MUCTIENGIO` ;
CREATE TABLE `MUCTIENGIO` (
MaTienGio VARCHAR(52),
DonGia FLOAT NOT NULL,
Mota TEXT NOT NULL,
CONSTRAINT PK_MUCTIENGIO PRIMARY KEY(MaTienGio)
);

DROP TABLE IF EXISTS `HOADON` ;
CREATE TABLE `HOADON` (
MaHoaDon VARCHAR(52),
MaKH VARCHAR(52) NOT NULL,
MaPhong VARCHAR(52) NOT NULL,
MaTienGio VARCHAR(52) NOT NULL,
ThoiGianBatDauSD DATETIME NOT NULL,
ThoiGianKetThucSD DATETIME NOT NULL,
TrangThaiHD VARCHAR(52) NOT NULL,
CONSTRAINT PK_HOADON PRIMARY KEY(MaHoaDon),
CONSTRAINT CHK_TrangThaiHD CHECK (TrangThaiHD IN ('Da thanh toan', 'Thanh toan mot phan', 'Chua thanh toan')),
CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
CONSTRAINT FK_HOADON_PHONG FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
CONSTRAINT FK_HOADON_TIENGIO FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

DROP TABLE IF EXISTS `CHITIET_SUDUNGDV` ;
CREATE TABLE `CHITIET_SUDUNGDV` (
MaHD VARCHAR(52),
MaDV VARCHAR(52),
SoLuong INT NOT NULL,
CONSTRAINT PK_CHITIET_SUDUNGDV PRIMARY KEY(MaHD,MaDV),
CONSTRAINT FK_CHITIET_SUDUNGDV_HOADON FOREIGN KEY (MaHD) REFERENCES HOADON(MaHoaDon),
CONSTRAINT FK_CHITIET_SUDUNGDV_DICHVU FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

-- INSERT --

INSERT INTO `KHACHHANG`(MaKH, TenKH, DiaChi, SoDT, MaSoThue)
VALUES('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
	  ('KH002', 'Tran Van Hai', 'Lien Chieu', '0905123476', '12345679');
      

INSERT INTO `PHONG`(MaPhong, SoKhachToiDa, TrangThai, Mota)
VALUES('VIP01', 5, 'Duoc su dung', 'phong vip'),
	  ('P02', 10, 'Duoc su dung', 'phong binh thuong');
      
INSERT INTO `DICHVU`(MaDV, TenDV, DonViTinh, DonGia)
VALUES('DV01', 'HatDua', 'Bao', 5000),
	  ('DV02', 'Trai cay', 'Dia', 30000);
    
INSERT INTO `MUCTIENGIO`(MaTienGio, DonGia, Mota)
VALUES('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'),
	  ('MT02', 80000, 'Ap dung tu 17 gio den 22 gio');
    
INSERT INTO `HOADON`(MaHoaDon, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 8:15', '2015-11-20 12:30', 'Da thanh toan'),
	  ('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10', '2015-12-12 17:20', 'Da thanh toan');
      
INSERT INTO `CHITIET_SUDUNGDV`(MaHD, MaDV, SoLuong)
VALUES('HD001', 'DV01', 5),
	  ('HD002', 'DV01', 8);
      
-- Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015

SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM HOADON
WHERE ThoiGianBatDauSD >= '2014-12-31' AND ThoiGianKetThucSD < '2015-12-31'
GROUP BY MaPhong
ORDER BY SoLanSuDung DESC;

-- Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014

SELECT 	MONTH(HD.ThoiGianBatDauSD) AS Thang,
		YEAR(HD.ThoiGianBatDauSD) AS Nam,
		CTDV.MaDV AS MaDV,
		SUM(CTDV.SoLuong) AS SoLanSuDungDV
FROM 
    CHITIET_SUDUNGDV CTDV
JOIN HOADON  HD
ON HD.MaHoaDon = CTDV.MaHD
WHERE 
    HD.ThoiGianBatDauSD >= '2015-01-01' AND HD.ThoiGianKetThucSD < '2016-01-01'
GROUP BY 
    Nam, Thang, MaDV
ORDER BY 
    Nam, Thang, SoLanSuDungDV DESC;
    
SELECT * 
FROM PHONG
WHERE MaPhong LIKE 'VIP%';

    
	  