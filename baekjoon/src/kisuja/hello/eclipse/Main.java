package kisuja.hello.eclipse;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int x[] = new int[100];
		for(;;){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0) {
				break;
			}
			x[sum] = a + b;
			sum++;
		}
		for(int i =0; i<sum; i++) {
			System.out.println(x[i]);
		}
		
	}
}