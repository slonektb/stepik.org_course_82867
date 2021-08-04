/*

SELECT 5

Не подглядывая в таблицу professions, найдите количество Биотехнологов и Кондитеров. Реализуйте это с помощью вложенного запроса.


*/

select count(*) from users where prof_id in (select id from professions where profession = 'Биотехнолог' or profession = 'Кондитер');

/*
Ответ 1342
*/


