package OOPS;

class Name{
	void Firstname() {
		System.out.println("Most.");
	}
}
class Name1 extends Name{
	void Lastname1() {
		System.out.println("Fatematuzzohura");
	}
	
}
class Name2 extends Name{
	void Lastname2() {
		System.out.println("Nisu");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name2 obj=new Name2();
		obj.Firstname();
		obj.Lastname2();
		
		Name1 obj2=new Name1();
		obj2.Firstname();
		obj2.Lastname1();
		
	}

}
