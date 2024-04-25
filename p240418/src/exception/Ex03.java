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
		/*
		 * inpuData() 메소드에는 throws Exception 을 선언해서 inputData() 메소드가 호출할 때
		 * 발생하는 어떤 예외든 처리가 된다. 하지만 특정한 예외를 명시하지 않았을 뿐이지 
		 * ArithmeticException 도 포함된다고 알려주는 건 아닌데, 
		 * inputData() 메소드 내부에서 ArithmeticException 가 발생하면 처리할 throws 선언 목록에 없으니
		 * 바로 main () 메소드에서 이 예외를 처리한 것
		 * main() 메소드에 ArithmeticException 을 처리하는 catch 블록이 있기 때문에 catch 블록이 실행된다
		 */
		
		try {
			// 예외 발생 가능한 코드
			inputData();
		} catch (NullPointerException e) {
			System.out.println("실행1");
		} catch (ArithmeticException e) {
			System.out.println("실행2");
			System.out.println("e >> " + e);
			System.out.println("[main] ArithmeticException 예외 처리 구문 실행");
		} catch(Exception e) {
			System.out.println("실행3");
			System.out.println("e >> " + e);
			System.out.println("[main] Exception 예외 처리 구문 실행");
		}
		
		System.out.println("[main method] >> 끝");
		
	}
}