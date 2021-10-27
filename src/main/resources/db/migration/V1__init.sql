CREATE TABLE IF NOT EXISTS productos (
  id serial,
  descripcion VARCHAR(45) NOT NULL,
  precio VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
  );

  CREATE TABLE IF NOT EXISTS cliente (
    id serial,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    edad VARCHAR(2) NOT NULL,
    cedula VARCHAR(10) NOT NULL,
    PRIMARY KEY (id)
    );
