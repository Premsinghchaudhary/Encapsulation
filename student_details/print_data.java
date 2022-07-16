package Encapsulation;

public class print_data extends  Encapu_demo{
	public static void main(String args[]) {
	print_data om=new print_data();
	   om.accept_data();  
	   om.cal();
		System.out.println("Your percentage is :"+getPer());
		System.out.println("Your Grade is :"+getGrd());
	}

}
