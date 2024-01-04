package basic;

public class Account implements Banking {
public void salary() {
	System.out.println("Salary account");
}
public void current() {
	System.out.println("current account");
}
public void saving() {
	System.out.println("Saving account");
}
public static void main (String[]args) {
	Account obj=new Account();
	obj.current();
	obj.salary();
	obj.saving();
}
}

