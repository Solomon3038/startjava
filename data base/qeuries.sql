
drop table jaegers;

SELECT * FROM Jaegers;


SELECT STATUS FROM Jaegers;


 SELECT * FROM Jaegers WHERE STATUS NOT LIKE 'Not Destr%';


select * from jaegers where mark like 'Mark-%' and int(substring(mark from 6 for length(mark) - 5)) between 1 and 6;

select modelName from jaegers where mark in ('Mark-1', 'Mark-6');



select * from jaegers order by mark desc;



select * from jaegers order by launch limit 1;


SELECT avg(weight) from jaegers;

select * from jaegers where kaijukill in (select max(kaijukill) from jaegers);
select * from jaegers where kaijukill in (select min(kaijukill) from jaegers);

update jaegers set kaijuKill = kaijuKill + 1 where status <> 'Destroyed';


delete from jaegers where status = 'Destroyed';




SELECT avg(weight)  as parametr from jaegers where weight is not NULL;

update jaegers set status = 'Not destroyed' where id in (1, 3, 5);







