
/*
 * [ 문제 ]
 * 짝수 단과 홀수 단을 출력하시오.
 * 사용자가 0을 입력하면, 짝수 단을 출력
 * 사용자가 1을 입력하면, 홀수 단을 출력
 * 
 * < 입력 형태 >
 * 짝수 단은 0, 홀수 단은 1 을 입력하세요 ... 1
 * 
 * < 출력 형태 >
 * 3 * 1 = 3
 * 3 * 9 = 27
 * 
 * 5 * 1 = 5
 * ...
 * 
 * 9 * 1 = 5
 * 
 */

import java.util.Scanner;

public class NestedLoopQuiz04 {

	public static void main(String[] args) {
		
		// 1. scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 사용자에게 입력값 받기
		System.out.print("짝수 단은 0, 홀수 단은 1 을 입력하세요 ... ");
		int userOption = input.nextInt();
        
        // 3. 조건에 따라 출력하기
        // userOption이 0 또는 1이 아닌 경우 짝,홀에 따라 조건에 맞는 단 출력
        // int choice;
        // if (userOption == 0) 
		//    	choice = 2;
		//	else 
		//    	choice = 3;
        
		int choice = (userOption == 0) ? 2 : 3;
		
        for (int i=choice; i<10; i+=2) {
            for (int idx=1; idx<=9; idx++) {
            	if (userOption != 0 && userOption != 1) {
            		System.out.println("잘못된 값을 입력하셨습니다.");
            	} else {
            		System.out.printf("%d * %d = %d\n", i, idx, i*idx);
            	}
            }
            System.out.println();
        } 
        
        // 4. 메모리 해제
		input.close();
		
	}
}
