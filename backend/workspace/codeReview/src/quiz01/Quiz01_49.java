
package quiz01;

/*
 * [진혜정]
 * - 수고하셨습니다.
 */

import java.util.Scanner;

public class Quiz01_49 {
	
	public static int factorial(int userValue) {
		if (userValue == 1) {
			return 1;
		} else {
			return userValue * factorial(userValue-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if(userValue >= 1 && userValue <= 10)
			break;
		}
		
		System.out.printf("%d! : %d", userValue, factorial(userValue));
		
		input.close();
	}
	
}
