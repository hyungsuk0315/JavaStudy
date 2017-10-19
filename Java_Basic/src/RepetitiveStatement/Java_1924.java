package RepetitiveStatement;

import java.util.Scanner;

public class Java_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int date = sc.nextInt();
		String Day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		if(month < 0 || month >12)
		{
			System.out.println("Input Range : 1-12");
			return;
		}
		if(month == 1)
		{
			System.out.println(Day[date%7]);
			return;
		}
		for(int i = 1 ; i < month ; i++)
		{
			if(i == 1 || i == 3 || i == 5 || i==7 || i==8 || i==10 || i==12)
				date += 31;
			else if(i ==2)
				date += 28;
			else 
				date += 30;
		}
		System.out.println(Day[date%7]);
		return;
	}

}
