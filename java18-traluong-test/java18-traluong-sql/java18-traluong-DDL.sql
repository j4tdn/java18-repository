-- create table KHACHHANG, MUCTIENGIO, PHONG, DICHVU
SET FOREIGN_KEY_CHECKS = 1;

drop table if exists KHACHHANG;
create table KHACHHANG 
(
	MaKH varchar(10) PRIMARY KEY,
    TenKH varchar(20),
    DiaChi varchar(50),
    SoDT varchar(20),
    MaSoThue bigint
);

drop table if exists MUCTIENGIO;
create table MUCTIENGIO
(	
	MaTienGio varchar(5) PRIMARY KEY,
    DonGia int,
    MoTa varchar(50)
);

drop table if exists PHONG;
create table PHONG
(
	MaPhong varchar(5) PRIMARY KEY,
    SoKhachToiDa int,
    TrangThai enum('Duoc su dung', 'Chua su dung'),
    MoTa varchar(20)
);

drop table if exists DICHVU;
create table DICHVU
(
	MaDV varchar(5) PRIMARY KEY,
    TenDV varchar(20),
    DonViTinh varchar(10),
    DonGia int
);

-- create table HOADON, CHITIET_SUDUNGDV

drop table if exists HOADON;
create table HOADON
(
	MaHD varchar(10) PRIMARY KEY,
    MaKH varchar(10),
    MaPhong varchar(5),
    MaTienGio varchar(5),
    ThoiGianBatDauSD datetime,
    ThoiGianKetThucSD datetime,
    TrangThaiHD enum 	('Da thanh toan'
						,'Chua thanh toan'
                        ,'Thanh toan mot phan')
);
ALTER TABLE HOADON
ADD CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MAKH) REFERENCES KHACHHANG (MAKH);
ALTER TABLE HOADON
ADD CONSTRAINT FK_HOADON_PHONG FOREIGN KEY (MaPhong) REFERENCES PHONG (MaPhong);
ALTER TABLE HOADON
ADD CONSTRAINT FK_HOADON_MUCTIENGIO FOREIGN KEY (MaTienGio) REFERENCES MUCTIENGIO (MaTienGio);

drop table if exists CHITIET_SUDUNGDV;
create table CHITIET_SUDUNGDV
(
	MaHD varchar(10),
    MaDV varchar(5),
    SoLuong int
);
ALTER TABLE CHITIET_SUDUNGDV
ADD CONSTRAINT PK_CHITIET_SUDUNGDV PRIMARY KEY (MaHD, MaDV);