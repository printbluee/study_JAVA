
public class MethodQuiz02 {

	/*
	 * [ 메소드 정의 ]
	 * - 기능 : 정수 1개를 받아서 제곱값 출력
	 * - 메소드명 : square, 매개변수 : 1개, 리턴값 : 없음
	 * 
	 * < 출력 형태 >
	 * 5의 제곱은 {25} 입니다.
	 * 4의 제곱은 {16} 입니다.
	 */
	
	public static void square(int num) {
		
		// 1. 바로 출력
		System.out.printf("%d의 제곱은 %d 입니다.\n", num, num * num);
	}
	
	public static void main(String[] args) {
		
		// [ 메소드 호출 ]
		square(3); // 5 x 5
		square(4); // 5 x 5
		square(9);
	}

}
