DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    f_name VARCHAR(255) NOT NULL,
    l_name VARCHAR(255),
    course VARCHAR(255) NOT NULL,
    age INT NOT NULL CHECK (age > 0),
    enlistment_year INT NOT NULL CHECK (enlistment_year >= 0)
);

INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES ('John', 'Doe', 'DAM2', 25, 2025);
INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES ('Jane', 'Smith', 'DAW1', 19, 2024);
INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES ('Bob', 'Johnson', 'ASIX2', 28, 2025);

