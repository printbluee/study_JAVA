package test;

import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	
    	// 1. 컴퓨터 : 랜덤값 생성(1 ~ 10)
    	int radom = (int)(Math.random() * 10) + 1;  // 정수형 변수 random 을 선언
    	int userValue = 0;
    	int count = 0;  
    	
    	System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
    	
    	// 2. 무한 루프
    	//    반복문 구현 : 사용자 값 입력, 비교 후 출력
    	while(true) {
            count++;
            System.out.print("숫자 입력 : ");
            userValue = input.nextInt();
           
            if (radom > userValue) {
                System.out.println("컴퓨터의 숫자가 더 큽니다.");
            } else if (radom < userValue) {
                System.out.println("컴퓨터의 숫자가 더 작습니다.");
            } else {
            	System.out.printf("%d번만에 정답니다.", count);
                break;
            }
        }
    	
    	// 3. 횟수 출력
    	//System.out.printf("%d번만에 정답니다.", count);
    	
        // 4. 메모리 해제
        input.close();
    }
}