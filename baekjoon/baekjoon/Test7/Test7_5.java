//package Test7;
//
//import java.io.*;
//
//public class Test7_5 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int m = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
//		int min = 10000;
//		int sum = 0;
//		
//		for(int i=m; i<=n; i++) {
//			int cnt=0;
//			for(int j=1; j<=i; j++) {
//				if(i%j==0)
//					cnt++;			
//			}
//			if(cnt==2) {
//				sum+=i;
//				if(i<min)
//					min=i;
//				
//			}
//		}
//		if(sum==0)
//			bw.write("-1");
//		else
//			bw.write(sum+"\n"+min);
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
