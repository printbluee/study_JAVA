
package quiz01;

/*
 * [진혜정]
 * - 메모리 해제 안하셨습니다.
 * - 공통된 부분이 있는데 하나씩 다 입력하는건 조건문을 사용하는 의미가 없습니다.
 * - "1~10 사이의 정수 입력 : " 가 아닌 "정수 1개를 입력하세요" 문구는 문제 출력 문구에 없습니다
 * 
 */

import java.util.Scanner;
public class Quiz01_52 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("정수 1개를 입력하세요");
		int userValue = input.nextInt();
		
		if (userValue < 10);
		System.out.println("정수 1개를 입력하세요");
		
		
		if (userValue == 1) 
			System.out.println(userValue + "! : " + "1");
		else if (userValue == 2)
			System.out.println(userValue + "! : " + "2");
		else if (userValue == 3)
			System.out.println(userValue + "! : " + "6");
		else if (userValue == 4)
			System.out.println(userValue + "! : " + "24");
		else if (userValue == 5)
			System.out.println(userValue + "! : " + "120");
		else if (userValue == 6)
			System.out.println(userValue + "! : " + "720");
		else if (userValue == 7)
			System.out.println(userValue + "! : " + "5040");
		else if (userValue == 8)
			System.out.println(userValue + "! : " + "40320");
		else if (userValue == 9)
			System.out.println(userValue + "! : " + "362880");
		else if (userValue == 10)
			System.out.println(userValue + "! : " + "3628800");

	}

}

