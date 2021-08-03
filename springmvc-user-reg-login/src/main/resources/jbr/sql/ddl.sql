CREATE DATABASE IF NOT EXISTS spring_mvc;

USE spring_mvc;

DROP TABLE IF EXISTS `spring_mvc`.`users`;

CREATE TABLE `spring_mvc`.`users` (
  `username` VARCHAR(20) NOT NULL,
  `firstname` VARCHAR(20) NOT NULL,
  `lastname` VARCHAR(5)  NULL,
  `email` VARCHAR(20)  NULL,
  `password` VARCHAR(20) NULL,
  `phone` int(10) NULL,
  PRIMARY KEY(`username`));
  
  
CREATE TABLE `spring_mvc`.`account` (
  `username` VARCHAR(20) NOT NULL,
  `accountnumber` int (12) NOT NULL,
  `balance` int NOT NULL,
  `branch` VARCHAR(20)  NULL,
  PRIMARY KEY(`username`));

 