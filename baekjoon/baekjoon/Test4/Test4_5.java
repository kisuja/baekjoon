package Test4;

import java.util.Scanner;

public class Test4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double max = 0;
		double sum = 0;
		double avg;
		int x[] = new int[a];
		for(int i =0; i< a; i++) {
			x[i] = sc.nextInt();
		}
		for(int i=0; i<a; i++) {
			if(x[i]>max) {
				max = x[i];
			}
		}
		for(int i=0; i<a; i++) {
			sum = sum+x[i];			
		}
		avg = sum/max/a*100;
		System.out.println(avg);
	}
}
