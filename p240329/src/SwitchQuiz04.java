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
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오 ... ");

		Scanner input = new Scanner(System.in);
		
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3) + 1;
		
		switch (user) {
		case 1:
			switch (computer) {
			case 1:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("비겼습니다 !");
				break;
			case 2:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("컴퓨터가 이겼습니다 !");
				break;
			case 3:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("유저가 이겼습니다 !");
				break;
			}break;
		case 2:
			switch (computer) {
			case 1:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("유저가 이겼습니다 !");
				break;
			case 2:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("비겼습니다 !");
				break;
			case 3:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("컴퓨터가 이겼습니다 !");
				break;

			}break;
		case 3:
			switch (computer) {
			case 1:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("컴퓨터가 이겼습니다 !");
				break;
			case 2:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("유저가 이겼습니다 !");
				break;
			case 3:
				System.out.println("유  저 : " + user);
				System.out.println("컴퓨터 : " + computer);
				System.out.println("비겼습니다 !");
				break;
			}break;
		default:
			System.out.println("유  저 : " + user);
			System.out.println("컴퓨터 : " + computer);
			System.out.println("잘못된 숫자를 입력하셨습니다.");
			break;
		} 
		
		input.close();
	}

}
