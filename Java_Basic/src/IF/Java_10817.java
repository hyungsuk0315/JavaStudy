package IF;

import java.util.Scanner;

public class Java_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] A;
		A = new int[10];
		for(int i = 0 ; i < 3 ; i++)
			A[i] = sc.nextInt();
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = i ; j < 3 ; j++)
			{
				if(A[i] > A[j])
				{
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		System.out.println(A[1]);
	}

}
