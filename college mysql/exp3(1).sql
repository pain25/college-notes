create database employee2;
use employee2;
create table Emp(Emp_id int primary key not null ,Emp_name varchar(50),job_name varchar(50), manager_id int, the_date date,salary int,comission float ,dept_id int);
insert into Emp 
values(01,'ravi','hr',101,'2002-07-13',2000,0.25,0001),
(02,'fardin','teacher',102,'2002-06-15',200,0.22,0002),
(03,'vikas','analyst',103,'2002-05-21',2,0.12,0003),
(04,'kishan','teacher',104,'2002-05-2',1000,0.45,0004),
(05,'sanjay','puon',105,'1990-03-21',1,0.50,0005);

drop table Emp;

alter table Emp modify column Emp_id int primary key not null; 
select * from Emp;

-- find the salary of all empploye
select Emp_id,salary_commision from Emp;

-- display the unique designation for the employee
alter table Emp add designation varchar(50);
update Emp set  designation='HR' where Emp_id=1;
update Emp set  designation='teacher' where Emp_id=1;
update Emp set  designation='student' where Emp_id=1;
update Emp set  designation='' where Emp_id=1;
update Emp set  designation='HR' where Emp_id=1;
update Emp  set salary_commision=when Emp_id=1;

 
-- wrq to list the emp_name and  salary is increased by 15% and expressed as no of dollars
select Emp_name, (concat('$',salary_commision*15/100)) from Emp; 

-- list the employee with the this date in the format like feb 22,1991
select the_date,date_format(the_date,"%Y ,%M ,%D") from Emp; 

-- to count no of characters without considering the spaces for each name
SELECT length(trim(Emp_name))
FROM Emp;

-- list the emp_id,salary and commision of all teh employee
select Emp_id,salary,comission from Emp;

-- display the unique department with jobs
select distinct job_name from Emp;

-- list the employee who does not belong to dept 2001
select Emp_name from Emp where year(the_date)!=2001;

-- list the employee who joined before 1991 
select Emp_name from Emp where year(the_date)<1991;

-- display the average salaries of all the employee who work as "analyst
select avg(salary) from Emp where job_name='analyst';

-- display all the details of the employee whos commission is more than thier salary
select Emp_name from Emp where comission > salary;

-- list the employee whose salry is more than 3000 after giving 25% increment
-- list the name of the employee whose having six characters to their name
-- lsit joined in month january
-- list all thje employee whose desgination is CLERK
-- list all the employee whose experence is more then 27 years
-- list the employee whose salaries are less than 3500
-- list the name, job name and salary of any emplooyee whose designation is ANALYST
-- list the employee who have joined in the year 1991
-- list the name ,id,hire_date and salary of all the employees joined before "01 april 1991"
-- list the employee name and job_name who are not working under a manager
-- list all the employee joined 1st may 1993
-- list those employee whose salary is an odd value
-- list those employee whose salary contains only 3digits
-- list all the employee of designation CLERK in dept_no 200