package quiz02;
import java.util.Scanner;

/*
 * [진혜정]
 * - 수고하셨습니다.
 */

public class Quiz02_54 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***\n");
		
		int userValue= 0;
		int random = (int)(Math.random() * 10 ) +1;
		
		int count = 0;
		
		while (true) {
			count ++;
			
			System.out.print("숫자 입력 : ");
			userValue = input.nextInt();
			
			if (random < userValue) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (random > userValue) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else {
				break;
			}
			
		}
		System.out.println(count + "번만에 정답입니다.");
		input.close();
	}
}

