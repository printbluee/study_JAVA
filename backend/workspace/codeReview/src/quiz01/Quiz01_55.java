
package quiz01;

/*
 * [진혜정]
 * - 사용자가 1 ~ 10 사이의 정수를 입력하거나 이외의 정수를 입력했을 때,
 *   문제의 출력 문구가 다르고, 실행이 종료됩니다.
 * - 팩토리얼 계산식이 없습니다.
 */

import java.util.Scanner;

public class Quiz01_55 {

	public static void main(String[] args) {
		//1번
		Scanner input = new Scanner(System.in);
		System.out.println("1~10 사이의 정수 입력하세요.");
		int userValue = input.nextInt();
		
		if(userValue <= 10) {
			System.out.println("1~10사이의 정수입니다");
		} else if(userValue != 10) {
			System.out.println("1~10사이의 정수가 아닙니다");
		}
		
		
		input.close();
	}
		
}
