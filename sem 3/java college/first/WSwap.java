//swap two numbers without using third variable
class WSwap{
	public static void main(String[] args){
		int a=10;
		int b=20;
		System.out.println("a=10");
		System.out.println("b=20");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
	
		System.out.println("a="+a);
		System.out.println("b="+b);
		}}
