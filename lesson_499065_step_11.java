/*

DELETE 2 (Щелчок Таноса)

Для безупречного баланса и идеальной гармонии удалите из вашей базы данных половину всех людей (всех людей с чётными id). После этого найдите сумму возрастов всех людей, чьё имя заканчивается на "а", но не начинается с буквы "Г"

*/

delete
from users
where (id % 2) =0
;

select sum(age)
from users
where name like '%а'
and name not like 'Г%';

/*
Ответ ?
*/


