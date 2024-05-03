
/*
 * [ 과제 5 ] ===========================
 *  점수를 입력받은 후, 학점을 출력하시오.
 *  
 *  90~93 : A-, 94~96 : A0, 97~100 : A+
 *  80~83 : B-, 84~86 : B0, 87~89  : B+
 *  70~73 : C-, 74~76 : C0, 77~79  : C+
 * 나머지 : F
 * 
 * << 입력 형태 >>
 * 점수를 입력하세요 ... 98
 * 
 * << 출력 형태 >>
 * 학점은 < 00 > 입니다.
 * 
 * ====================================
 */

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
        // 1. 사용자에게 입력받기 위해 scanner 객체 생성
        Scanner input = new Scanner(System.in);

        // 2. 사용자에게 입력받은 값을 각 변수에 저장
        System.out.print("점수를 입력하세요 ... ");
        int user = input.nextInt();

        // 3. 조건문 실행 후 출력
        if (user >= 90 && user <= 93) {
            System.out.println("학점은 A- 입니다.");

        } else if (user >= 80 && user <= 83) {
            System.out.println("학점은 B- 입니다.");

        } else if (user >= 70 && user <= 73) {
            System.out.println("학점은 C- 입니다.");

        } else if (user >= 94 && user <= 96) {
            System.out.println("학점은 A0 입니다.");

        } else if (user >= 84 && user <= 86) {
            System.out.println("학점은 B0 입니다.");

        } else if (user >= 74 && user <= 76) {
            System.out.println("학점은 C0 입니다.");

        } else if (user >= 97 && user <= 100) {
            System.out.println("학점은 A+ 입니다.");

        } else if (user >= 87 && user <= 99) {
            System.out.println("학점은 B+ 입니다.");

        } else if (user >= 77 && user <= 79) {
            System.out.println("학점은 C+ 입니다.");

        } else if (user > 100) {
            System.out.println("학점은 0 ~ 100 점 사이로 입력해주세요.");
            
        } else {
            System.out.println("학점은 F 입니다.");
        }

        // 4. scanner 닫기(오류 방지)
        input.close();
	}

}
