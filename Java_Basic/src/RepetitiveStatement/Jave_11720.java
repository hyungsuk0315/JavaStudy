package RepetitiveStatement;

import java.util.Scanner;

public class Jave_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		for(int i =0 ; i<n ;i++)
		{
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
