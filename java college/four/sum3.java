class sum{
int a;
int b;
int c;
int d;

public int add(int a, int b){
return a+b;
}
public int add(int a,int b,int c){
return a+b+c;
}
public int add(int a,int b,int c,int d){
return a+b+c+d;}
}

class sum3{
public static void main(String[] args){
sum s1= new sum();
 System.out.println(s1.add(12,434));
  System.out.println(s1.add(4,5,543));
    System.out.println(s1.add(20,50,30,43));
  

}
}
