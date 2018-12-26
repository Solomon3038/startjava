CREATE DATABASE dbname;




create table jaegers (
id serial primary key,
modelName varchar(256) not null,
mark varchar(256) not null,
height integer,
weight real,
status varchar(256) not null,
origin varchar(256),
launch date,
kaijukill integer not null
);
