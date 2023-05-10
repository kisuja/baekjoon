//package Test8;
//
//import java.util.*;
//import java.io.*;
//
//public class Test8_3 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n =Integer.parseInt(st.nextToken());
//		int k =Integer.parseInt(st.nextToken());
//		int nsum = 1;
//		int ksum = 1;
//		int nmksum = 1;
//		
//		if(k<0||k>n)
//			bw.write("0");
//		else {
//			for(int i=1; i<=n; i++) {
//				nsum = nsum*i;
//			}
//			
//			for(int i=1; i<=k; i++) {
//				ksum = ksum*i;
//			}
//		
//			for(int i=1; i<=n-k; i++) {
//				nmksum = nmksum*i;
//			}
//			bw.write(nsum/(ksum*nmksum)+"");
//			
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//}
