//package Test5;
//
//import java.util.*;
//import java.io.*;
//
//
//public class Test5_1 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer n = new StringTokenizer(br.readLine());
//		int num = Integer.parseInt(n.nextToken());
//		
//		for(int i=1; i<=num; i++) {
//			for(int j=i; j<num; j++) {
//				bw.write(" ");	
//			}
//			for(int j=0; j<i*2-1; j++) {
//				bw.write("*");	
//			}
//			bw.write("\n");
//		}
//		
//		for(int i=num-1; i>=1; i--) {
//			for(int j=i; j<num; j++) {
//				bw.write(" ");	
//			}
//			for(int j=0; j<i*2-1; j++) {
//				bw.write("*");	
//			}			
//			bw.write("\n");
//		}	
//	      br.close();
//	      bw.flush();
//	      bw.close();
//	}
//
//}
