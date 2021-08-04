/*

UPDATE 1

Измените возраст всех людей, младше 30 лет на 30 лет. После чего найдите средний возраст всех Архипов.

*/

update users set age = 30 where age < 30;

select avg(age) from users where name = 'Архип';

/*
Ответ 59.45194805194805
*/


