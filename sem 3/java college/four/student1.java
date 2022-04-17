class Student{
int rollno;
String name;
String class1;
int marks;
float percentage;

public float calculate(int marks){
return (marks/450)*100;
}



}
class student1{
public static void  main(String[] args){
 Student s1= new Student();
 System.out.println(s1.calculate(200));
 
}
}
