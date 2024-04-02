
/*
 * [ break ]
 * 
 * 반복문 내에서 조건문과 함께 사용
 * 의미 : 반복문 탈출
 * 
 */

public class WhileBreak {

	public static void main(String[] args) {

		int idx = 0;
		
		while (idx < 10) {
			
			idx++;
			
			if (idx % 2 == 0) {
				break;
			}

			System.out.print("idx --> " + idx);
		}
		
		System.out.println("반복문 실행 후 idx --> " + idx);
		System.out.println("프로그램 종료 !");
		
		
	}

}
