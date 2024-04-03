
public class ForQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 2단을 출력하시오 . 
		 * 
		 * < 출력 형태 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * 
		 */

		// 1. for 문 실행
		for (int idx=1; idx<10; idx++) {
			System.out.printf("2 * %d = %d\n", 2, idx, 2 * idx);
		}
	}
}
