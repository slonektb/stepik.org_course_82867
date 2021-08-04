/*

Вторая таблица

Создайте вторую таблицу в вашей БД с названием genres. В Этой таблице должно быть всего два столбца - id и genre. Добавьте в неё несколько значений. В первой таблице (с книгами) добавьте столбец genre_id. Свяжите между собой столбцы genre_id из таблицы books и id из таблицы genres. В репозитории создайте текстовый файл с объяснением, почему такой подход к созданию БД выгодней, нежели обычное создание текстового столбца в таблице books.

В качестве ответа пришлите ссылку на репозиторий с вашим проектом (конкретно на сайте github.com).
*/

CREATE TABLE books (
    id       INTEGER      PRIMARY KEY AUTOINCREMENT
                          NOT NULL
                          UNIQUE,
    name     STRING (254) NOT NULL,
    year     INTEGER,
    autor    STRING (50),
    genre_id BIGINT       REFERENCES genres (id) 
);

INSERT INTO books (id, name, year, autor) VALUES (1, 'Первая доврачебная помощь', 2017, 'СпецЛит', 3);
INSERT INTO books (id, name, year, autor) VALUES (2, 'Дюна. Графический роман. Том 1', 2021, 'Герберт Брайан, Андерсон Кевин Дж.', 2);
INSERT INTO books (id, name, year, autor) VALUES (3, 'Глазами жертвы', 2021, 'Омер Майк', 1);

CREATE TABLE genres (
    id    INTEGER     PRIMARY KEY AUTOINCREMENT
                      UNIQUE
                      NOT NULL,
    genre STRING (50) NOT NULL
);

INSERT INTO genres (id, genre) VALUES (1, 'Детектив');
INSERT INTO genres (id, genre) VALUES (2, 'Фантастика');
INSERT INTO genres (id, genre) VALUES (3, 'Учебное пособие');

