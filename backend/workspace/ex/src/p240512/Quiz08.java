package p240512;
import java.util.Scanner;

public class Quiz08 {
	
	// 정수 5개 입력 받은 후 총합 구하기
	
	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
        int sum = 0;

        for (int i=1; i<=5; i++) {
            System.out.print(i + "번째 정수 입력: ");
            int number = input.nextInt();
            sum += number; 
        }
        // 총합
        System.out.println("입력한 정수의 총합: " + sum);
        
        // 메모리 해제
        input.close();
	}
}
