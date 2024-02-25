CREATE DATABASE java18_final_test CHAR SET utf8mb4;
USE java18_final_test;

CREATE TABLE KhachHang (
	MaKH VARCHAR(200) PRIMARY KEY,
    TenKH VARCHAR(200) ,
    DiaChi VARCHAR(200),
    SoDT VARCHAR(200),
    MaSoThue VARCHAR(200)
    
);
CREATE TABLE MucTienGio (
	MaTienGio VARCHAR(200) PRIMARY KEY,
    DonGia  BIGINT,
    MoTa VARCHAR(200)
);
CREATE TABLE DichVu (
	MaDV VARCHAR(255) PRIMARY KEY,
    TenDV VARCHAR(255),
    DonViTinh VARCHAR(255),
    DonGia BIGINT
);
CREATE TABLE Phong (
	MaPhong VARCHAR(200) PRIMARY KEY,
    SoKhachToiDa INT,
    TrangThai VARCHAR(200),
    MoTa VARCHAR(200)
);
CREATE TABLE HoaDon (
	MaHD VARCHAR(200) PRIMARY KEY,
    MaKH  VARCHAR(200) ,
    MaPhong VARCHAR(200),
    MaTienGio VARCHAR(200),
    ThoiGianBatDauSD TIMESTAMP,
    ThoiGianKetThucSD TIMESTAMP,
    TrangThaiHD VARCHAR(200),
    CONSTRAINT FK_KH FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_PHong FOREIGN KEY (MaPhong) REFERENCES Phong(MaPhong),
	CONSTRAINT FK_MATIENGIO FOREIGN KEY (MaTienGio) REFERENCES MucTienGio(MaTienGio)
);

CREATE TABLE ChiTiet_SuDungDichVu (
	MaHD VARCHAR(200) ,
    MaDV VARCHAR(200),
    SoLuong VARCHAR(200),
    CONSTRAINT PK_CTDH PRIMARY KEY (MaHD,MaDV),
    CONSTRAINT FK_DonHang FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    CONSTRAINT FK_DichVu FOREIGN KEY (MaDV) REFERENCES DichVu(MaDV)
);


INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH01","Tran Van Nam","Hai Chau", "01215565494","123456789");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH02","Nguyen Mai Anh","Lien Chieu", "01215565495","123456789");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH03","Phan Hoai Lan Khue","Hoa Vang", "01215565496","123456789");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH04","Le Truong Ngoc Anh","Hoa Cam", "01215565497","123456789");
INSERT INTO KhachHang(MaKH,TenKH,DiaChi,SoDT,MaSoThue) values("KH05","Ho Hoai Anh","Hai Chau", "01215565498","123456789");


INSERT INTO Phong (MaPhong, SoKhachToiDa, TrangThai, MoTa)
VALUES
("VIP01", 2, 'Duoc Su Dung', 'Phòng vip'),
("P02", 5, 'Duoc Su Dung', 'Phòng binh thuong'),
("VIP02", 30, 'Duoc Su Dung','Phòng vip'),
("P03", 15, 'Duoc Su Dung', 'Phòng binh thuong');


INSERT INTO DichVu (MaDV, TenDV, DonViTinh, DonGia)
VALUES
("DV01", 'Hat Dua', 'Bao', 50000),
("DV02", 'Trai Cay', 'Dia', 10000),
("DV03", 'Bia', 'Lon', 200000),
("DV04", 'Nuoc Ngot', 'Chai', 15000);

INSERT INTO MucTienGio (MaTienGio, DonGia, MoTa)
VALUES
("MT01", 60000, 'Từ 6:00 - 17:00'),
("MT02", 80000, 'Từ 17:00 - 22:00'),
("MT03", 100000, 'Từ 22:00 - 6:00'),
("MT04", 70000, 'Từ 22:00 - 8:00');

INSERT INTO HoaDon (MaHD, MaKH, MaPhong, MaTienGio, ThoiGianBatDauSD, ThoiGianKetThucSD, TrangThaiHD)
VALUES
("HD01", "KH01", "VIP01", "MT01", '2023-06-25 08:00:00', '2023-06-25 12:00:00', 'Hoàn thành'),
("HD02", "KH02", "P02", "MT02", '2023-06-25 12:00:00', '2023-06-25 18:00:00', 'Chưa thanh toán'),
("HD03", "KH03", "VIP02", "MT03", '2023-06-25 18:00:00', '2023-06-25 22:00:00', 'Hoàn thành'),
("HD04", "KH04", "P03", "MT04", '2023-06-25 22:00:00', '2023-06-26 08:00:00', 'Chưa thanh toán'),
("HD05", "KH01", "VIP01", "MT02", '2023-06-26 08:00:00', '2023-06-26 12:00:00', 'Hoàn thành'),
("HD06", "KH02", "P02", "MT03", '2023-06-26 12:00:00', '2023-06-26 18:00:00', 'Chưa thanh toán'),
("HD07", "KH03", "VIP02", "MT04", '2023-06-26 18:00:00', '2023-06-26 22:00:00', 'Hoàn thành'),
("HD08", "KH04", "P03", "MT01", '2023-06-26 22:00:00', '2023-06-27 08:00:00', 'Chưa thanh toán');

INSERT INTO CHITIET_SUDUNGDV (MaHD, MaDV, SoLuong)
VALUES
("HD01", "DV01", 2),
("HD01", "DV02", 3),
("HD02", "DV03", 1),
("HD03", "DV02", 2),
("HD04", "DV04", 4),
("HD05", "DV01", 12),
("HD05", "DV03", 30),
("HD06", "DV02", 20);

SELECT MaPhong, COUNT(*) AS SoLanSuDung
FROM HoaDon
WHERE ThoiGianBatDauSD BETWEEN '2014-02-01 00:00:00' AND '2015-02-28 23:59:59'
GROUP BY MaPhong
ORDER BY SoLanSuDung DESC;

SELECT 
    EXTRACT(MONTH FROM ThoiGianBatDauSD) AS Thang,
    MaDV,
    TenDV,
    COUNT(*) AS SoLanSuDung
FROM ChiTiet_SuDungDichVu
    JOIN DichVu ON ChiTiet_SuDungDichVu.MaDV = DichVu.MaDV
    JOIN HoaDon ON ChiTiet_SuDungDichVu.MaHD = HoaDon.MaHD
WHERE 
    ThoiGianBatDauSD BETWEEN '2014-01-01 00:00:00' AND '2014-12-31 23:59:59'
GROUP BY 
    Thang, MaDV
ORDER BY 
    Thang, SoLanSuDung DESC
LIMIT 2;

SELECT *
FROM Phong 
WHERE MaPhong LIKE 'VIP%';