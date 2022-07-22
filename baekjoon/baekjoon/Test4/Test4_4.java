package Test4;

import java.util.*;

public class Test4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[10];
		int num =0;
		for(int i=0; i<10; i++) {
			x[i] = sc.nextInt()%42; 
		}
		int y[]= new int[42];

		for(int i =0; i<10; i++) {
			y[x[i]]++;
		}
		for(int i =0; i<42; i++) {
			if(y[i] != 0) {
				num++;
			}
		}
		System.out.println(num);
	}
}
