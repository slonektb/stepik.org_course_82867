/*

SELECT 2

Найдите количество людей с именем Андрей в возрасте от 45 до 55 лет. 

*/

select count(*) from users where name = 'Андрей' and age between 45 and 55;

/*
Ответ 47
*/


