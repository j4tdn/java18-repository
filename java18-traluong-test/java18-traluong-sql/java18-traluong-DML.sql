-- Liệt kê các (5) phòng karaoke được sử dụng nhiều nhất từ 02.2014 đến 02.2015
SELECT MaPhong FROM HOADON
WHERE ThoiGianBatDauSD > '2014-02-01' AND ThoiGianBatDauSD < '2015-02-01'
GROUP BY MaPhong
LIMIT 5;

-- liệt kê 2 dịch vụ được sử dụng nhiều nhất trong mỗi tháng từ 01.2014 đến 12.2014

-- liệt kê thông tin của các phòng karaoke có mã phòng bắt đầu bằng cụm từ VIP

SELECT * FROM PHONG
WHERE MaPhong like "VIP%";