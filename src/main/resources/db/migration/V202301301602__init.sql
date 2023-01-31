CREATE TABLE IF NOT EXISTS city
(
    id          SERIAL          PRIMARY KEY,
    name        VARCHAR(50)     NOT NULL
);

CREATE TABLE IF NOT EXISTS street
(
    id          SERIAL          PRIMARY KEY,
    city_id     INT             NOT NULL,
    name        VARCHAR(100)    NOT NULL,
    is_visited  BOOLEAN         DEFAULT FALSE
);