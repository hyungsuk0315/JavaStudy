package IOStream;

import java.util.Scanner;

public class Java_11718 {
//hasNext()는 입력이 있으면 true 없으면 있
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str1 = sc.nextLine();
			System.out.println(str1);
		}
	}

}
