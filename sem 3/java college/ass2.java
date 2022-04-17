package javaCollege.assignment;

import java.util.*;
class Student2{
    int rollno;
    String namE;
    String  CLass;
    int marks;
    double percentage;
    float total;
    int eng,hindi,maths,sci,geog,z;





    public void readData(){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        namE= sc.nextLine();
        System.out.println("enter your class");
        CLass=sc.nextLine();

        System.out.println("enter your rollno");
        rollno=sc.nextInt();

        System.out.println("enter your marks on sub1");
        eng=sc.nextInt();
        System.out.println("enter your marks on sub2");
        hindi=sc.nextInt();
        System.out.println("enter your marks on sub3");
        maths=sc.nextInt();
        System.out.println("enter your marks on sub4");
        sci=sc.nextInt();
        System.out.println("enter your marks on sub5");
        geog=sc.nextInt();
        z=eng+hindi+maths+sci+geog;
        total=(z*100)/500  ;


    }
    public double calculate(){
        return (z*100)/500;
    }
    public char grade(){
        if(calculate()>=85){
            return 'A';
        }
        else if(total >=70){
            return 'B';
        }
        else if(total >=60){
            return 'C';
        }
        else if(total >=50){
            return 'D';
        }
        else
            return 'E';

    }
    public void PrintMarkSheet(){

        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("|                          MES COLLEGE OF ARTS AND COMMERCE                         ");
        System.out.println("|       Name: " + namE + "  " + "                                                  class:" + CLass +"    ");
        System.out.println("|       Roll no: " + rollno+"                                                                  ");
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("|              subjects            " + "total marks           " + "marks scored" +"               ");
        System.out.println("|              English:               " + "100" + "                     " + eng+"                     ");
        System.out.println("|              Hindi:                 " + "100" + "                     " + hindi+"                     ");
        System.out.println("|              Maths:                 " + "100" + "                     " + maths+"                     ");
        System.out.println("|              Science:               " + "100" + "                     " + sci+"                     ");
        System.out.println("|              Geography:             " + "100" + "                     " + geog+"                     ");
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("|Total Marks: " + z+"                                                      Grade:"+grade()+ "     ");
        System.out.println("|Percentage : " + calculate()+"%"+"                                                                  ");
        System.out.println("|-----------------------------------------------------------------------------------|");
    }

}


public class ass2{
    public static void main(String[] args){
        Student2 s1= new Student2();
        s1.readData();
        s1.PrintMarkSheet();
//        System.out.println(  s1.grade());
//        System.out.println(s1.calculate());


    }
}
