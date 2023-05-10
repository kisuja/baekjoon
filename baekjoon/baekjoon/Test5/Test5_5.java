//package Test5;
//
//import java.util.*;
//import java.io.*;
//
//public class Test5_5 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		String a = st.nextToken();
//	
//		a = a.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "a");
//		
//		bw.write(a.length()+"");
//		
//		br.close();
//		bw.flush();
//		bw.close();
//	}
//
//}
