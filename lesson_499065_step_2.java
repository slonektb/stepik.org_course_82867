/*

SELECT 1

Введите запрос, который выведет только профессии из БД, приведённой в уроке, которые заканчиваются на букву "а". Эти профессии должны быть выведены по алфавиту. Введите запрос в одну строку. Все слова в запросе разделяйте ровно одним пробелом. ASC дописывать не надо. Используйте одинарные кавычки.

*/

select profession from professions where profession like '%а' order by profession;


