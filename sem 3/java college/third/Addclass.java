import java.util.*;
class Addclass {

    public static void main(String[] args) {
    
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    
    AddNumber add=new AddNumber();

    System.out.println(add.ADD(a,b));
  
    
 
        }
     public static  class AddNumber{
     static int c=0;
     public static int ADD(int a,int b){
          c=a+b;
          return c;
         
        
   
    
    }
}}
