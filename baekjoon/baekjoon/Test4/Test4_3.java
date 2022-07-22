package Test4;
import java.util.Scanner;

public class Test4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt=0;
		int sum1 = a*b*c;
		for(;;) {
			sum1 = sum1/10;
			cnt++;
			if(sum1 ==0) 
				break;
		}
		int sum2 = a*b*c;
		int d[] = new int[cnt];
		for(int i = 0; i<cnt; i++) {			
			d[i] = sum2%10;
			sum2= sum2/10;
		}
		int e[] = new int[10];
		for(int i =0; i<cnt; i++) {
			for(int j = 0; j<10; j++) {
				if(j==d[i]) {
					e[j]++;
				}
			}
		}
		for(int i=0; i<10; i++) {
			System.out.println(e[i]);
		}
		
		
	}
}