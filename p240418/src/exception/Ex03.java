package exception;

/*
 * [예외 처리]
 * 1. try ~ catch ~ finally(선택) : 직접 						// 예측 가능
 * 2. throws : 전가 -> 예외가 발생된 메소드를 호출한 메소드		// 예측 불가능
 * 
 * throws : 전가
 * 예외가 발생되는 지점은 메소드
 * 메서드 선언부에 정의하기
 * : 문법
 * 메소드명() throws Exception {
 * 		// 
 * }
 * main(String[] args) {
 * 		try {
 * 			메소드명()
 * 		} catch (Exception e) {
 * 			// 		
 * 		}
 * }
 */

import java.util.Scanner;

public class Ex03 {

	public static void inputData() throws Exception {
		
		System.out.println("[inputData method] ==> 시작");
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result1 = 0;
		int result2 = 0;

		
		result1 = n1 / n2;
		result2 = n1 % n2;
		
		System.out.println("몫 : " + result1);
		System.out.println("나머지 : " + result2);
		
		input.close();
		System.out.println("[inputData method] ==> 종료");
	}
	
	public static void main(String[] args) {
		
		System.out.println("[main method] >> 시작");
		
		// [과제]
		// catch (ArithmeticException e) 이 부분이 실행되는 이유 알아오기
		// 코드에 추가적으로 catch (ArithmeticException e) 부분과 catch(Exception e) 부분에 
		// System.out.println("e >> " + e); 찍었을 때 같은 값이 나오는데, 
		// 코드가 위에서 아래로 실행되기 때문에 catch (ArithmeticException e) 부분에 실행이 된다.
		// 하지만 에러가 생기는 이유는 타입이 맞지 않기 때문
		
		try {
			inputData();
		} catch (ArithmeticException e) {
			System.out.println("e >> " + e);
			System.out.println("[main] ArithmeticException 예외 처리 구문 실행");
		} catch(Exception e) {
			System.out.println("e >> " + e);
			System.out.println("[main] Exception 예외 처리 구문 실행");
		}
		
		System.out.println("[main method] >> 끝");
		
	}
}