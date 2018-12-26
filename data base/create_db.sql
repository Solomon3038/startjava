CREATE DATABASE dbname;

CREATE TABLE jaegers (
  id SERIAL PRIMARY KEY,
  modelName VARCHAR(256) NOT NULL,
  mark      VARCHAR(256) NOT NULL,
  height    INTEGER,
  weight    REAL,
  status    VARCHAR(256) NOT NULL,
  origin    VARCHAR(256),
  launch    DATE,
  kaijukill INTEGER      NOT NULL
);
