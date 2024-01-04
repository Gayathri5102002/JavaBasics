package basic;

public class Conditional {
	public static void main(String[]args) {
		int a=23;
		int b=20;
		if(a>b) {
			System.out.println("a is greater");
		}
		else if(a==b){
			System.out.println("a and b is equal");
		}
		else {
			System.out.println("b is greater");
		}
		
		int day=9;
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
			
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("fri");
			break;
		default:
				System.out.println("no day");
				break;
			
		}
		
		}

}
