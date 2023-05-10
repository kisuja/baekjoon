//package Test7;
//
//import java.util.*;
//import java.io.*;
//
//public class Test7_4 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		int pt = 0;
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i=0; i<num; i++) {
//			int cnt = 0;
//			int a = Integer.parseInt(st.nextToken());
//			for(int j=1; j<=a; j++) {
//				if(a%j==0)
//					cnt++;					
//			}
//			if(cnt==2)
//				pt++;
//		}
//		bw.write(pt+"");
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
