package IF;

import java.util.Scanner;

public class Java_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = N;
		int M;
		int cnt = 0;
		do {
		//각 자리 수를 더함
		M = (N%10) + (N/10);
		System.out.println("M:"+M);
		N = (N%10)*10 + (M%10);
		System.out.println("N:"+N);
		cnt++;
		}while(temp != N);
		System.out.println(cnt);
	}

}
