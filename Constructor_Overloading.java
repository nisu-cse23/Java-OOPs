package OOPS;

class Overload{
	String NAme;
	int Age;
	double Money;


Overload(){
	System.out.println("Default Constructor");
}
	Overload(int Age){
		System.out.println("Constructor with one parameter");
		
	}
	Overload(String Name,double Money){
		System.out.println("Constructor with two parameter");

	}
	
}
public class Constructor_Overloading {
	 // @SuppressWarnings("unused")

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
         Overload A=new Overload();
         Overload B=new Overload(5);
         Overload C=new Overload("Nisu",5);
	}

}
