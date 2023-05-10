//package Test6;
//
//import java.io.*;
//import java.util.*;
//
//public class Test6_1 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(st.nextToken());
//		int m = Integer.parseInt(st.nextToken());
//		
//		int f[][] = new int[n][m];
//		int s[][] = new int[n][m];
//		int l[][] = new int[n][m];
//		
//		for(int i=0; i<n; i++) {
//			StringTokenizer read = new StringTokenizer(br.readLine());
//			for(int j=0; j<m; j++) {
//				f[i][j] = Integer.parseInt(read.nextToken());
//			}			
//		}
//		
//		for(int i=0; i<n; i++) {
//			StringTokenizer read = new StringTokenizer(br.readLine());
//			for(int j=0; j<m; j++) {
//				s[i][j] = Integer.parseInt(read.nextToken());
//			}			
//		}
//		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				l[i][j] = f[i][j]+s[i][j];
//			}			
//		}
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++)
//				bw.write(l[i][j]+" ");
//			bw.write("\n");
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//}