package Test4;

import java.util.Scanner;

public class Test4_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b[] = new String[a];
		int sum =0;
		char c[][] = new char [a][];
		for(int i=0; i<a; i++) {
			b[i] = sc.next();
			c[i] = b[i].toCharArray();
		}
		int num =0;
		for(int i = 0; i < a; i++){
			for(int j = 0; j <c[i].length; j++) {
				if(c[i][j] =='O') {
					num++;
					sum=sum+num;
				}
				else
					num=0;							
			}
			System.out.println(sum);
			sum=0;
			num =0;
		}
	}
	
	
}
