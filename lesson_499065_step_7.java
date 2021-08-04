/*

SELECT 6

Найдите количество людей, в имени которых есть буква "э" (в любом регистре), которые младше, чем средний возраст всех людей, которые работают Нефрологами или Геодезистами. Решите задачу, используя один запрос.

*/

select count(*) 
from users 
where age < 
    (select avg(age) from users where prof_id in 
        (select id from professions where profession = 'Нефролог' or profession = 'Геодезист')
    )
and (name like '%Э%'or name like '%э%');

/*
Ответ 5287
*/


