package test0411;

import java.util.Scanner;

public class Quiz01_2 {

    public static void main(String[] args) {
       
    	Scanner input = new Scanner(System.in);
    	int userValue = 0;
    	int factortal = 1;
    	
        // 1. 무한 반복
    	//    반복문 내 : 사용자 정수 1개 입력
    	do {
    		System.out.print("1 ~ 10 사이의 정수 입력 : ");
    		userValue = input.nextInt();
    	} while (userValue < 1  || userValue > 10); // 반복 조건
        
    	// 2. 팩토리얼 출력 : 반복문
    	for (int i=1; i<=userValue; i++) {
    		factortal *= i;
    	}
    	
    	System.out.println(userValue + "!= " + factortal);
    	
        // 3. 메모리 해제
        input.close();
    }
}
