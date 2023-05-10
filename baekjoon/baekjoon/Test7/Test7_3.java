//package Test7;
//
//import java.io.*;
//
//public class Test7_3 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int[] pft = new int[10000];
//		int[] cnt = new int[10000]; 
//		for(int i=0; ;i++) {
//			int sum = 0;
//			int num = Integer.parseInt(br.readLine());
//			if(num==-1)
//				break;
//			
//			for(int j=1; j<num; j++) {
//				if(num%j==0)
//					sum +=j;
//			}
//			if(sum==num)
//				pft[i] = 1;
//			else
//				pft[i] = 0;
//			cnt[i] = num;
//		}
//		
//		for(int i=0; i<pft.length; i++) {
//			if(cnt[i]==0)
//				break;
//			if(pft[i]==1) {
//				bw.write(cnt[i]+" = 1");
//				for(int j=2; j<cnt[i]; j++) {
//					if(cnt[i]%j==0) {
//						bw.write(" + "+j);
//					}
//				}
//			}
//			else
//				bw.write(cnt[i] + " is NOT perfect.");
//			bw.write("\n");	
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
