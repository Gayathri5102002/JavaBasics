package basic;

public class Exampleprogram {
  public static void main(String[]args) {
	  int number=12345;
	 
	  int reverse=0,rem;
	  for(;number!=0;) {
		  rem=number%10;               //12345%10   //5
	   	  reverse=(reverse*10)+rem;    //5
		  number=number/10;            //1234
	  }
	  System.out.println(reverse);
	  int value=number;
	  if(value==reverse) {
		 System.out.println("This number is palindrome");
	  }
	  else {
		 System.out.println("This number is not palindrome");
	  }
}
}