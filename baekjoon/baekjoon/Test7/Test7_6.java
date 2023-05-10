//package Test7;
//
//import java.io.*;
//
//public class Test7_6 {
//	public static void main(String args[]) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		
//		for(int i=0; ; ) {
//			if(num==1)
//				break;
//			else
//				for(int j=2; j<=num; j++) {
//					if(num%j==0) {
//						num = num/j;
//						bw.write(j+"\n");
//						break;
//					}
//				}
//
//				
//		}
//		br.close();
//		bw.flush();
//		bw.close();
//		
//		
//	}
//}
