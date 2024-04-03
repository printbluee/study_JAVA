import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {
		
		/*
		 * 1 ~ 10 사이의 정수 1개를 입력받은 후,
		 * 랜덤값을 생성하여 사용자가 입력한 정수를 맞추기
		 * 
		 * < 입력 형태 >
		 * 1 ~ 10 사이의 정수 1개를 입력 >> 3
		 * 
		 * < 출력 형태 >
		 * 7 1 8 7 3
		 * 5회 실행해서 찾았다 !
		 * 
		 */
		
		// 1. scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 사용자에게 정수 입력 받기
		System.out.print("1 ~ 10 사이의 정수 1개를 입력 >> ");
		
		// 3. 초기값 설정
		int userValue = input.nextInt(); // 사용자 입력값
		int radom = 0; 					// 랜덤값
 		int count = 0; 					// 횟수
		
 		// 4. 조건문 실행
		while (true) {
			count++; // 실행될 때마다 1 증감식
			
			radom = (int)(Math.random() * 10) + 1; // 1 ~ 10
			System.out.printf("%d ", radom);
			
			if (userValue == radom) { // 탈출 조건
				break;
			}
		}
		
		// 5. 반복문 실행 횟수 출력
		System.out.printf("\n%d회 실행해서 찾았다 !", count);
		
		// 6. 메모리 해제
		input.close();
	}
}
