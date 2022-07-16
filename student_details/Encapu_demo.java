/*WAP to Implement the Encapsulation
Accept Student name,. Roll_no, Accept Marks of 5 Subject
Calculate the Grad and Percentage
grade and percent both are private
*/
package Encapsulation;
public class Encapu_demo extends Encapu_demo1{
	
	//private access modifer
	private static float per;
	private static char Grd;
	//create geter and seter
	public static float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public static char getGrd() {
		return Grd;
	}
	public void setGrd(char grd) {
		Grd = grd;
	}
	public void cal() 
	{
        per=total/5;	//calculate the percentage 
        //using statement for grading the student
    	if(per>80 ) {  
    		Grd='A';
    	}
    	else if ( per>60) {
            Grd='B';
    	}
    	
    	else if ( per>40) {
    		Grd='C';
    	}
    	else   {
    		Grd='D';
    	}
    	
  
	}
	}
