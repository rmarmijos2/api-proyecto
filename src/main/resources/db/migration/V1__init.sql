create table if not exists productos (
  id serial,
  descripcion varchar(45) not null,
  precio varchar(45) not null,
  primary key (id)
  );

  create table if not exists cliente (
    id serial,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    edad varchar(2) not null,
    cedula varchar(10) not null,
    primary key (id)
    );
