/*

UPDATE 2

Все Инженеры - технологи моложе 45, но старше 25 лет прошли курсы повышения квалификации и выучились на Инженера-конструктора. Внесите эти изменения в Базу данных и найдите после этого количество Инженеров - конструкторов, с именами, которые содержат букву "п".

*/

update users 
set prof_id = 9 
where  prof_id = 13
and age between 25 and 45 
;

select count(u.id) 
from users as u, professions as p 
where u.prof_id = p.id 
and p.profession = 'Инженер-конструктор'
and u.name like '%п%';

/*
Ответ ?
*/


