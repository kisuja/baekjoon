package Test4;

import java.util.Scanner;

public class Test4_2 {
	public static void main(String[] args) {
		int a[] = new int[9];
		int num=0;
		int max=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<9; i++) {			
			a[i] = sc.nextInt();
		}
		for(int i =0; i<9; i++) {
			if(max < a[i]) {
				max = a[i];
				num = i+1;			
			}
		}
		System.out.println(max);
		System.out.println(num);
		sc.close();
	}
	
}
