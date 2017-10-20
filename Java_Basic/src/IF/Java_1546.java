package IF;

import java.util.Scanner;

public class Java_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] score;
		double sum=0;
		score = new double[n];
		for(int i = 0 ; i < n ; i++)
		{
			score[i] = sc.nextDouble();
		}
		for(int i = 0 ; i < score.length ; i++)
		{
			for(int j = i ; j < score.length; j++)
			{
				if(score[i] > score[j])
				{
					double temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			sum += score[i];
		}
		sum = sum/score[score.length-1] *100;
		System.out.printf("%.2f",sum/n);
		
	}

}
