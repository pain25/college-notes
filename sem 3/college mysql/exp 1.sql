use college;
select *  from Course;
select * from Department;
select * from Faculty;
select * from Hostel;
select * from student;

select dob from student order by dob asc;

-- display the details of students from computer department
select * from student 
where dapt_no=1004;
 
-- list the faculties in the descending oder of salary
select * from Faculty
order by salary desc;

-- display the total number of students in each department
select  dapt_no, count(*) from student 
group by dapt_no;

-- display the total number of faculties in each deptment with salary greater then 25000
select  dapt_no, count(*) from Faculty 
where salary >25000
group by dapt_no;




 
update student
set dapt_no = 1004
where sid=4;

update Faculty
set salary = 2000
where f_id=5;

update  student
add 

