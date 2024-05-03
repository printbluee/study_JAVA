package quiz02;
import java.util.Scanner;

/*
 * [진혜정]
 * - ((Math.random()*10)) 괄호 안에 또 괄호를 쓰셨습니다.
 * - 사용자가 입력한 정수가 랜덤값을 맞출 때까지 입력받도록 안하셨습니다.
 * - 한 번 실행 후 프로그램 종료되며, return 사용 이유 모르겠습니다.
 */


public class Quiz02_47 {

	public static void main(String[] args) {
		
		int random = (int)((Math.random()*10))+1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = input.nextInt();
		int count = 0;
		
		if(num < random) {
			System.out.println("컴퓨터의 숫자가 더 큽니다.");
			count++;
			return;
			
		} else if (num > random) {
			System.out.println("컴퓨터의 숫자가 더 작습니다.");
			count++;
			return;
		} else {
			count++;
			System.out.println(count + "번 만에 정답입니다.");
		}
		
		input.close();
	}

}
