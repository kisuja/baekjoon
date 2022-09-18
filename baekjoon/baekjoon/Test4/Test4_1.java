package Test4;

import java.util.*;

public class Test4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =-1000000, min =1000000; 
		
		int a = sc.nextInt();
		int b[] = new int[a];
		
		for(int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0; i<a; i++) {
			if(b[i]<min) 
				min = b[i];
			if(b[i]>max) 
				max = b[i];
						
		}
		
		System.out.println(min+" "+max);
		
		sc.close();
	}
}