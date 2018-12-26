DROP TABLE jaegers;

SELECT *
FROM Jaegers;


SELECT STATUS
FROM Jaegers;


SELECT *
FROM Jaegers
WHERE STATUS NOT LIKE 'Not Destr%';


SELECT *
FROM jaegers
WHERE mark LIKE 'Mark-%' AND int(substring(mark FROM 6 FOR length(mark) - 5)) BETWEEN 1 AND 6;

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


SELECT avg(weight) AS parametr
FROM jaegers
WHERE weight IS NOT NULL;

UPDATE jaegers
SET status = 'Not destroyed'
WHERE id IN (1, 3, 5);





