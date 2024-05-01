
public class WhileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * [ 반복문 ] 
		 * while 문을 사용하여, 1 ~ 10 출력
		 * 
		 * < 출력 형태 >
		 * 1 2 3 4 5 6 7 8 9 10
		 * 
		 */
		
		int num = 1; // 값 설정
		
		while (num <= 10) {
			System.out.printf("%d ",num);
			num++;
		}
	}
}
