package Test5;

import java.util.*;
import java.io.*;

public class Test5_7 {

	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] name = new String[20]; 
		double[] score = new double[20];
		String[] cl = new String[20];
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			name[i] = st.nextToken();
			score[i] = Double.parseDouble(st.nextToken());
			cl[i] = st.nextToken();
		}
		double sum = 0;
		double div = 0;
		
		for(int i=0; i<20; i++) {
			if(cl[i].equals("A+")) {
				sum +=(score[i]*4.5);
				div +=score[i];
			}
				else if(cl[i].equals("A0")) {
				sum += (score[i]*4.0);
				div +=score[i];
				}
			else if(cl[i].equals("B+")) {
				sum += (score[i]*3.5);
				div +=score[i];
			}
			else if(cl[i].equals("B0")) {
				sum += (score[i]*3.0);
				div +=score[i];
			}
			else if(cl[i].equals("C+")){
				sum += (score[i]*2.5);
				div +=score[i];
			}
			else if(cl[i].equals("C0")) {
				sum += (score[i]*2.0);
				div +=score[i];
			}
			else if(cl[i].equals("D+")) {
				sum += (score[i]*1.5);
				div +=score[i];
			}
			else if(cl[i].equals("D0")) {
				sum += (score[i]*1.0);
				div +=score[i];
			}
			else if(cl[i].equals("P")) {
				sum += 0;
			}
			else if(cl[i].equals("F")) {
				sum += 0;
				div +=score[i];
			}
		
		}
		
		String result = String.format("%.6f", sum/div);
		bw.write(result +"");
		br.close();
		bw.flush();
		bw.close();
	
	}
}
