//package Test6;
//
//import java.util.*;
//import java.io.*;
//
//public class Test6_4 {
//	public static void main(String arg[]) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
//		int num = Integer.parseInt(br.readLine());
//		int[][] st= new int[100][100];
//		for(int i=0; i<num; i++) {
//			StringTokenizer c = new StringTokenizer(br.readLine());
//			int a = Integer.parseInt(c.nextToken());
//			int b = Integer.parseInt(c.nextToken());
//			for(int j=a; j<a+10; j++) {
//				for(int k=b; k<b+10; k++) {
//					st[j][k]+=1;
//				}
//			}
//		}
//		int sum = 0;
//		for(int i=0; i<100; i++) {
//			for(int j=0; j<100; j++) {
//				if(st[i][j]>0)
//					sum++;
//			}
//		}		
//		bw.write(sum+"");
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//}
