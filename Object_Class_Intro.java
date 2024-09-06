package OOPS;
class Information {
	String name;
	int age;
	double money;

void PrintDetails() {
    System.out.println("Name: "+name);	
    System.out.println("Age: "+age);
    System.out.println("Money: "+money);	

}
}

public class Object_Class_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Information Nisu=new Information();
       Nisu.name="nisu";
       Nisu.age=20;
       Nisu.money=540.98;
       Nisu.PrintDetails();
	}
}

