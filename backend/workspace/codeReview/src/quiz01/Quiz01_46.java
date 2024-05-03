/*
 * [문항1]  사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하려고 한다.
단, 입력 값은 1에서 부터 10까지의 정수만 입력되도록 한다.
만약 1~10 이외의 값을 입력하면, 다시 입력 받도록 한다.

1.1. 정수형 변수 userValue를 선언하여, 사용자에게 정수 1개를 입력 받아 저장하시오. [5점]
1.2. 사용자가 1~10 이외의 정수를 입력하면, 다시 입력 받도록 코딩을 작성하시오. [15점]
1.3. 사용자가 입력한 (1~10 사이) 정수의 팩토리얼 출력하는 코딩을 작성하시오. [10점]

 */

package quiz01;
import java.util.Scanner;

/*
 * [진혜정]
 * - 문제의 출력 문구에 "입력받은 정수 >> " 가 없습니다.
 * - 사용자가 입력된 값이 1 ~10 사이에 없으면 실행이 종료가 되며, 팩토리얼 계산되는 부분이 없습니다.
 */


public class Quiz01_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수 입력 : ");
		int userValue = input.nextInt();
		
		System.out.println("입력받은 정수 >> " + userValue);
		
		if(userValue >=1 && userValue <= 10 ) {
			System.out.println();
		} else {
			System.out.println("다시 입력 해주세요.");
		}
	
		
		input.close();

		
	}

}
