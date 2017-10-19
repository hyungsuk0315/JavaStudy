package RepetitiveStatement;

import java.util.Scanner;

public class Java_2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0 ; i < x ; i++)
		{
			for(int j = 0 ; j < i ; j++)
				System.out.printf(" ");
			for(int j = x- i ; j > 0 ; j--)
				System.out.printf("*");
			System.out.println();
		}
	}

}
