package exception;

/*
 * [예외 처리]
 * 1. try ~ catch ~ finally(선택) : 직접 						// 예측 가능
 * 2. throws : 전가 -> 예외가 발생된 메소드를 호출한 메소드		// 예측 불가능
 * 
 * 
 * try ~ catch ~ finally
 * : 문법
 * : try 구문에 catch 는 여러 개 올 수 있고, finally 는 하나만 옴
 * try {
 * 		// 예외가 발생되는 명령어
 * } catch(예외클래스 참조변수) {
 * 		// 예외가 발생했을 때, 실행하고자 하는 명령어
 * } catch(예외클래스 참조변수) {
 * 		// 예외가 발생했을 때, 실행하고자 하는 명령어
 * } finally {
 * 		// 선택사항
 * 		// 예외 발생 여부와상관없이, 무조건 실행되는 영역
 * }
 * 
 */

import java.util.Scanner;

public class Ex02 {

	public static void inputData() {

		System.out.println("[inputData method] ==> 시작");
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int result1 = 0;
		int result2 = 0;

		try {
			// 예외가 발생되는 명령어
			result1 = n1 / n2;
			result2 = n1 % n2;
			
			// 출력하는 부분은 try 부분에 넣었기 때문에 result1 와 result2 를 try 밖에 선언함
			// 만약 try 내에 변수 선언 한다면 실행되지 않을 때 에러가 생김 그럼 지역변수가 되어버림
			System.out.println("몫 : " + result1);
			System.out.println("나머지 : " + result2);
//		} catch (ArrayIndexOutOfBoundsException e){
//			System.out.println("인덱스 확인하세요 !");
//			System.out.println("e >> " + e);
//		} catch (ArithmeticException e) {
//			System.out.println("분모가 0으로 계산 불능");
//			System.out.println("e >> " + e);
//			e.printStackTrace();
		} catch (Exception e) { // 다형성이 구현됨
			System.out.println("[Exception] 영역 실행 !");
		} finally {
			// 예외 발생 여부와 상관없이 실행하고자 하는 코드
			System.out.println("[finally] 예외 처리 종료");
		}
		
		input.close();
		System.out.println("[inputData method] ==> 종료");
	}
	
	public static void main(String[] args) {
		
		System.out.println("[main method] >> 시작");
		
		inputData();
		
		System.out.println("[main method] >> 끝");
		
	}
}
