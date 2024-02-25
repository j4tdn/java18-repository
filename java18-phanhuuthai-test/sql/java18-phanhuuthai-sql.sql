create schema SQL_TEST_FINAL;
use SQL_TEST_FINAL; 
-- cau 1
CREATE TABLE KHACHHANG(
	MaKH varchar(50) not null primary key,
    TenKH varchar(50),
    DiaChi varchar(50),
    SoDT Text(10),
    MaSoThue int
);

CREATE TABLE MUCTIENGIO(
	MaTienGio varchar(50) not null primary key,
    DonGia double,
    MoTa varchar(50)
);


 CREATE TABLE HOADON(
 MaHD varchar(50) not null primary key,
 MaKH varchar(50) not null ,
 MaPhong varchar(50) not null,
 MaTienGio varchar(50) not null,
 ThoiGianBatDauSD DATETIME,
 ThoiGianKetThucSD DATETIME,
 TrangThaiHD varchar(50)
);

CREATE TABLE PHONG (
    MaPhong VARCHAR(50) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(255),
    MoTa TEXT
);

CREATE TABLE DICHVU (
    MaDV VARCHAR(50) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia double
);


ALTER TABLE HOADON ADD CONSTRAINT fk_MaKH FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH);

ALTER TABLE HOADON ADD CONSTRAINT fk_MaPhong FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong);

ALTER TABLE HOADON ADD CONSTRAINT fk_MaTienGio FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio);

ALTER TABLE CHITIET_SUDUNGDV ADD CONSTRAINT fk_MaHD FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD);

ALTER TABLE CHITIET_SUDUNGDV ADD CONSTRAINT fk_MaDV FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV);

ALTER TABLE CHITIET_SUDUNGDV ADD PRIMARY KEY  (MaHD,MaDV);
-- câu 2

INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SoDT, MaSoThue) VALUES 
('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679');

INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa) VALUES 
('MT01', '60000', 'Ap dung tu 6 gio den 17 gio'),
('MT02', '80000', 'Ap dung tu 17 gio den 22 gio');

INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES 
('VIP01', 5, 'Duoc su dung', 'phong vip'),
('P02', 10, 'Duoc su dung', 'phong binh thuong');

INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES 
('DV01', 'Hat Dua', 'Bao', 5.000),
('DV02', 'Trai Cay', 'Dia', 30.000);


INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD) VALUES 
('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 08:15:00', '2015-11-20 12:30:00', 'Da Thanh Toan'),
('HD002', 'KH002', 'P02', 'MT01', '2015-11-21 08:15:00', '2015-11-21 12:30:00', 'Chua Thanh Toan');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong) VALUES 
('HD001', 'DV01', '5'),
('HD002', 'DV02', '8');

-- câu 3
Select hd.MaPhong, count(hd.MaPhong) as COUNT  from HOADON  as  hd where  month(hd.ThoiGianBatDauSD) = 2
  and month(hd.ThoiGianBatDauSD) = 2  
  and year(hd.ThoiGianBatDauSD) >=2014 
  and year(hd.ThoiGianBatDauSD) <=2015  
  GROUP BY  hd.MaPhong;

-- câu 4
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
    year,
    month,
    usage_count DESC
LIMIT 2;

-- câu 5
SELECT * FROM PHONG
WHERE MaPhong LIKE 'VIP%';