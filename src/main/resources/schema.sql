DROP TABLE IF EXISTS nbtt_thongtin;
CREATE TABLE nbtt_thongtin(
    soTT INT NOT NULL PRIMARY KEY,
    ten NVARCHAR (50), 
    hangSanXuat NVARCHAR (50),
    loai NVARCHAR (30),
    gia INT,
    ma NVARCHAR(5),
    tacDung NVARCHAR (200),
    tonKho INT
);