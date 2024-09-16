package OOPS;

import java.util.Scanner;

class Sum_sub{
	void sum(int A,int B) {
		System.out.println("The Sum is:" +(A+B));
	}
	void sub(int A,int B) {
		System.out.println("The sub is:"+(A-B));
	}
}

//sub class 1
class Multi_Div extends Sum_sub{
	void multiply(int A,int B) {
		System.out.println("The Multiply is: "+(A*B));
		
	}
	void Div(int A,int B) {
		System.out.println("The Div is: "+(A/(double)B));
		
	}
	
}

//sub class 2
class Reminders extends Multi_Div{
	void Remainder(int A,int B) {
		System.out.println("The Remainders is: "+(B%A));
	}

	
}


public class Multilevel_Inheritance {
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("enter the first Number:");
		int X1=S.nextInt();
		System.out.println("Enter the second Number:");
		int X2=S.nextInt();
		Reminders obj=new Reminders();
		obj.sum(X1, X2);
		obj.sub(X1, X2);
        obj.multiply(X1,X2);
        obj.Div(X1, X2);
        obj.Remainder(X1,X2);

	}

}
