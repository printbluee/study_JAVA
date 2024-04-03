<<<<<<< HEAD
/*
 * 사용자에게 정수 1개를 입력 받은 후, 누적합 출력
 * 
 * < 입력 형태 >
 * 정수를 입력하세요(종료시 : -1 입력) >> 2
 * 정수를 입력하세요(종료시 : -1 입력) >> 3
 * 정수를 입력하세요(종료시 : -1 입력) >> -2
 * 정수를 입력하세요(종료시 : -1 입력) >> 7
 * 정수를 입력하세요(종료시 : -1 입력) >> -1
 * 
 * < 출력 형태 >
 * 총합 >> 10
 * 
 */

=======
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
import java.util.Scanner;

public class WhileQuiz05 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
=======
		/*
		 * 사용자에게 정수 1개를 입력 받은 후, 누적합 출력
		 * 
		 * < 입력 형태 >
		 * 정수를 입력하세요(종료시 : -1 입력) >> 2
		 * 정수를 입력하세요(종료시 : -1 입력) >> 3
		 * 정수를 입력하세요(종료시 : -1 입력) >> -2
		 * 정수를 입력하세요(종료시 : -1 입력) >> 7
		 * 정수를 입력하세요(종료시 : -1 입력) >> -1
		 * 
		 * < 출력 형태 >
		 * 총합 >> 10
		 * 
		 */
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		
		// 1. scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 초기값 설정
<<<<<<< HEAD
		int userValue = 0;	// 사용자 입력값
		int result = 0;		// 결과값의 초기값
		
		// 3. 조건문 실행
		while (true) {
			
			// 3-1. 사용자에게 정수 1개 입력 받기
			System.out.print("정수를 입력하세요(종료시 : -1 입력) >> ");
			userValue = input.nextInt();
			
			// 3-2. 사용자가 -1 입력시 종료 
			// 이 부분이 3번자리로 오면 나중에 누적합에 + 1 를 해야함
			if (userValue == -1) {
				break;
			}
			
			// 3-3. 누적합 대입
			result += userValue;
		}
		
		// 4. 출력
		System.out.printf("총합 >> %d", result); 
=======
		int userValue = 0; // 사용자 입력값
		int result = 0;					// 결과값의 초기값
		
		// 3. 조건문 실행
		while (true) {
			System.out.print("정수를 입력하세요(종료시 : -1 입력) >> ");
			userValue = input.nextInt();
			result += userValue;
			
			if (userValue == -1) {
				break;
			}
		}
		
		// 4. 출력
		System.out.printf("총합 >> %d", result+1); // -1 다시 +1 해주기..?
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		
		// 5. 메모리 해제
		input.close();
	}
<<<<<<< HEAD
}
=======

}
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
