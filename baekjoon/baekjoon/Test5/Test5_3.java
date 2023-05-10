//package Test5;
//
//import java.util.*;
//import java.io.*;
//
//public class Test5_3 {
//	public static void main(String[] arg) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		String a = st.nextToken();
//		String[] array = a.split("");
//		int tf = 1;
//		for(int i=0; i<array.length/2+1; i++) {
//			if(!array[i].equals(array[array.length-i-1])) {
//				if(i==array.length/2||i==array.length/2+1) {
//					tf = 1;
//					break;
//				}
//				else {
//					tf = 0;
//					break;
//				}				
//			}
//			else
//				continue;
//			
//		}
//		
//		bw.write(tf+"");
//		br.close();      
//		bw.flush();
//		bw.close();
//		
//	}
//}
