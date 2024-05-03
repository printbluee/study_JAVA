package test;

import java.util.Scanner;

public class Quiz01_1 {
	
    public static void main(String[] args) {
       
    	Scanner input = new Scanner(System.in);
    	int userValue = 0;
    	
        // 1. 반복문 내 : 사용자 정수 1개 입력
    	do {
    		System.out.print("1 ~ 10 사이의 정수 입력 : ");
    		userValue = input.nextInt();
    	} while (userValue < 1  || userValue > 10); // 반복 조건
        
    	// 2. 팩토리얼 출력 : 메소드 호출
    	System.out.println(userValue + "!= " + factorial(userValue));
    	
        // 3. 메모리 해제
        input.close();
    }
    
    // [재귀 메소드] recursive method
    public static int factorial(int number) {
		if (number == 1) {
			return 1;
		}
    	return number * factorial(number - 1);
	}
}
