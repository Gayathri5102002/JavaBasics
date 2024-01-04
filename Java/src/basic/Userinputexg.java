package basic;
import java.util.Scanner;

public class Userinputexg {
public static void main(String [] args) {
	
	Scanner Obj = new Scanner(System.in);
	
	System.out.println("Enter name");
	String name= Obj.nextLine();
	System.out.println("Username is :"+ name);
	
	System.out.println("Enter age");
	int age= Obj.nextInt();
	System.out.println("user age is :"+age);
	

	
}
}
