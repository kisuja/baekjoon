//package Test5;
//
//import java.util.*;
//import java.io.*;
//
//public class Test5_6 {
//
//	public static void main(String[] arg) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int num = Integer.parseInt(st.nextToken());
//		int group=0;
//		
//		for(int i=0; i<num; i++) {
//			String a = br.readLine();
//			int tf=0;
//			int cnt[] = new int[123];
//			for(int j = 0; j<a.length(); j++) {
//				for(int k = 96; k<123; k++) {
//					if(a.charAt(j)==k) {
//						cnt[k]++;
//					}
//					if(cnt[k]>1) {
//						if(a.charAt(j)==a.charAt(j-1)&&a.charAt(j)==k)
//							cnt[k]--;
//					}
//				}
//			}
//			for(int j = 96; j<123; j++) {
//				if(cnt[j]>1)
//					tf++;
//			}
//			if(tf==0)
//				group++;
//		}
//		bw.write(group+"");
//		br.close();
//		bw.flush();
//		br.close();
//	}
//}
