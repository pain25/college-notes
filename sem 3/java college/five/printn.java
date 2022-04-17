class p{
public int  add(int a,int b){
return a+b;
}
public int add(int a,int b,int c){
return a+b+c;}
public int add(int a,int b,int c,int d){
return a+b+c+d;
} 
}
class printn{

public static void main(String[] args){
p p1= new p();
System.out.println(p1.add(2,3,19,2));

}}


