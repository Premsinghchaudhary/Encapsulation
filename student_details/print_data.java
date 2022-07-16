package Encapsulation;

public class print_data extends  Encapu_demo{
	//main method.....
	public static void main(String args[]) {
	//create object....
	print_data om=new print_data();
	//calling the perivous method which is create the perivous classes...
	om.accept_data();  
	   om.cal();
	//private variables print...
	System.out.println("Your percentage is :"+getPer());
	System.out.println("Your Grade is :"+getGrd());
	}

}
