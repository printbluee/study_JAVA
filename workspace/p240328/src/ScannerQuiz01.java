import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * [ 문제 ]======================================
		 * 
		 * 정수 2개를 입력받은 후, 덧셈 결과를 출력하시오.
		 * 
		 * 출력 문구는 : 정수 2개 입력하세요...
		 * 
		 * ==============================================
		 */
		
		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 출력 문구 출력
		System.out.println("정수 2개 입력하세요...");

		// 3. 정수 2개 입력 받고, 변수에 저장
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//4. 정수 2개 값을 받은 변수를 더해 덧셈 결과 출력
		System.out.println("덧셈 결과 : " + (num1 + num2));
		
		//5. Scanner 닫기 
		input.close();
	}

}
