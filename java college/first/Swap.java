//swap using third variable

import java.util.*;
class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int swap=0;
		System.out .println("before Swaping:"+a+" "+b);
		swap=a;
		a=b;
		b=swap;
		
		System.out.println("After swaping:"+a+" "+b);
	
	
	} 

}

