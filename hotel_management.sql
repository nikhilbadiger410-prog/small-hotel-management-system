CREATE DATABASE hotel_management;

USE hotel_management;

CREATE TABLE menu (
    item_id INT PRIMARY KEY,
    item_name VARCHAR(50),
    price INT
);

INSERT INTO menu (item_id, item_name, price) VALUES
(1, 'Pizza', 150),
(2, 'Burger', 80),
(3, 'Sandwich', 50),
(4, 'Tea', 20),
(5, 'Coffee', 30);

SELECT * FROM menu;

SELECT * FROM menu
WHERE item_id = 1;

SELECT item_name, price
FROM menu
WHERE item_name = 'Pizza';
