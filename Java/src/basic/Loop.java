package basic;

public class Loop {
public static void main (String[]args) {
	//while loop
	int i=0;
	while(i<=10) {
		System.out.println(i);
		i++;
	}
	
	//do while loop
	int j=0;
	do {
		System.out.println(j);
		j++;
	}while(j<=15);
	
	//for loop
	for(int k=0;k<=15;k++) {
		System.out.println(k);
	}
	
	//Break
	for(int a=0;a<=15;a++) {
		if(a==4) {
			break;
		}
		System.out.println(a);
	}
	//Continue
	for(int b=0;b<=10;b++) {
		if(b==4) {
			continue;
		}
		System.out.println(b);
	}
	
	
	
}
}
