import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 정수 1개를 입력받은 후, 0인지 아닌지를 출력
		 * 
		 * - 입력 문구 : 정수 하나 입력하세요 ...
		 * - 출력 문구 : 입력한 숫자는 0입니다.
		 * 				 입력한 숫자는 0이 아닙니다.
		 */
		
		// 1. 사용자에게 입력 받을 scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 입력 문구 출력 후, int 타입의 변수 num 입력 받기
		System.out.print("정수 하나 입력하세요 ... ");
		int num = input.nextInt();
		
		if (num == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		} else {
			System.out.println("입력한 숫자는 0이 아닙니다.");
		}
		
		input.close();
	}

}
