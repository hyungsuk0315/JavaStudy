package RepetitiveStatement;

import java.util.Scanner;

public class Java_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(i % 10 ==0 && i != 0) System.out.println();
			System.out.printf("%c", str.charAt(i));
		}
	}

}
