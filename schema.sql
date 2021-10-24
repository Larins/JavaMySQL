CREATE DATABASE pruebajava;

USE pruebajava;

CREATE TABLE datos
  (
     id     INT NOT NULL auto_increment,
     nombre VARCHAR(30) NOT NULL,
     edad   INT NOT NULL,
     sexo   SET('F', 'M'),
     PRIMARY KEY(id)
  ); 