
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
		
		// 1. 초기값 설정
		int num = 2;
		int result = 0;
		
		// 2. for 문 실행
		for (int idx=1; idx<10; idx++) {
			result = num * idx;
			System.out.printf("%d * %d = %d\n", num, idx, result);
		}
	}
}
