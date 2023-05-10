//package Test5;
//
//import java.util.*;
//import java.io.*;
//
//class Mbd{
//		
//	int arr[];
//	int begin;
//	int end;
//	int mid;
//	
//	Mbd(int begin, int end, int mid, int[] arr){
//		this.arr = arr;
//		this.begin = begin;
//		this.end = end;
//		this.mid = mid;
//		
//	}
//	
//	
//	public int[] mkbd(int[] narr) {
//		for(int i=0; i< end - mid+1; i++) {
//			for(int j=0; j<narr.length-1; j++) {
//				narr[j+1] = arr[begin-1+j];
//			} 
//			narr[0] = arr[end-1];
//			
//			for(int j=begin-1; j<end; j++) {		
//				arr[j] = narr[j-begin+1];
//			}			
//		}
//		return narr;
//	}
//}
//
//public class Test5_2 {
//
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer n = new StringTokenizer(br.readLine());
//		int num = Integer.parseInt(n.nextToken());
//		int cnt = Integer.parseInt(n.nextToken());
//		int arr[] = new int[num];
//
//		for(int i=0; i<num; i++) 
//			arr[i] = i+1;
//		
//		for(int i=0; i<cnt; i++) {
//			StringTokenizer nn = new StringTokenizer(br.readLine());
//			int begin = Integer.parseInt(nn.nextToken());
//			int end = Integer.parseInt(nn.nextToken());
//			int mid = Integer.parseInt(nn.nextToken());
//			
//			int narr[] = new int[end - begin + 1];
//
//			
//			Mbd mbd = new Mbd(begin, end, mid, arr);
//			
//
//				narr = mbd.mkbd(narr);
//
//			arr = mbd.arr;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			bw.write(arr[i]+" ");
//		}
//
//		br.close();      
//		bw.flush();
//		bw.close();
//	}
//
//}
