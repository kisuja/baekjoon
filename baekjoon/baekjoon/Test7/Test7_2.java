//package Test7;
//
//import java.util.*;
//import java.io.*;
//
//public class Test7_2 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int num1 = Integer.parseInt(st.nextToken());
//		int num2 = Integer.parseInt(st.nextToken());
//		int cnt = 0;
//		int result = 0;
//		for(int i=1; i<=num1; i++) {
//			if(num1%i==0) 
//				cnt++;
//			if(cnt==num2) {
//				result = i;
//				break;
//			}
//		}
//		
//		bw.write(result+"");
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
