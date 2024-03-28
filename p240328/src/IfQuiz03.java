
/*
 * [ 과제 4 ] ===========================
 * 사용자에게 정수 2개를 입력받은 후,
 * 큰 값과 작은 값을 출력하시오.
 * 
 * << 입력 형태 >>
 * 정수 2개를 입력하세요 ... 7 9 
 * 
 * << 출력 형태 >>
 * 큰 값 : 9, 작은 값 : 7
 * 
 * ====================================
 */

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		// 1. 사용자에게 입력받기 위해 scanner 객체 생성
		System.out.print("정수 2개를 입력하세요 ... ");
		Scanner input = new Scanner(System.in);
		
		// 2. 사용자에게 입력받은 값을 각 변수에 저장
		int userValue1 = input.nextInt();
		int userValue2 = input.nextInt();
		
		// 3. 조건문 실행
		if (userValue1 > userValue2) { // userValue1 가 userValue2 보다 클 때
			System.out.println("큰 값 : " + userValue1 + " 작은 값 : " + userValue2);
		} else if (userValue1 < userValue2) { // userValue1 가 userValue2 보다 작을 때
			System.out.println("큰 값 : " + userValue2 + " 작은 값 : " + userValue1);
		} else if (userValue1 == userValue2) { // userValue1 와 userValue2 같을 때
			System.out.println("userValue1 의 값과 userValue2 의 값이 같습니다.");
		} 
		
		// 4. scanner 닫기(오류 방지)
		input.close();
		
	}

}
