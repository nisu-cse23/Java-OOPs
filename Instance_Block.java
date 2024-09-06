package OOPS;

public class Instance_Block {
	Instance_Block(){
		System.out.println("Constructor Reporting");
	}
	{
		System.out.println("Instacnce Reporting");
	}
	void Method() {
		System.out.println("Main Reporting");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Block obj =new Instance_Block();
		obj.Method();

	}

}
