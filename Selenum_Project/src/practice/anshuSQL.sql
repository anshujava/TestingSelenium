select salary from emptable A where 5 > (select count(b.salary) from emptable B  where b.salary>a.salary )


select salary from emptable A where 2 = (select count(salary) from emptable B  where b.salary>=a.salary )

SELECT * FROM emptable ORDER BY tdate DESC LIMIT 1,5;