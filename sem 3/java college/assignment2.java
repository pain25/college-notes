import java.util.*;
class Student{
int rollno;
String namE;
String  CLass;
int marks;
double percentage;
int total;
public double calculate(int marks){
return (marks/500)*100; 
}
public int readData(){

Scanner sc= new Scanner();
System.out.println("enter your name");
namE= sc.nextLine();
System.out.println("enter your rollno");
rollno=sc.nextInt();
System.out.println("enter your class");
CLass=sc.nextLine();
System.out.println("enter your marks on sub1");
int sub1=sc.nextInt();
System.out.println("enter your marks on sub2");
int sub2=sc.nextInt();
System.out.println("enter your marks on sub3");
int sub3=sc.nextInt();
System.out.println("enter your marks on sub4");
int sub4=sc.nextInt();
System.out.println("enter your marks on sub5");
int sub5=sc.nextInt();

}

}

class assignment2{
public static void main(String[] args){
Student s1= new Student();
s1.readData();

}
}
