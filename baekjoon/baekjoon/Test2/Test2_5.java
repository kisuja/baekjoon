package Test2;

import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a* 60 + b + c;
		
		if(sum >= 1440) {
			a = sum/60 - 24;
			b = sum%60;
		}
		else {
			a = sum/60;
			b = sum%60;
		}
		System.out.println(a+" "+b);
		
		sc.close();
	}
}
