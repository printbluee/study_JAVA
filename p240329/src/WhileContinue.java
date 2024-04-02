
/*
 * [ continue ]
 * 
 * 반복문 내에서 조건문과 함께 사용
 * 의미 : 특정 명령어(continue 아래에 있는 명령어)를 실행에서 제외  
 * 
 */

public class WhileContinue {

	public static void main(String[] args) {

		int idx = 0;
		
//		while (idx < 10) {
//			idx++;
//			
//			if (idx % 2 == 0) {
//				continue;
//			}
//
//			System.out.println("idx --> " + idx);
//		}
		
		// 위 코드를 continue 를 사용하지 않은 형태로 변경
		while (idx < 10) {
			idx++;
			
			if (idx % 2 == 1) {
				System.out.println("idx --> " + idx); // 1,3,5,7,9
			}
		}

		System.out.println("반복문 실행 후 idx --> " + idx);
		System.out.println("프로그램 종료 !");
		
	}

}
