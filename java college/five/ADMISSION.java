class Admission
{
private int AD_NO;
private String NAME;
private String CLASS;
private float FEES;

public void ReadData(int AD_NO,String NAME,String CLASS,float FEES){
this.AD_NO=AD_NO;
this.NAME=NAME;
this.CLASS=CLASS;
this.FEES=FEES;

}
public void Display(){
System.out.println(AD_NO);
System.out.println(NAME);
System.out.println(CLASS);
System.out.println(FEES);
}}

class ADMISSION{
public static void main(String[] args){
Admission a1= new Admission();
a1.ReadData(2,"ravi","A",2000);
a1.Display(); 

}}

