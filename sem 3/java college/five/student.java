class Stu{
String name;
int age;
String address;


public void SetInfo(String n,int a){
name=n;
age=a;
System.out.println(name+","+age);
}
public void SetInfo(String n,int a,String add){
name=n;
age=a;
address=add;


}

public void display(){
System.out.println(name+","+age+","+address);
}
}
class student{
public static void main(String[] args){
Stu[] s1= new Stu[3];
s1[0]=new SetInfo("ravi",2);
s1[1]=new SetInfo("kishan",3);
s1[2]=new SetInfo("prajwal",34,"abc");


}
}
