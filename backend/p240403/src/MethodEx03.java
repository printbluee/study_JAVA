
/*
 * [ 반복문 ] ====================================
 * 특정 코드가 연속적으로 반복 ==> 반복문으로 구현
 * 
 * [ 메서드 정의 ] ===============================
 * 특정 코드가 불연속적으로 반복 ==> 메서드 정의
 * - < 모듈화 >라고 함
 * 
 * 
 */

import java.util.Scanner;

public class MethodEx03 {

	public static void main(String[] args) {

		int num = 5;
		
		num++;
		System.out.println("1 증가 >> " + num);
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개 입력 >> ");
		int userNumber = input.nextInt();
		input.close();

		userNumber++;
		System.out.println("1 증가 >> " + userNumber);
		
		int var = 10;
		
		var++;
		System.out.println("1 증가 >> " + var);
		
		
		
	}
}
