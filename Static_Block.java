package OOPS;

public class Static_Block {
     Static_Block(){
    	 System.out.println("Constructor Reporting");
     }
  void Static() {
 	 System.out.println("Static Block Reporting");

     }
  {
	  System.out.println("Intance Overloadding");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main Method Reporting");
      Static_Block obj=new Static_Block();
	}

}
