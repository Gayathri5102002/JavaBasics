package basic;

public class Overloading {
	
	public void StdDetails(int id) {
		System.out.println(id);
	}
    public void StdDetails(String name ) {
		System.out.println(name);
	}
    public void StdDetails(short salary) {
	System.out.println(salary);
}
  public static void main(String[]args) {
	Overloading obj=new Overloading();
	obj.StdDetails(1);
	obj.StdDetails("Gayathri");
	obj.StdDetails(12345);
  }
}
