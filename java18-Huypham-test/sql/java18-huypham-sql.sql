CREATE SCHEMA `testdata` ;

CREATE TABLE PHONG (
    MaPhong VARCHAR(50) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(255),
    MoTa TEXT
);

CREATE table KHACHHANG(
	MaKH varchar(50)  PRIMARY KEY,
    TenKH varchar(50),
    DiaChi varchar(50),
    SoDT Text(10),
    MaSoThue int
);

CREATE table MUCTIENGIO(
	MaTienGio varchar(50)  PRIMARY KEY,
    DonGia double,
    MoTa varchar(50)
);

CREATE TABLE DICHVU (
    MaDV VARCHAR(50) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia double
);

CREATE table CHITIET_SUDUNGDV(
MaHD varchar(50) PRIMARY KEY,
MaDV varchar(50) not null,
SoLuong int not null
);

 CREATE table HOADON(
 MaHD varchar(50) PRIMARY KEY,
 MaKH varchar(50) not null ,
 MaPhong varchar(50) not null,
 MaTienGio varchar(50) not null,
 ThoiGianBatDauSD DATETIME,
 ThoiGianKetThucSD DATETIME,
 TrangThaiHD varchar(50)
);

ALTER TABLE HOADON
ADD CONSTRAINT fk_MaKH
FOREIGN KEY (MaKH)
REFERENCES KHACHHANG(MaKH);

ALTER TABLE HOADON
ADD CONSTRAINT fk_MaPhong
FOREIGN KEY (MaPhong)
REFERENCES PHONG(MaPhong);

ALTER TABLE HOADON
ADD CONSTRAINT fk_MaTienGio
FOREIGN KEY (MaTienGio)
REFERENCES MUCTIENGIO(MaTienGio);

ALTER TABLE CHITIET_SUDUNGDV
ADD CONSTRAINT fk_MaHD
FOREIGN KEY (MaHD)
REFERENCES HOADON(MaHD);

ALTER TABLE CHITIET_SUDUNGDV
ADD CONSTRAINT fk_MaDV
FOREIGN KEY (MaDV)
REFERENCES DICHVU(MaDV);

INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES 
('VIP01', 5, 'Duoc su dung', 'phong vip'),
('P02', 10, 'Duoc su dung', 'phong binh thuong');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES 
('DV001', 'Hat Dua', 'Bao', 5.000),
('DV002', 'Trai Cay', 'Dia', 30.000);

INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES 
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679');

INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa) VALUES 
('MT01', '60000', 'Ap dung tu 6 gio den 17 gio'),
('MT02', '80000', 'Ap dung tu 17 gio den 22 gio');

INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES 
('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15:00', '2015-11-20 12:30:00', 'Da Thanh Toan'),
('HD002', 'KH002', 'P02', 'MT01', '2015-11-21 08:15:00', '2015-11-21 12:30:00', 'Chua Thanh Toan');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong) VALUES 
('HD001', 'DV001', '5'),
('HD002', 'DV002', '8');

-- Liệt kê các phòng karaoke sử dụng nhiều nhất từ 02.2014 đến 02.2015
SELECT ph.MaPhong, COUNT(*) AS SoLanSuDung
FROM HOADON hd
JOIN PHONG ph ON hd.MaPhong = ph.MaPhong
WHERE hd.ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-02-28'
GROUP BY ph.MaPhong
ORDER BY SoLanSuDung DESC;

-- Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014
SELECT 
    YEAR(hd.ThoiGianBatDauSD) AS year,
    MONTH(hd.ThoiGianBatDauSD) AS month,
    chitiet.MaDV,
    dv.TenDV,
    COUNT(*) AS usage_count
FROM 
    HOADON hd
JOIN 
    CHITIET_SUDUNGDV chitiet ON hd.MaHD = chitiet.MaHD
JOIN 
    DICHVU dv ON chitiet.MaDV = dv.MaDV
WHERE 
     YEAR(hd.ThoiGianBatDauSD) = 2014
GROUP BY 
    YEAR(hd.ThoiGianBatDauSD),
    MONTH(hd.ThoiGianBatDauSD),
    chitiet.MaDV
ORDER BY 
    YEAR,
    MONTH,
    usage_count DESC
LIMIT 2;

-- Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP"
SELECT * FROM PHONG
WHERE MaPhong LIKE 'VIP%'

