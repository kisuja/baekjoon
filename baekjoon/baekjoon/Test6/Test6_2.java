//package Test6;
//
//import java.util.*;
//import java.io.*;
//
//
//public class Test6_2 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int[][] a = new int[9][9];
//		for(int i=0; i<9; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			for(int j=0; j<9; j++) {
//				a[i][j] = Integer.parseInt(st.nextToken());
//			}
//		}
//		int max=0;
//		int x=0;
//		int y=0;
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<9; j++) {
//				if(max<a[i][j]) {
//					max = a[i][j];
//					x=i;
//					y=j;
//				}
//			}
//		}
//		
//		bw.write(max+"\n");
//		bw.write((x+1)+" "+(y+1));
//		
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
