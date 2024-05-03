
package quiz02;

/*
 * [진혜정]
 * - 랜덤값 1~11 까지 지정하셨습니다.
 * int random = (int)(Math.random()*10+1); 
 * int random = (int)(Math.random()*10) +1; 으로 변경
 * - 사용자에게 입력받을 변수를 for 문 안에 선언해서 scanner 객체가 
 *   닫히지 않습니다.
 */

import java.util.Scanner;

public class Quiz02_41 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int random = (int)(Math.random()*10+1);
		
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");
		int count=1;
		
		for(;;) {
			System.out.printf("숫자 입력 : ");
			int userValue = input.nextInt();
			
			if(userValue>random) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				count++;
			} else if (userValue<random) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				count++;
			} else {
				System.out.printf("%d번만에 정답입니다.",count);
				break;
			}
		}
		
		input.close();
	}

}
