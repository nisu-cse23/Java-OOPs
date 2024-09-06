package OOPS;
class Infos{
	String name;
	int age;
	double money;

Infos(String name,int age,double money){
	this.name=name;
	this.age=age;
	this.money=money;
}
void PrintValues() {
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Money:"+money);
}
}
public class Java_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Infos info=new Infos("Nisu",20,568.98);
       info.PrintValues();
	}

}
