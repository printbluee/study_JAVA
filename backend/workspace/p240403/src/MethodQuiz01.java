
public class MethodQuiz01 {

	/*
	 * [ 메소드 정의 ]
	 * - 기능 : 양의 정수 2개를 받아, 누적합 출력
	 * - 메서드명 : add, 매개변수 : 2개, 리턴값 : 없음
	 * 
	 * < 출력 형태 >
	 * 2 ~ 5 누적합 >> 14
	 */
	
	public static void add(int n1, int n2) {
		
		// 1-1. 초기값 설정 - 삼항 연산자 사용했을 경우
//		int reslut = 0;
//		int min = (n1 < n2) ? n1 : n2; // 더 작은 값이 먼저 시작
//		int max = (n1 > n2) ? n1 : n2; // 더 큰 값이 마지막
		
		// 1-2. 초기값 설정 - if 문 사용했을 경우
		int reslut = 0;
		int max = 0, min = 0;
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		// 3. 조건문 실행
		for (int i=min; i<=max; i++) {
			reslut += i;
		}
		
		// 4. 출력
		System.out.printf("%d ~ %d 누적합 >> %d\n",n1, n2, reslut);
		
	}
	
	public static void main(String[] args) {
		
		// [ 메소드 호출 ]
		add(2, 5); // 2 + 3 + 4 + 5 = 14
		add(5, 2); // 2 + 3 + 4 + 5 = 14
		add(5, 1);
	}
}
