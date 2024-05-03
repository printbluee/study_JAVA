package test;

import java.util.Scanner;

/*
 * [문제] 
 * 사용자에게 정수 하나를 입력받아, 팩토리얼 값을 구하려고 한다.
 * 단, 입력 값은 10 ~ 20 까지의 정수만 입력되도록 한다.
 * 만약 10 ~ 20 이외의 값을 입력하면, 다시 입력 받도록 한다.
 * 
 * <출력 문구>
 * 10 ~ 20 사이의 정수 입력 : 10
 * 10! = 3628800
 *  
 * 1-1. 정수형 변수 userValue 를 선언하며, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
 * 1-2. 사용자가 10 ~ 20 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
 * 1-3. 사용자가 입력한 (10 ~ 20 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
 */

public class Test01 {
	
	public static long factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userValue = 0;
		
		do {
			System.out.print("10 ~ 20 사이의 정수 입력 : ");
			userValue = input.nextInt();
			
		} while (userValue < 10 || userValue > 20);
		
		System.out.printf(userValue + "! = " + factorial(userValue));
		
		input.close();
	}
}
