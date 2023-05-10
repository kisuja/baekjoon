//package Test7;
//
//import java.util.*;
//import java.io.*;
//
//public class Test7_1 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] str = new String[100000];
//		int cnt=0;
//		for(int i=0; i<100000; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int num1 = Integer.parseInt(st.nextToken());
//			int num2 = Integer.parseInt(st.nextToken());
//			if(num1==0&&num2==0)
//				break;
//			if(num1<=num2) {
//				if(num2%num1==0)
//					str[i] = "factor";
//				else
//					str[i] = "neither";
//			}
//			else if(num1>num2) {
//				if(num1%num2==0)
//					str[i] = "multiple";
//				else
//					str[i] = "neither";
//			}
//			cnt++;
//		}
//		for(int i=0; i<cnt; i++) {
//			bw.write(str[i]+"\n");
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
