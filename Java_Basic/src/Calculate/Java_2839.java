package Calculate;

import java.util.Scanner;

public class Java_2839 {

	public static void main(String[] args) {
		//5kg 3kg ¥�� ���������� �ִ�. �̰��� �ּ����� ���� ���� �ֹ����� ���� �Űܶ�
		//5�� 3���� �Ұ��� �ϸ� -1�� ����϶�
		//IDEA : �ֹ��� ���� Nkg�� �ް� �װ��� 5�� ���� �������� 0�̶�� 5�� ���� ���� ���� �� ��ŭ �������� ���� �ּ��̴�
		//���� 5�� ����������� �ʴ´ٸ� 3�� ����.
		//�׸��� �ٽ� 5�� ������ ����.
		//Nkg <= 0 �� �ɶ����� �ݺ��Ѵ�.
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
