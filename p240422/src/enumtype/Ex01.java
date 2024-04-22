package enumtype;

import java.util.Scanner;

// enum 이 없는 형태

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("1. 월, 2. 화, 3. 수, 4. 목, 5. 금, 6. 토, 7. 일");
		System.out.print("오늘의 요일을 선택하세요 ... ");
		
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		
		switch(day) {
		case Day.MON: 
			System.out.println("월) 주간 회의");
			break;
		case Day.TUE: 
			System.out.println("화) 프로젝트 기획 회의");
			break;
		case Day.WED: 
			System.out.println("수) 진행 사항 보고");
			break;
		case Day.THU: 
			System.out.println("목) 사내 동호회");
			break;
		case Day.FRI: 
			System.out.println("금) 프로젝트 마감");
			break;
		case Day.SAT: 
			System.out.println("토) 가족과 즐거운 시간");
			break;
		case Day.SUN: 
			System.out.println("일) 휴일입니다.");
			break;
		}
		
		input.close();
		
	}
}
