package OOPS;
class AddTwoNumbers{
	int result;
	void Add(int A,int B) {
		 result=A+B;
	}
}
class Display extends AddTwoNumbers{
	void Disp() {
		System.out.println("The sum is:");
	}
}
public class Simple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display obj=new Display();
		obj.Disp();
		obj.Add(10,20);
	
		System.out.println(obj.result);

	}

}
