
package quiz01;

/*
 * [진혜정]
 * - factorial 메서드에서 for 의 범위가  i<num 이라 값이 이상하게 나옵니다.
 */

import java.util.Scanner;

public class Quiz01_54 {

	public static int factorial (int num) {
		 int factorial = 1;
		 for( int i =1; i<num ; i++) {
			 factorial = factorial * i;
		 }
		return factorial;
		 
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userValue = 0;
		
		while(true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
			if (userValue<1 || userValue>10) {
			} else {
				break;
			}
		}

		System.out.println(userValue+"! : " + factorial(userValue));
		input.close();
	}

}
