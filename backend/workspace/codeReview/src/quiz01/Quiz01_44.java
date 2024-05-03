
package quiz01;

/*
 * [진혜정]
 * - 문제의 요구사항대로 입력값을 받지 않았습니다.
 * - 메모리 해제를 하지 않았습니다.
 * - continue 가 불필요하게 많이 사용됩니다.
 */

import java.util.Scanner;

public class Quiz01_44 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 1;
		
		System.out.println("1~10까지의 정수를 입력하세요");
		int userValue = input.nextInt();
		
		while(true) {
			if(userValue > 10) {
				System.out.println("다시입력하세요. ");
				userValue = input.nextInt();
				continue;
			} else if (userValue <= 1) {
				System.out.println("다시입력하세요");
				userValue = input.nextInt();
				continue;
			} else {
				num = userValue;
				break;
			}
		}
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}	
		
		System.out.println(num + "! : " + result);
	}

}
