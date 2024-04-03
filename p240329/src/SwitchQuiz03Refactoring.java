import java.util.Scanner;

public class SwitchQuiz03Refactoring {

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
<<<<<<< HEAD
		
		int result = 0;
		boolean isOperator = true; // 방법 3
=======
		int result = 0;
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		
		// 4. 식과 값 출력
		switch (userSymbol) {
		case "+":
			result = userValue1 + userValue2;
			break;
		case "-":
			result = userValue1 - userValue2;
			break;
		case "*":
			result = userValue1 * userValue2;
			break;
		case "/":
			result = userValue1 / userValue2;
			break;
		default:
<<<<<<< HEAD
			isOperator = false;
=======
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
			System.out.println("잘못된 연산자를 입력했군요!");
		}
		
		// 5. 3*7 = 21 -> 3 * 7 = 21 로 출력
<<<<<<< HEAD
		// [ +, -, *, / ] 연산자인 경우만 출력되도록 코드 작성하시오.
		
//		[ 방법 1 ]
//		switch (userSymbol) { // 실행은 되지만 조건이 하나인 경우에는 잘 쓰이지 않음
//		case "+": case "-": case "*": case "/": 
//			System.out.printf("%d %s %d = %d", userValue1, userSymbol, userValue2, result);
//		}
		
//		[ 방법 2 ]
//		if (userSymbol.equals("+") || userSymbol.equals("-") || userSymbol.equals("*") || userSymbol.equals("/")) {
//			System.out.printf("%d %s %d = %d", userValue1, userSymbol, userValue2, result);
//		}
		
//		[ 방법 3 ]
//		isOperator 자체가 t/f 이라 그냥 쓰면 됨
		if (isOperator) {
			System.out.printf("%d %s %d = %d", userValue1, userSymbol, userValue2, result);
		}
=======
		System.out.printf("%d %s %d = %d", userValue1, userSymbol, userValue2, result);
		
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		
		// 6. 메모리 해제
		input.close();
	}

}
