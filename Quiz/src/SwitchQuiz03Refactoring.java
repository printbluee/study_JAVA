/*
 * [문제]=========================
 * 정수 2개와 사칙연산 기호를 입력받은 후,
 * 식과 계산된 값을 출력하시오.
 * 단, 정수 먼저 입력받기
 * 
 * [입력 형태]
 * 정수 2개를 입력하세요...5 2
 * 사칙연산(+, -, *, /) 중 하나를 입력하세요...+
 * 
 * [출력 형태]
 * 5 + 2 = 7
 * 
 * +, -, *, / 이외의 사칙연산 기호를 입력했을 경우,
 * 잘못된 연산자를 입력했군요! 를 출력하시오.
 */
import java.util.Scanner;

public class SwitchQuiz03Refactoring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요...");
		int v1 = scanner.nextInt();
		int v2 = scanner.nextInt();
		
		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하세요...");
		String fbo = scanner.next();
		
		int result = 0;
		
		switch(fbo) {
		case "+": 
			result = v1 + v2;
			break;
		case "-":
			result = v1 - v2;
			break;
		case "*":
			result = v1 * v2;
			break;
		case "/":
			result = v1 / v2;
			break;
		default:
			System.out.println("잘못된 연산자를 입력했군요!");
		}

		System.out.println(v1 + " " + fbo + " " + v2 + " = " + result);
		
		scanner.close();
	}

}
