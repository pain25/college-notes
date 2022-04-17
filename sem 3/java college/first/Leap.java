import java.util.*;
class Leap{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the year ");
		int year = obj.nextInt();
		if(year%4==0){
		  System.out.println(year+"it is leap year");
		}
		else if(year%400==0){
		  System.out.println(year+"it is leap year");
		}
		else if(year%100==0){
		  System.out.println(year+"it is leap year");
		}
		else{
		  System.out.println(year+"it is nota leap year");
		}
	
		
		
		}}
