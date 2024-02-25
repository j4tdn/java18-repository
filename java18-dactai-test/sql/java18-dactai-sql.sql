use karaoke;

-- Cau 1:
CREATE TABLE KHACHHANG (
  MaKH VARCHAR(15) PRIMARY KEY,
  TenKH VARCHAR(255) NOT NULL,
  DiaChi VARCHAR(255) NOT NULL,
  SODT VARCHAR(15) NOT NULL,
  MaSoThue INT NOT NULL
);

CREATE TABLE PHONG (
  MaPhong VARCHAR(15) PRIMARY KEY,
  SoKhachToiDa INT NOT NULL,
  TrangThai VARCHAR(20) NOT NULL,
  MoTa VARCHAR(255) NOT NULL
);

CREATE TABLE MUCTIENGIO (
  MaTienGio VARCHAR(15) PRIMARY KEY,
  DonGia INT NOT NULL,
  MoTa VARCHAR(255) NOT NULL
);

CREATE TABLE DICHVU (
  MaDV VARCHAR(15) PRIMARY KEY,
  TenDV VARCHAR(255) NOT NULL,
  DonViTinh VARCHAR(10) NOT NULL,
  DonGia INT NOT NULL
);

CREATE TABLE HOADON (
  MaHD VARCHAR(15) PRIMARY KEY,
  MaKH VARCHAR(15) NOT NULL,
  MaPhong VARCHAR(15) NOT NULL,
  MaTienGio VARCHAR(15) NOT NULL,
  ThoiGianBatDauSD DATETIME NOT NULL,
  ThoiGianKetThucSD DATETIME NOT NULL,
  TrangThaiHD VARCHAR(20) NOT NULL,
  FOREIGN KEY (MaPhong) REFERENCES PHONG(MaPhong),
  FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH),
  FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO(MaTienGio)
);

CREATE TABLE CHITIET_SUDUNGDV (
  MaHD VARCHAR(15) NOT NULL,
  MaDV VARCHAR(15) NOT NULL,
  SoLuong INT NOT NULL,
  FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD),
  FOREIGN KEY (MaDV) REFERENCES DICHVU(MaDV)
);

-- Cau 2:
INSERT INTO KHACHHANG (MaKH, TenKH, DiaChi, SODT, MaSoThue) VALUES ('KH001', 'Tran Van Nam', 'Hai Chau', '0905123456', '12345678'),
																   ('KH002','Nguyen Mai Anh', 'Lien Chieu', '0905123457', '12345679');
INSERT INTO PHONG (MaPhong, SoKhachToiDa, TrangThai, MoTa) VALUES ('VIP01', 5, 'Duoc su dung', 'phong vip'),
																  ('P02', 10, 'Duoc su dung', 'phong binh thuong');
INSERT INTO MUCTIENGIO (MaTienGio, DonGia, MoTa) VALUES ('MT01', 60000, 'Ap dung tu 6 gio den 17 gio'), 
														('MT02', 80000, 'Ap dung tu sau 17 gio den 22 gio');
INSERT INTO DICHVU (MaDV, TenDV, DonViTinh, DonGia) VALUES ('DV01', 'Hat Dua', 'Bao', 5000), 
														   ('DV02', 'Trai cay', 'Dia', 30000),
                                                           ('DV03', 'Bia', 'Lon', 35000),
                                                           ('DV04', 'Nuoc Ngot', 'Chai', 10000),
                                                           ('DV05', 'Ruou', 'Chai', 200000);
INSERT INTO HOADON (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD) VALUES ('HD001', 'KH001', 'VIP01', 'MT01', '2015-11-20 8:15:00', '2015-11-20 12:30:00', 'Da thanh toan'),
																											 ('HD002', 'KH002', 'P02', 'MT01', '2015-12-12 13:10:00', '2015-12-12 17:20:00', 'Chua thanh toan'),
                                                                                                             ('HD003', 'KH001', 'P02', 'MT01', '2014-10-15 12:12:00', '2014-10-15 16:30:00', 'Da thanh toan');
INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong) VALUES ('HD001', 'DV01', 5),
														  ('HD002', 'DV01', 8),
                                                          ('HD002', 'DV02', 5),
                                                          ('HD002', 'DV03', 2),
                                                          ('HD003', 'DV04', 1),
                                                          ('HD003', 'DV05', 6);
                                                          
-- Cau 3:
SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM HOADON
WHERE ThoiGianKetThucSD BETWEEN '2014-02-01' AND '2015-02-28'
GROUP BY MaPhong
ORDER BY SoLanSuDung DESC
LIMIT 5;

-- Cau 4:
SELECT D.TenDV, MONTH(H.ThoiGianBatDauSD) AS Thang, COUNT(*) AS SoLanSuDung
FROM HOADON H
JOIN CHITIET_SUDUNGDV C ON H.MaHD = C.MaHD
JOIN DICHVU D ON C.MaDV = D.MaDV
WHERE H.ThoiGianBatDauSD BETWEEN '2014-01-01' AND '2014-12-31'
GROUP BY D.TenDV, MONTH(H.ThoiGianBatDauSD)
ORDER BY SoLanSuDung DESC
LIMIT 2;

-- Cau 5:
SELECT *
FROM PHONG
WHERE MaPhong LIKE 'VIP%';