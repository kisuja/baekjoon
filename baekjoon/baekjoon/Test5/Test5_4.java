//package Test5;
//
//import java.util.*;
//import java.io.*;
//
//public class Test5_4 {
//
//	public static void main(String[] arg) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		String a = st.nextToken();
//		String b = a.toLowerCase();
//		int[] cnt = new int[125];
//		int num =0;
//		int ch = 0;
//		int same=0;
//		for(int i=0; i<a.length(); i++) {
//			for(int j = 65; j<125; j++) {
//				if(b.charAt(i)==j)
//					cnt[j] +=1;
//			}
//		}
//		for(int i=65; i<125; i++) {
//			if(cnt[i]>num) { 
//				num = cnt[i];
//				if(num == 1)
//					ch = a.charAt(0);
//				else
//					ch = i;
//			}
//		}
//		
//		for(int i=65; i<125; i++) {
//			if(cnt[i] == num)
//				same+=1;
//		}
//		if(same>1&&num!=1)
//			bw.write("?");
//		else {
//			if(ch>=65&&ch<=90)
//				bw.write((char) (ch+32)+"");
//			else
//				bw.write((char) (ch-32)+"");
//		}
//		
//		br.close();      
//		bw.flush();
//		bw.close();
//	}
//}
