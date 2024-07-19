import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {

		/*
		 * [ 과제 1 ]==========================================
		 * 사용자에게 정수 2개를 입력받은 후, 큰 값 출력받기
		 * 
		 * < 출력 문구 >
		 * 서로 다른 정수 2개 입력 : 
		 * 큰 값 >> 
		 * 
		 * ==================================================
		 */
		
		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		//2. 사용자에게 정수 2개 입력받기
		System.out.println("서로 다른 정수 2개 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// 3. 사용자에게 받은 정수 2개 비교하여 큰 값을 변수 result 에 저장
		// 삼항 연산자 사용 
//		int result = (num1 > num2) ? num1 : num2;
		
		// 조건문 사용
		// if 문 안에서 변수 선언은 선호 x
		int result; 
		
		if (num1 > num2) {
			result = num1;
			System.out.println("큰 값 >> " + result);
		} else if (num1 < num2) {
			result = num2;
			System.out.println("큰 값 >> " + result);
		} else {
			System.out.println("오류 !");
		}
		
		// 4. 큰 값인 변수 result 출력
//		System.out.println("큰 값 >> " + result);
		
		// 5. scanner 닫기(메모리 해제)
		input.close();
	}
}