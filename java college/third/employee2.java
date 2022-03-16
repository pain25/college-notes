class employee2{
public static void main(String[] args){
EMP e1= new EMP();
e1.havedata("110","ravi","hra",1);
e1.dispData();

}

}
class EMP{
private String empno;
private String empname;
private String hra;
private int netpay;

public void havedata(String e,String en,String h, int n){
empno=e;
empname=en;
hra=h;
netpay=n;


}

public void dispData(){

System.out.println(empno);
System.out.println(empname);
System.out.println(hra);
System.out.println(netpay);

}

}
