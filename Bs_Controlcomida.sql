create database Control_comida;

use Control_comida;

create table tblproveedor(
Registro int not null,
Razon varchar (20) not null,
Telefono int not null,
Correo varchar (30) not null,
Producto varchar (20) not null);

alter table tblproveedor 
add constraint pk_registro primary key (Registro);

create table tblcolegio(
Codigo int not null,
Calendario varchar (2) not null,
Nombre varchar (20) not null,
Telefono int not null,
Direccion varchar (20) not null,
Jornada varchar (20) not null);

alter table tblcolegio
add constraint pk_codigo primary key (Codigo);

create table tblcomida(
Numero int not null,
Codigo int not null,
Registro int not null,
Tipo varchar (20) not null,
Clasificacion varchar (20) not null,
Cantidad int not null,
Descripcion varchar (50) not null,
Fecha varchar (30) not null);

alter table tblcomida
add constraint pk_num primary key (Numero);
alter table tblcomida
add constraint fk_codi foreign key (Codigo) references tblcolegio (Codigo);
alter table tblcomida
add constraint fk_regi foreign key (Registro) references tblproveedor (Registro);

create table tblentrega(
Codigo int not null,
Numero int not null,
Cedula int not null,
Nombre varchar (20) not null,
Apellido varchar (20) not null,
Fecha varchar (30) not null);

alter table tblentrega
add constraint pk_ced primary key (Cedula);
alter table tblentrega
add constraint fk_codigo foreign key (Codigo) references tblcolegio (Codigo);
alter table tblentrega
add constraint fk_nume foreign key (Numero) references tblcomida (Numero);

select * from tblproveedor;


