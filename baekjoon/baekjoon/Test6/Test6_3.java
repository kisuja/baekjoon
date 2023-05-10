//package Test6;
//
//import java.io.*;
//import java.util.*;
//
//public class Test6_3 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[][] a = new String [5][15];
//		String str = "#";
//		String nstr = "";
//		int ch = 0;
//		for(int i=0; i<5; i++) {
//			String b = br.readLine().trim();
//			b = b.replace(" ", "");
//			ch = b.length();
//			for(int j=0; j < 15-ch; j++) {
//				b+=str;
//			}
//			a[i] = b.split("");	
//		}
//		
//		for(int i=0; i<15; i++) {
//			for(int j=0; j<5; j++) {
//				nstr+=a[j][i];
//			}
//		}
//		nstr = nstr.replace("#", "");
//		
//		bw.write(nstr);
//		br.close();
//		bw.flush();
//		bw.close();
//	}
//
//}
