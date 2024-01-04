package basic;

public class Daughter extends Father {
	public void Education() {
		System.out.println("IT");
	}
public static void main(String[]args) {
	Daughter obj=new Daughter();
	obj.vehicle();
	obj.Business();
	obj.Education();
}
}
