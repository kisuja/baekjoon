package Test4;

import java.util.*;

public class Test4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000000 , max = 1;
		int a = sc.nextInt();
		int x[] = new int[a];
		for(int i=0; i<a; i ++){
			int b = sc.nextInt();
			x[i] = b;
		}
		for(int i = 0; i < a; i++) {
			if(x[i]<=min)
				min = x[i];
			if(x[i]>=max)
				max = x[i];					
		}
		System.out.printf(min+" "+max);
		
		sc.close();
	}
}