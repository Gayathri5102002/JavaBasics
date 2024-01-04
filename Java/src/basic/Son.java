package basic;

public class Son extends Father{
	public void education() {
		System.out.println("IT");
	}
public static void main (String[]args) {
	Son obj=new Son();
	obj.Business();
	obj.vehicle();
	obj.education();
	
}
}
