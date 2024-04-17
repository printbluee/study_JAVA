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
		
		// 3. 학점 출력
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		
//		System.out.println("학점은 " + grade + option + "입니다.");
		
		
		// 4. scanner 닫기(오류 방지)
		input.close();
	
	}
}