
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

//		System.out.print("짝수 단은 0, 홀수 단은 1 을 입력하세요 ... ");
//		int userValue = input.nextInt();
		
		for (int num=2; num<10; num++) { // num : 2 ~ 9단

            for (int i=1; i<10; i++) {
                
                
                if (num%2 == 0) {
                	
                } else if (num%2 == 1) {
                	
                } else {
                	System.out.println("잘못된 값을 입력하셨습니다.");
                }
                
                System.out.printf("%d * %d = %d\n", num, i, num * i);
                
            }
            
            System.out.println();
            
        }
		
		
		
		
		
		
		input.close();
	}
}
