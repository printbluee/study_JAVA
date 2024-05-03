package quiz02;
import java.util.Scanner;

/*
 * [진혜정]
 * - 문제 출력 문구에 없는 "랜덤값 >> "은 디버깅때 사용하고 제출할 때 지워야합니다.
 */

public class Quiz02_50 {

	public static void main(String[] args) {

		// scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 초기값 설정
		int radom = (int)(Math.random() * 10) + 1;  // 정수형 변수 random 을 선언
		int count = 0; 	
		System.out.println("랜덤값 >> " + radom + "\n");
		
		// 조건문 실행 
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		while(true) {
			count++;
			
			System.out.print("숫자 입력 : ");
			int userValue = input.nextInt();
			
			if (radom > userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else if (radom < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (radom == userValue) {
				System.out.printf("%d번만에 정답니다.", count);
				break;
			}
		}
		
		// 메모리 해제
		input.close();
	}
}
