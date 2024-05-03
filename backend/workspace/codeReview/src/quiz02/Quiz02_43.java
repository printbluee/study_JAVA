package quiz02;

/*
 * [진혜정]
 * - 메모리 해제 안하셨습니다.
 * - 문제의 출력 문구 "숫자 입력 : " 이 없습니다.
 * - 조건식마다 불필요하게 count++; 넣기 보다는 밖에다 선언하는게 좋습니다.
 */

import java.util.Scanner;

public class Quiz02_43 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("**** 숫자를 맞추어 보세요 1~10 ****");
		Scanner input = new Scanner(System.in);
		int userValue = input.nextInt();
		
		int count = 1;
		
		while(true) {
			if(userValue == random) {
				System.out.println(count + "번만에 정답입니다. ");
				break;
			} else if(userValue < random) {
				System.out.println("컴퓨터 숫자가 더 큽니다. ");
				count++;
				userValue = input.nextInt();
				continue;
				
			} else if(userValue > random) {
				System.out.println("컴퓨터 숫자가 작습니다. ");
				count++;
				userValue = input.nextInt();
				continue;
			}
		}
	}

}
