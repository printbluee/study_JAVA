
public class WhileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * [ 반복문 ]
		 * 2단을 출력하시오 . 
		 * 
		 * < 출력 형태 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * 
		 */
		
		// 1. 변수 초기값 설정
<<<<<<< HEAD
		int idx = 1;
		
		// 2. while 문 실행
		while (idx <= 9) {
			System.out.printf("2 * %d = %d\n", 2, idx, 2 * idx);
			idx++;
		}
=======
		int idx = 0;
		int result = 0;
		
		// 2. while 문 실행
		while (idx < 9) {
			int num = 2;
			idx++;
			result = num * idx;
			
			
			System.out.printf("%d * %d = %d\n", num, idx, result);
		}

>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
	}
}