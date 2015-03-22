CREATE TABLE productos(
sku varchar2(128) PRIMARY KEY,
nombre varchar2(128) NOT NULL,
descripcion varchar2(512),
activo char(1) DEFAULT '1' NOT NULL);