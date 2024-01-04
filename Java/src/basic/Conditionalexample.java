package basic;

public class Conditionalexample {
   public static void main(String[]args) {
	   //to find whether leap year or not
	int year=2001;
	if(year%4==0||year%400==0) {
		System.out.println("This year is leap year");
	}
	else {
		System.out.println("This is not a leap year");
	}
	
	
	//to find even numbers from 1 to 30
	
 for(int i=1;i<=30;i++) {
	 if(  i%2==0) {
		 System.out.println(i);
	 }
 }
 
 //sum of 15 natural numbers
 int sum=0;
 for(int i=0;i<=15;i++) {
	 sum=sum+i;
	 }
 System.out.println(sum);
 
 

  
   
   }
   
}
