-- dev table
create database dev_test;
use dev_test;
CREATE TABLE item (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    status VARCHAR(50)
);

INSERT INTO item (id,name, description, status) VALUES
('101','Gulab Jamun', 'Soft deep-fried balls soaked in syrup', 'ACTIVE'),
('102','Rasgulla', 'Spongy syrupy balls made from chenna', 'ACTIVE'),
('103','Kaju Katli', 'Diamond-shaped cashew fudge', 'ACTIVE'),
('104','Jalebi', 'Crispy fried spirals soaked in syrup', 'ACTIVE'),
('105','Ladoo', 'Round-shaped sweet made from flour', 'ACTIVE'),
('106','Barfi', 'Milk-based sweet in square shapes', 'ACTIVE'),
('107','Rasmalai', 'Soft chenna patties in saffron milk', 'ACTIVE'),
('108','Mysore Pak', 'Rich sweet made of ghee and gram flour', 'ACTIVE'),
('109','Peda', 'Soft, thick disc-shaped milk sweet', 'ACTIVE'),
('110','Halwa', 'Dense sweet made of semolina or carrots', 'ACTIVE');

-- prod table
create database prod_test;
use prod_test;
CREATE TABLE item (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(100),
    description TEXT,
    status VARCHAR(50)
);

INSERT INTO item (id,name, description, status) VALUES
('1001','Boondhi Laddu', 'Soft deep-fried balls soaked in syrup', 'ACTIVE'),
('1002','Gottam Kaja', 'Spongy syrupy balls made from chenna', 'ACTIVE'),
('1003','Putha Rekulu', 'Diamond-shaped cashew fudge', 'ACTIVE'),
('1004','Bellam Jalebi', 'Crispy fried spirals soaked in syrup', 'ACTIVE'),
('1005','Sweet Rasagulla', 'Round-shaped sweet made from flour', 'ACTIVE')