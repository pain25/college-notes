class Q6{
	public static void main(String[] args){
	Parent p1= new Parent();
	p1.getMessage();
	
	Child c1= new Child();
	c1.getMessage();
	
	Parent pc= new Child();
	p1.getMessage();
	
		}
}

class Parent{

void getMessage(){
	System.out.println("This is a Parent class");

}


}

class Child extends Parent{
Child(){
super();}
void getMessage(){
	System.out.println("This is a child class");
}
}
