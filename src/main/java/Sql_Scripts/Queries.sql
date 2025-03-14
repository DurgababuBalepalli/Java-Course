create database sakila;
use sakila;
INSERT INTO hibernate_sequence VALUES (1);
CREATE TABLE hibernate_sequence (
    next_val BIGINT
);
CREATE TABLE actor (
    actor_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255)
);

create database world;
use world;
INSERT INTO hibernate_sequence VALUES (1);
CREATE TABLE hibernate_sequence (
    next_val BIGINT
);
CREATE TABLE country (
    Code VARCHAR(255) PRIMARY KEY,
    Continent VARCHAR(255),
    Region VARCHAR(255)
);
