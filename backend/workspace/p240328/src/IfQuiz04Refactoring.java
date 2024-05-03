//
///*
// * [ 과제 5 ] ===========================
// *  점수를 입력받은 후, 학점을 출력하시오.
// *  
// *  90~93 : A-, 94~96 : A0, 97~100 : A+
// *  80~83 : B-, 84~86 : B0, 87~89  : B+
// *  70~73 : C-, 74~76 : C0, 77~79  : C+
// * 나머지 : F
// * 
// * << 입력 형태 >>
// * 점수를 입력하세요 ... 98
// * 
// * << 출력 형태 >>
// * 학점은 < 00 > 입니다.
// * 
// * ====================================
// */

import java.util.Scanner;

public class IfQuiz04Refactoring {

	public static void main(String[] args) {
		
		// 1. 사용자에게 입력받기 위해 scanner 객체 생성
		Scanner input = new Scanner(System.in);
		char grade;
		char option;
		
		// 2. 사용자에게 입력받은 값을 각 변수에 저장
		System.out.print("점수를 입력하세요 ... ");
		int score = input.nextInt();
		
		// 3-1. 조건문에 따라 option 처리
		if (score % 10 >= 7 || score == 100) { 
            option = '+';
        } else if (score % 10 >= 4) {
            option = '0';
        } else {
            option = '-';
        }
		
		// 3-2. 조건문에 따라 grade 처리
		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80 && score <= 89) {
			grade = 'B';
		} else if (score >= 70 && score <= 79) {
			grade = 'C';
		} else {
			grade = 'F';
			option = ' ';
		}
		
//		System.out.println("학점은 " + grade + option + "입니다.");
		
		// [서식문자]
//		형태 : % + 문자
//		%d : 정수
//		%f : 실수
//		%c : 문자
//		%s : 문자열
		System.out.printf("\n학점은 %c%c입니다.\n", grade, option);
		System.out.printf("정수 : %d\n", 100);
		System.out.printf("실수 : %f\n", 100.34);
		System.out.printf("문자 : %c\n", '문');
		System.out.printf("문자열 : %s\n", "문자열");
		System.out.printf("500 출력 ==> %s\n", 500);
		
		
		
		// 4. scanner 닫기(오류 방지)
		input.close();
	
	}
}