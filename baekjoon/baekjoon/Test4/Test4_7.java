package Test4;

import java.util.*;

public class Test4_7{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[][] b= new int[a][];
		float avg[]= new float[a];
		float sum[]= new float[a];
		float cnt[] = new float[a];
		for(int i=0; i<a; i++) {
			b[i] = new int[sc.nextInt()];
			for(int j=0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();
			}
			
			for(int j=0; j<b[i].length; j++) {
				sum[i] += b[i][j];
			}
			avg[i] = sum[i]/b[i].length;			

			for(int j=0; j<b[i].length; j++) {
				if(avg[i]<b[i][j])
					cnt[i]++;
			}
			
		}
		
		for (int i=0; i<a; i++) {
			System.out.printf("%.3f",100*cnt[i]/b[i].length);
			System.out.println("%");
		}
		sc.close();
	}
}