package quiz01;

/*
 * [진혜정]
 * - while 문을 썼기 때문에 "1~10 사이의 정수 입력 : " 문구와 userValue 는
 *   중복해서 출력하지 않아도 될 것 같습니다.(while 문 밖에 있는 것)
 * 
 */

import java.util.Scanner;

public class Qiuz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		while(userValue < 1 || userValue > 10) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
		}
		
		int result = 1;
		
		for(int i = 1; i <= userValue; i++) {
			result = result * i;
		}
		System.out.printf("%d! : %d", userValue, result);
		
		input.close();
	}

}
