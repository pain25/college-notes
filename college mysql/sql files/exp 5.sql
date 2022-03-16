create database exp4;
use exp4;

create table Employee(Ename varchar(50) primary key not null ,street varchar(50),city varchar(50),joinig_date date,gender varchar(10),dob date);
insert into Employee
value ('ravi','birla','vasco','2002-09-11','male','2000-01-21'),
 ('yasmeen','gully','banglore','2001-05-21','female','2002-07-13'),
 ('fardin','mes','vasco','2012-09-01','male','2002-09-15'),
 ('aryan','gully','baina','2011-02-14','male','2002-07-11'),
 ('sanjay','dabolim','bogmalo','2005-06-23','male','2003-01-04');
 drop table  Employee;

create table company(Cname varchar(50) primary key not null,city varchar(50) );
insert into company
value ('vi','mumbai'),
 ('facebook','delhi'),
 ('amazon','pune'),
 ('adobe','chennai'),
 ('whatsapp','hyd');
 
 drop table company;
 
create table works(wname varchar(50) primary key not null,cname varchar(50),salary int);
insert into works
value ('ravi','google',20000),
 ('yasmeen','facebook',23000),
 ('fardin','amazon',24000),
 ('aryan','adobe',25000),
 ('sanjay','whatsapp',26000);
 select * from works;
 
 drop table works;

create table manages(cname varchar(50) primary key not null,manager_name varchar(50));
insert into manages
value ('vi','gauri'),
 ('facebook','kaushik'),
 ('amazon','falkeen'),
 ('ronaldo','komal'),
 ('whatsapp','ren');
 
 drop table manages;
 
 -- List information about all employees in the database.
 select * from Employee;
 
 -- List information about all companies in the database.
  select * from company;
 
 -- List the name and city of all employees.
 select Ename,city from Employee;
 
 -- List the name and salary of the employees working for 'amazon'
 select wname,salary from  works where cname='amazon';
 
 --  List name of employees whose name is same as their managers.
 select Ename,mname from Employee join manages where wname=mname; -- (join and , are same)
 
  -- List the name of the employees having salary less than 25000
  select * from works where salary <25000;
  
  --  List the names of female employees from 'Bangalore' city.
  select Ename from Employee where gender='female' && city='Banglore';
  
  -- List the companies located in pune city. 
  select cname from company where city='pune';
  
  -- List the names of all the managers.
  select mname from manages;
  
  -- List names of all employees whose names are 3 characters long.
  select Ename from Employee where length(Ename)=3;
  
  -- List names of all employees whose names end with letter 'D'
  select Ename from Employee where Ename like'%n';
  
  -- List names of all employces whose names start with 'A' or 'G'.
  select Ename from Employee where  Ename  like'a%' or'g%'; 
  
  -- Select all employees whose names fall between 'A' and 'C' alphabetical
  select Ename from Employee where Ename between  'A%' and 'c%';
  
  -- List all the employee details in the ascending order of salary.
  select wname, salary from works order by salary;
  
  -- List the employees company wise(i.e. In the alphabetical order of the company and all employees of a particular 
  -- company should be displayed in descending order of their salary).
  select wname ,cname,salary from works group by salary order by cname  ;
  Select ename,salary ,cname from Employee,works group by salary order by cname;
  
  -- List the employee names and joining date in the descending order of joining date.
  select Ename,joinig_date from Employee order by joinig_date;
  
  -- List name, salary and P7 amount of all the employees. Pf is calculated as 10% of salary.
  select wname , salary ,salary*.10pf from works;
  
  -- List the names of employees who are more than 2 years old in the organization.
  select Ename,joinig_date from  Employee where joinig_date < '2019-12-11';
  
  -- delete the companies located in ponda city. 
  select city from Employee where city='ponda';
  
 
 

