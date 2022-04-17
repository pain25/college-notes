import java.util.*; 

public class fibo {
    public static void main(String[] args ){
       Scanner sc =new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n=sc .nextInt();
		System.out.print(n1+" "+n2+" ");        
        int f = 0;
        for(int i=2;i<n;i++){
            f=n1+n2;
	System.out.print(f+" ");
	n1=n2;
	n2=f;
        }
        


    }
}

