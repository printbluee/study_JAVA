
public class MethodQuiz03 {

	/*
	 * [ 메소드 정의 ]
	 * - 기능 : 정수 1개를 입력 받은 후, 팩토리얼 출력
	 * - 메소드명 : factorial, 매개변수 : 1개, 리턴값 : 없음
	 * 
	 * < 출력 형태 >
	 * 5! = 120
	 */
	
	public static void factorial(int num) {
		
		// 1. 초기값 설정
		int reslut = 1;
		
		// 2. 조건문 실행
		for (int i=1; i<=num; i++) {
			reslut *= i;
		}
		
		// 3. 출력
		System.out.printf("%d! = %d", num, reslut);
	}
	
	
	public static void main(String[] args) {
		
		// [ 메소드 호출 ]
		factorial(5);
	}
}
