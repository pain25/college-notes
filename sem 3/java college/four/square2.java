class square{
double radius;
int side;
int length;
int breadth;

public int area(int side){
return side*side;
}
public double area(double radius){
return 3.14*radius*radius;
}

public int area(int length,int breadth){
return length*breadth;}

}

class square2{
public static void  main(String[] args){
square s1= new square();
 System.out.println(s1.area(12));
  System.out.println(s1.area(4.5));
    System.out.println(s1.area(20,50));
  
 
}
}
