CREATE DATABASE java18_karaoke CHARSET utf8mb4;
USE java18_karaoke;

-- Câu 1
CREATE TABLE KHACHHANG (
  MaKH VARCHAR(15) PRIMARY KEY,
  TenKH VARCHAR(255),
  DiaChi VARCHAR(255),
  SoDT VARCHAR(15),
  MaSoThue VARCHAR(15)
);

CREATE TABLE PHONG (
  MaPhong VARCHAR(15) PRIMARY KEY,
  SoKhachToiDa INT,
  TrangThai VARCHAR(20),
  MoTa VARCHAR(50) 
);

CREATE TABLE MUCTIENGIO (
  MaTienGio VARCHAR(15) PRIMARY KEY,
  DonGia DOUBLE,
  MoTa VARCHAR(255)
);

CREATE TABLE DICHVU (
  MaDV VARCHAR(15) PRIMARY KEY,
  TenDV VARCHAR(255),
  DonViTinh VARCHAR(15),
  DonGia DOUBLE
);

CREATE TABLE HOADON (
  MaHD VARCHAR(15) PRIMARY KEY,
  MaKH VARCHAR(15),
  MaPhong VARCHAR(15),
  MaTienGio VARCHAR(15),
  ThoiGianBatDauSD DATETIME,
  ThoiGianKetThucSD DATETIME,
  TrangThaiHD VARCHAR(20),
  FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
  FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
  FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
  MaHD VARCHAR(15),
  MaDV VARCHAR(15),
  SoLuong INT,
  FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
  FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);


-- Câu 2
INSERT INTO khachhang(MaKH, TenKH, DiaChi, SoDT, MaSoThue) 
VALUES('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
	  ('KH002', 'Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679');
      
INSERT INTO muctiengio(MaTienGio, DonGia, MoTa)
VALUES('MT01', 60, 'Ap dung tu 6 gio den 17h'),
	  ('MT02', 80, 'Ap dung sau 17h den 22h');
      
INSERT INTO phong(MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES('VIP01', 5, 'Duoc su dung', 'phong vip'),
	  ('P02', 10, 'Duoc su dung', 'phong binh thuong');
      
INSERT INTO dichvu(MaDV, TenDV, DonViTinh, DonGia)
VALUES('DV01', 'Hat Dua', 'Bao', 5),
	  ('DV02', 'Trai Cay', 'Dia', 30);
      
INSERT INTO hoadon(MaHD, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD, MaKH, MaPhong, MaTienGio)
VALUES('HD001', '2015-11-20 08:15:00', '2015-11-20 12:30', 'Da thanh toan', 'KH001', 'VIP01', 'MT01'),
      ('HD002', '2015-12-12 13:10:00', '2015-12-12 17:20', 'Chua thanh toan', 'KH002', 'P02', 'MT01');
      
INSERT INTO chitiet_sudungdv(SoLuong, MaDV, MaHD)
VALUES(5, 'DV01', 'HD001'),
	  (8, 'DV01', 'HD002');
      
-- Câu 3: Liệt kê các phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015 (0.5 điểm)
SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM hoadon
WHERE ThoiGianBatDauSD BETWEEN '2014-02-01' AND '2015-12-13'
GROUP BY MaPhong
ORDER BY SoLanSuDung DESC
LIMIT 5;

-- Câu 4: Liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014 (0.5 điểm)
SELECT dv.TenDV, MONTH(hd.ThoiGianBatDauSD) AS Thang, COUNT(*) AS SoLanSuDung
FROM hoadon hd
JOIN  chitiet_sudungdv ct ON hd.MaHD = ct.MaHD
JOIN dichvu dv ON ct.MaDV = dv.MaDV
WHERE hd.ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2015-12-31'
GROUP BY dv.TenDV, MONTH(hd.ThoiGianBatDauSD)
ORDER BY SoLanSuDung DESC
LIMIT 2;

-- Câu 5: Liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ "VIP" (0.5điểm)
SELECT * 
FROM Phong 
WHERE MaPhong LIKE 'VIP%';
     
