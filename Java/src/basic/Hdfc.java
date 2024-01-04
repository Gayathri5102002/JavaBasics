package basic;

public class Hdfc extends Bank {
 public void salary() {
	 System.out.println("Salary account");
 }
 public void current() {
	 System.out.println("Current account");
 }
 public static void main(String[] args) {
	 Hdfc obj=new Hdfc();
	 obj.salary();
	 obj.Savings();
	 obj.current();
 }
}
