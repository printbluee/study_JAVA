
package quiz01;
/*
 * [진혜정]
 * - 수고하셨습니다.
 */

import java.util.Scanner;

public class Quiz01_45 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int userValue = 0;
    int sum = 1;

    while(true) {
      System.out.print("1~10 사이의 정수 입력 : ");
      userValue = scan.nextInt();
      if (userValue > 0 && userValue <= 10) {
        break;
      }
    }
    for(int i = 1; i <= userValue; i++) {
      sum *= i;
    }

    System.out.printf("%d! : %d", userValue, sum);

    scan.close();
  }

}
