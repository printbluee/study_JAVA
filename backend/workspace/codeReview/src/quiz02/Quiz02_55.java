package quiz02;
import java.util.Scanner;

/*
 * [진혜정]
 * - 문제 출력 문구에는 "랜덤값을 동일하게 입력하세요." 와 "1~10 랜덤값 :"는 없습니다.
 * - 사용자가 랜덤값을 맞출 때까지 입력 받지 못합니다.
 */

public class Quiz02_55 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("랜덤값을 동일하게 입력하세요.");
		
		int userValue = input.nextInt();
		
		
		int random = (int)(Math.random() *10) + 1;
		System.out.println("1~10 랜덤값 : " + random);

		if(userValue == random) {
			System.out.println("%s번만에 정답입니다");
		} else if (userValue >= random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다");
		} else {
			System.out.println("컴퓨터의 숫자가 더 큽니다");
		}
		input.close();

		
	}

}
