 class Q7{
 	public static void main(String[] args){
 	
 	Degree d1= new Degree();
 	Postgraduate p1 = new Postgraduate();
 	Undergraduate u1= new Undergraduate();
 	
 	d1.getDegree();
 	p1.getDegree();
 	u1.getDegree();
  	
 	}
 }
 
 class Degree{
 	void getDegree(){
 		System.out.println("I got a degree");
 	}
 }
 
 class Postgraduate{
 	void getDegree(){
 		System.out.println("I am a Postgraduate");
 	}
 }
 
 class Undergraduate{
 	void getDegree(){
 		System.out.println("I am an Undergraduate");
 	}
 }
