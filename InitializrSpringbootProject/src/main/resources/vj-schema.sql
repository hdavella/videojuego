/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  HDAVELLA
 * Created: 12 dic. 2023
 */

drop table if exists video_juego;
drop table if exists proveedor;

create table video_juego (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    url varchar(500)
);

insert into video_juego (id, nombre, descripcion, url) values
(1, "juego 1" , "descripcion juego 1", "url juego 1"),
(2, "juego 2" , "descripcion juego 2", "url juego 2"),
(3, "juego 3" , "descripcion juego 3", "url juego 3"),
(4, "juego 4" , "descripcion juego 4", "url juego 4"),
(5, "juego 5" , "descripcion juego 5", "url juego 5");

create table proveedor (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    web varchar(500)
);

insert into proveedor (id, nombre, descripcion, web) values
(1, "proveedor 1" , "descripcion proveedor 1", "url proveedor 1"),
(2, "proveedor 2" , "descripcion proveedor 2", "url proveedor 2"),
(3, "proveedor 3" , "descripcion proveedor 3", "url proveedor 3");

alter table video_juego
add column proveedor_id int,
add foreign key (proveedor_id) references proveedor(id);

update video_juego set proveedor_id = 1 where id in (1,2,3);
update video_juego set proveedor_id = 2 where id in (4,5);