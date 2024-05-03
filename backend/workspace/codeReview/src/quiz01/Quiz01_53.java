
package quiz01;

/*
 * [진혜정]
 * - 메모리 해제 안하셨습니다.
 */

import java.util.Scanner;

public class Quiz01_53 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("1~10 사이의 정수 입력 : ");
			int userValue = input.nextInt();
			if(userValue<=10 && userValue>=1 ) {
				System.out.println(userValue+"! = " + factorial(userValue));
				break;
			}
		}

	}
	public static int factorial(int num) {
		if(num==1)
			return 1;
		else
			return num * factorial(num-1);
		
		
	}

}
