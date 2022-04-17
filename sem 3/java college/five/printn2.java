class p2{
public void  add(int a,char b){
System.out.println(a+","+b);
}
public void add( char a,int b){
System.out.println(a+","+b);

} 
}
class printn2{

public static void main(String[] args){
p2 p1= new p2();
p1.add(2,'a');
p1.add('a',2);
}}


