/*
 * [ 과제 3 ]
 * 
 * 성별(1 or 2 or 3 or 4)을 입력받은 후,
 * '남자입니다.' 또는 '여자입니다'를 출력하시오.
 * 
 * 1, 2, 3, 4 이 외의 값을 입력했을 경우,
 * '잘못된 값을 입력했습니다.' 을 출력하시오.
 * 
 * << 입력 형태 >>
 * 성별 1, 2, 3, 4 중 하나 입력하세요 ... 
 * 
 * << 출력 형태 >>
 * 남자입니다.
 * 여자입니다.
 */

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		// 1. 사용자에게 입력받기 위해 scanner 객체 생성
		System.out.print("성별 1, 2, 3, 4 중 하나 입력하세요 ... ");
		Scanner input = new Scanner(System.in);
		
		// 2. 사용자에게 입력받은 값을 변수에 저장
		byte user = input.nextByte();
		
		// 3. 조건문 실행
		if (user == 1 || user == 3) { // user 의 값이 1 또는 3일 때
			System.out.println("남자입니다.");
		} else if (user == 2 || user == 4) { // user 의 값이 2 또는 4일 때
			System.out.println("여자입니다.");
		} else { // user 의 값이 1 ~ 4 가 아닐 때
			System.out.println("잘못된 값을 입력했습니다.");
		}
		
		// 4. scanner 닫기(오류 방지)
		input.close();		
	}

}
