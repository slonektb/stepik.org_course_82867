/*

Множественный INSERT

Вставьте сразу в таблицу books несколько строк с помощью одного запроса INSERT. Добавьте в репозиторий текстовый файл, в котором будут лежать эти запросы как строчки.

В качестве ответа пришлите ссылку на репозиторий с вашим проектом (конкретно на сайте github.com).

*/

INSERT INTO books 
	(id, name, year, autor) 
VALUES 
	(3, 'Глазами жертвы', 2021, 'Омер Майк', 1),
	(2, 'Дюна. Графический роман. Том 1', 2021, 'Герберт Брайан, Андерсон Кевин Дж.', 2);

