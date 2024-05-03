
package quiz01;

/*
 * [진혜정]
 * - 수고하셨습니다.
 */

import java.util.Scanner;

public class Quiz1_0 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userValue = 0;
		int factorial = 1;

		while (true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = scanner.nextInt();

			if (userValue >= 1 && userValue <= 10) {
				break;
			}
		}

		for (int i = 1; i <= userValue; i++) {
			factorial *= i;
		}
		System.out.println(userValue + "! : " + factorial);

		scanner.close();
	}

}
