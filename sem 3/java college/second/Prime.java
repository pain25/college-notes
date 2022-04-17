//disply prime of first 100 numbers

import java.util.*;
class Prime{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int N=sc.nextInt();
	
	int flag;
	System.out.println(
            "All the Prime numbers within 1 and " + N
            + " are:");
	
	for(int i=1;i<=N;i++){
	//omit 1 and 0 coz they are neither prime nor composite
		if(i==0 || i==1){
		continue;
		}
		
		flag=1;
		for(int j=2;j<=i/2;++j){
			if(i%j==0){
			flag=0;
			break;
			}
		
		}
	if(flag==1)
	  System.out.print(i+" ");
	
	} 
	



}}
