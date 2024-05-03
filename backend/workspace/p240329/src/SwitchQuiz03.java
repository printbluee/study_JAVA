import java.util.Scanner;

public class SwitchQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * [ 과제 ]
		 * 정수 2개와 사칙연산 기로를 입력받은 후,
		 * 식과 계산된 값을 출력하시오.
		 * 단, 정수 먼저 입력받기
		 * 
		 * < 입력 형태 >
		 * 정수 2개를 입력하세요 ... 0 0
		 * 사칙연산 (+, -, *, /) 중에 하나나를 입력하세요 ... &
		 * 
		 * < 출력 형태 >
		 * 0 & 0 = 0
		 * 
		 * 사용자가 +, -, *, / 이 외의 사칙연산 기호를 입력했을 경우,
		 * '잘못된 연산자를 입력했군요!' 를 출력하시오.
		 * 
		 */
		
		// 1. scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 2개 입력
		System.out.print("정수 2개를 입력하세요 ... ");
		int userValue1 = input.nextInt(); // 1번째로 받는 정수 
		int userValue2 = input.nextInt(); // 2번째로 받는 정수 
		
		// 3. 연산자 1개 입력
		System.out.print("사칙연산 (+, -, *, /) 중에 하나나를 입력하세요 ... ");
//		input.nextLine();
//		char userSymbol = input.next().charAt(0); // 아직 char 로 받는건 배우지 않았음
		String userSymbol = input.next(); 
		
		// 4. 식과 값 출력
		switch (userSymbol) {
		case "+":
			 System.out.println(userValue1 + userSymbol + userValue2 + " = " + (userValue1 + userValue2));
			break;
		case "-":
			System.out.printf(userValue1 + userSymbol + userValue2 + " = " + (userValue1 - userValue2));
			break;
		case "*":
			System.out.printf(userValue1 + userSymbol + userValue2 + " = " + (userValue1 * userValue2));
			break;
		case "/":
			System.out.printf(userValue1 + userSymbol + userValue2 + " = " + (userValue1 / userValue2));
			break;
		default:
			System.out.println("잘못된 연산자를 입력했군요!");
		}
		
		
		
		// 5. 메모리 해제
		input.close();
	}

}
