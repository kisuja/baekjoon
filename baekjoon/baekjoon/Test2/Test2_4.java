package Test2;

import java.util.Scanner;

public class Test2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(b<45) {
			if(a==0) {
				a = 23;
				b = b+60 - 45;
			}
			else {
				a = a - 1;
				b = b+60 - 45;
			}
			
		}
		else
			b = b-45;
		System.out.println(a+" "+b);
		
		

	sc.close();
	}
	
}
