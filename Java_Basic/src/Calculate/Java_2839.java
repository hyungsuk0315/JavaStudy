package Calculate;

import java.util.Scanner;

public class Java_2839 {

	public static void main(String[] args) {
		//5kg 3kg 짜리 설탕봉지가 있다. 이것을 최소한의 봉지 수로 주문받은 양을 옮겨라
		//5와 3으로 불가능 하면 -1을 출력하라
		//IDEA : 주문할 양을 Nkg에 받고 그것을 5로 나눠 나머지가 0이라면 5로 나눈 몫의 봉지 수 만큼 가져가는 것이 최선이다
		//만약 5로 나누어떨어지지 않는다면 3을 뺀다.
		//그리고 다시 5로 나누어 본다.
		//Nkg <= 0 가 될때까지 반복한다.
		Scanner sc = new Scanner(System.in);
		int Nkg = sc.nextInt();
		int five,three;
		three = 0;
		five = 0;
		while(Nkg > 0) {
			if(Nkg % 5 == 0)
			{
				five = Nkg/5;
				Nkg = 0;
			}
			else
			{
				Nkg -= 3;
				three++;
			}
		}
		if(Nkg == 0)
			System.out.println(five+three);
		else
			System.out.println("-1");
	}
}
