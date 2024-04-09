
/*
 * [ 과제 6 ]
 * 월을 입력받은 후,계절을 출력하시오.
 * 
 * << 입력 형태 >>
 * 계절은 봄입니다.
 * 
 * [참고]
 * 12, 1, 2 : 겨울
 * 3, 4, 5 	: 봄
 * 6, 7, 8  : 여름
 * 9, 10 ,11: 가을
 */

import java.util.Scanner;

public class SwitchQuiz01Refactoring {

	public static void main(String[] args) {
		
		// 1. 사용자에게 월을 입력받기 위해 scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 사용자에게 숫자 입력 받기
		System.out.print("숫자로 월을 입력하세요. : ");
		int month = input.nextInt();
		
		String season = ""; // 빈 문자열
		
		switch (month) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			System.out.println(month + "월이라니!");
			System.out.print("1 ~ 12 중에 입력해주세요.");
		}
		
		// 입력값이 1 ~ 12 일 경우만, 출력되도록 코드 작성하시오.
		System.out.print("계절은 " + season + "입니다.");
			

		input.close();
	}

}
