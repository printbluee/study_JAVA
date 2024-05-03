package quiz01;

/*
 * [진혜정]
 * - 메모리 해제 안하셨습니다.
 * - 사용자에게 1 ~ 10 이외의 정수를 넣을 시 프로그램이 종료됩니다.
 * - 만약 사용자가 1 ~ 10 사이에 정수를 넣었다 하더라도 userValue--; 했기 때문에 
 *   System.out.println(userValue+"! = "+result); 이 부분에서 userValue는 0이 출력됩니다.
 */

import java.util.Scanner;

public class Quiz01_48 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();				
		int result = 1;
		
		while(userValue > 10) {
			System.out.print("while 1~10 사이의 정수 입력 : ");
			return;
		}

		while(userValue > 0 && userValue <= 10) {
			result *= userValue;
			userValue--;
			
		}
		System.out.println(userValue+"! = "+result);
		
		input.close();
	}

}
