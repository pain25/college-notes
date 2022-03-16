class patterns{
  public static void main(String[] args){
  int N=6;
  Num(N);
  System.out.println();
  Num2(N);
  System.out.println();
  Num3(N);
  System.out.println();
  Num4(N);
  System.out.println();
  Num5(N);
   System.out.println();
  Num6(N);


 
  }
  
  static void Num(int N){

   for(int i=1;i<N;i++){
	for(int j=1;j<=i;j++){
	 System.out.print(j+" ");
	 
	 }
	 System.out.println();
	 }}
	 
  static void Num2(int A){
   int i,j;
   for( i=0;i<A;i++){
     for(j=A-i;j>1;j--){
     System.out.print("");
     
     }
     for(j=0;j<=i;j++){
     System.out.print("*");
     }
   System.out.println();
   
   
   }
  
  }
  static void Num3(int N){
  int num=1;
   for(int i=1;i<N;i++){
	for(int j=1;j<=i;j++){
	 System.out.print(num+" ");
	 num=num+1;
	 
	 }
	 System.out.println();
	 }}
	 
	 
   static void Num4(int A){
   int i,j;
   for( i=0;i<A;i++){
     for(j=(A-i);j>=0;j--){
     System.out.print(" ");
     
     }
     for(j=0;j<=i;j++){
     System.out.print("*");
     }
   System.out.println();
   
   
   }
  
  }	
    static void Num5(int A){
   
    for(int i=0;i<=A-1;i++){
     for(int j=0;j<=i;j++){
     System.out.print(" ");
     
     }
     for(int k=0;k<=A-1-i;k++){
     System.out.print(" "+"*"+"");
     }
   System.out.println();
   
   
   }
  
  }
  static void Num6(int A){
   
    for(int i=0;i<=A-1;i++)
    {
     for(int j=0;j<=i;j++)
     {
     System.out.print("*"+" ");
     
     }
     System.out.println("");
     }
     for(int i=A-1;i>=0;i--)
     {
      for(int j=0;j<=i-1;j++)
      {
      System.out.print("*"+" ");
      
     
     }
    System.out.println(" ");
   
   
   }
  }
  }
	 
	 
	 
