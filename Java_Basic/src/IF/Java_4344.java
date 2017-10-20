package IF;

import java.util.Scanner;

public class Java_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test case number
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		//score array
		double[] score;
		for(int i = 0 ; i < n1 ; i++)
		{
			//sum for average
			double sum = 0;
			//student number
			int n2 = sc.nextInt();
			//score array size
			score = new double[n2];
			
			for(int j = 0 ; j < n2 ; j++)
			{
				//input student's score $ add score to sum
				score[j] = sc.nextDouble();
				sum += score[j];
			}
			//make sum into average
			sum /= n2;

			//count students who have low score than average
			int count = 0;
			for(int j = 0 ; j < n2 ; j++)
			{
				if(score[j] > sum)
				{
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (double)count/n2*100);
		}
	}

}
