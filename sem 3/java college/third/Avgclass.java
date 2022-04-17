import java.util.*;
class Avgclass {
   

    public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);
    int a=obj.nextInt();
    int b=obj.nextInt();
    int c=obj.nextInt();
    
    Average AVG1 = new Average();
    AVG1.AVG2(a,b,c);
    
    System.out.println(AVG1.avg);
    
    }}
     class Average{
    int  avg;
    public  int AVG2(int a,int b,int c){
    avg=(a+b+c)/3;
    return avg;
    
    }}
  
    }
    
    
