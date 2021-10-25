CREATE TABLE IF NOT EXISTS  productos (
  id serial,
  description VARCHAR(45) NOT NULL,
  precio VARCHAR(15) NULL,
  PRIMARY KEY (id)
  );