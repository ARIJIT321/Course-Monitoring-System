
mysql> create database project;
Query OK, 1 row affected (0.04 sec)

mysql> use project;
Database changed

mysql> create table admin
    -> (
    -> username varchar(100) not null unique,
    -> password varchar(100) not null
    -> );
Query OK, 0 rows affected (0.13 sec)


mysql> create table faculty
    -> (
    -> facultyid int primary key auto_increment,
    -> facultyname varchar(100),
    -> facultyaddress varchar(100),
    -> mobile varchar(10),
    -> email varchar(100),
    -> username varchar(100) not null unique,
    -> password varchar(100) not null
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> create table course
    -> (
    -> courseid int primary key auto_increment,
    -> courseName varchar(100) unique,
    -> fee int,
    -> courseDescription varchar(100)
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> create table batch
    -> (
    -> batchId int primary key auto_increment,
    -> courseId int not null,
    -> facultyId int not null,
    -> numberOfStudents int,
    -> batchStartDate date,
    -> duration varchar(100),
    -> foreign key(courseId) references course(courseId) on delete cascade,
    -> foreign key(facultyId) references faculty(facultyId) on delete cascade
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> create table coursPlan
    -> (
    -> planId int primary key auto_increment,
    -> batchId int not null,
    -> daynumber int,
    -> topic varchar(100),
    -> status varchar(100),
    -> foreign key(batchId) references batch(batchId) on delete cascade
    -> );
Query OK, 0 rows affected (0.03 sec)
