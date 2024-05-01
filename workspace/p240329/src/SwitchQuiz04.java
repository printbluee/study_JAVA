import java.util.Scanner;

public class SwitchQuiz04 {

	public static void main(String[] args) {
		
		/*
		 * [ 컴퓨터랑 가위바위보 하기 ]
		 * 가위(1), 바위(2), 보(3)
		 * 
		 * [ 입력 형태 ]
		 * 가위(1), 바위(2), 보(3) 중 하나를 입력하시오 ... 0
		 * 
		 * [출력 형태]
		 * 당신이 이겼습니다.
		 */
		
		// 1. scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 입력 형태 출력
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오 ... ");
		
		// 3. int 타입의 변수 user 와 컴퓨터 지정(컴퓨터는 랜덤) 후 입력받기
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3) + 1;
		System.out.println("컴퓨터 >> " + computer);
		
		// 4. 조건문 실행
		switch (user - computer) {
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		default:
			System.out.println("잘못된 숫자를 입력하셨습니다." );
			break;
		} 
		
		// 5. 메모리 해제
		input.close();
	}

}
