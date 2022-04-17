create database exp4;
use exp4;

create table Employee(Ename varchar(50) primary key not null,street varchar(50),city varchar(50),joinig_date date,gender varchar(10),dob date);
insert into Employee
value ('ravi','birla','vasco','2002-09-11','male','2000-01-21'),
 ('kishan','gully','bina','2001-05-21','male','2002-07-13'),
 ('fardin','mes','vasco','2012-09-01','male','2002-09-15'),
 ('aryan','gully','baina','2011-02-14','male','2002-07-11'),
 ('sanjay','dabolim','bogmalo','2005-06-23','male','2003-01-04');

create table company(Cname varchar(50) primary key not null,city varchar(50) );
insert into Employee
value ('google','mumbai'),
 ('facebook','delhi'),
 ('amazon','pune'),
 ('adobe','chennai'),
 ('whatsapp','hyd');
 
create table works(ename varchar(50) primary key not null,Cname varchar(50),salary int);
insert into Employee
value ('raj','google'),
 ('jai','facebook'),
 ('yasmeen','amazon'),
 ('nagraj','adobe'),
 ('satish','whatsapp');

create table manages(ename varchar(50) primary key not null,manager_name varchar(50));
insert into Employee
value ('ravi','gauri'),
 ('kishan','kaushik'),
 ('fardin','falkeen'),
 ('aryan','komal'),
 ('sanjay','ren');

