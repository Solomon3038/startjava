DROP TABLE jaegers;

SELECT *
FROM Jaegers;


SELECT *
FROM Jaegers
WHERE STATUS NOT LIKE 'Not Destr%';


SELECT modelName
FROM jaegers
WHERE mark IN ('Mark-1', 'Mark-6');


SELECT *
FROM jaegers
ORDER BY mark DESC;


SELECT *
FROM jaegers
ORDER BY launch
LIMIT 1;


SELECT avg(weight)
FROM jaegers;

SELECT *
FROM jaegers
WHERE kaijukill IN (SELECT max(kaijukill)
                    FROM jaegers);
SELECT *
FROM jaegers
WHERE kaijukill IN (SELECT min(kaijukill)
                    FROM jaegers);

UPDATE jaegers
SET kaijuKill = kaijuKill + 1
WHERE status <> 'Destroyed';


DELETE FROM jaegers
WHERE status = 'Destroyed';








