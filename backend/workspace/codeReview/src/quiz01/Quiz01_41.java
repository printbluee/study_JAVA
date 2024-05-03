
package quiz01;

/*
 * [진혜정]
 * - Scanner 객체 생성 후 메모리 해제 하지 않았습니다.
 * - 변수 선언 위치가 각각 달라 어디에 선언되어있는지 찾아야 됩니다.
 * - while 문을 썼기 때문에 "1~10 사이의 정수 입력 : " 문구와 userValue 는
 *   중복해서 출력하지 않아도 될 것 같습니다.(while 문 밖에 있는 것)
 */

import java.util.Scanner;

public class Quiz01_41 {

	public static void main(String[] args) {

		//1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
		Scanner scan = new Scanner(System.in);
		System.out.printf("1~10 사이의 정수 입력 : ");
		int userValue = scan.nextInt();
		
		//1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
		while(true) {
			if(userValue>10 || userValue<1) {
				System.out.printf("1~10 사이의 정수 입력 : ");
				userValue = scan.nextInt();
				
			}else
				break;
		}

		
		//1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]
		int result = 1;
		for(int i = 1; i<=userValue; i++) {
			result*=i;
		}
		
		System.out.printf("%d! : %d", userValue, result);
	}

}
