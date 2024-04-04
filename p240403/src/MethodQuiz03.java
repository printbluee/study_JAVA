
public class MethodQuiz03 {

	/*
	 * [ 메소드 정의 ]
	 * - 기능 : 정수 1개를 입력 받은 후, 팩토리얼 출력
	 * - 메소드명 : factorial, 매개변수 : 1개, 리턴값 : 없음
	 * 
	 * < 출력 형태 >
	 * 5! = 120
	 */
	
	 // [ 방법 1 ] ================================ 
//	public static void factorial(int num) {
//		
//		// 1. 초기값 설정
//		int reslut = 1;
//		
//		// 2. 조건문 실행
//		for (int i=1; i<=num; i++) {
//			reslut *= i;
//		}
//		
//		// 3. 출력
//		System.out.printf("%d! = %d", num, reslut);
//	}
	
	// [ 방법 2 ] ================================ 
	// 재귀 호출 (메소드 안에서 호출하는 것을 뜻함)
	// 왜 되는지 생각하기
	public static int factorial(int num) {
		
		if (num == 1) {
			return 1;
		} else {
			System.out.println("factorial(" + num + ")");
			return num * factorial(num-1); // num이 1이 아닌 경우 다시 호출해서 num -1 하여 다시 대입 
			// 3 * factorial(2) * factorial(1) = 3 * 2 * 1
		}
	}
	
	public static void main(String[] args) {
		
		// [ 메소드 호출 ]
		factorial(3);
//		System.out.println("5! = " + factorial(5));
	}
}
