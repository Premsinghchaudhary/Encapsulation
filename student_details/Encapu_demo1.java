package Encapsulation;

import java.util.Scanner;

public class Encapu_demo1  {
	  int roll,maths,eng,java,AI,eco,total;
	  String name;
	  Scanner sc=new Scanner(System.in);
	//GET the all details from the user.....
	  public void accept_data() {
		System.out.print(" Enter your name:");
		name=sc.next();
		System.out.print("Enter your 4 digit roll no:");
		roll=sc.nextInt();
		System.out.println(" Marks of 5 subject");
		System.out.print(" Write your marks in MATHS:");
		maths=sc.nextInt();
		System.out.print(" Write your marks in ENGLISH:");
		eng=sc.nextInt();
		System.out.print(" Write your marks in JAVA:");
		java=sc.nextInt();
		System.out.print(" Write your marks in ARTIFICAL INTELIGENCE:");
		AI=sc.nextInt();
		System.out.print(" Write your marks in ECONOMICS:");
		eco=sc.nextInt();
		//calculate the total marks......
		total=maths+eng+java+AI+eco;
		//print the all statemet..........
		System.out.println(" NAME:"  +name);
		System.out.println(" ROLL NO :"+roll);	
		System.out.println(" MATHS:"+maths);
		System.out.println(" ENGLISH:"+eng);
		System.out.println(" JAVA:"+java);
		System.out.println(" ARTIFICAL INTELIGENCE:"+AI);
		System.out.println(" ECONOMICS:"+eco);
		System.out.println(" TOTAL MARKS  :"+total);
		
	}
	
	

}
