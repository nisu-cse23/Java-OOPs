package OOPS;

public class Private_Constructor {
	String name;
	
	private Private_Constructor(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Private_Constructor p=new Private_Constructor("Nisu");
    System.out.println(p.name);
	}

}
