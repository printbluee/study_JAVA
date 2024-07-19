package lambda;

@FunctionalInterface
interface MaxReturn {
	// 큰 값을 리턴받기
	int max(int n1, int n2);
}

public class lambdaQuiz {

	public static void main(String[] args) {

		// [문제 1] 익명 클래스 : 참조변수에 저장
		// 객체 생성
		MaxReturn maxReturnOne = new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				
				return (n1 > n2) ? n1 : n2;
			}
		};
		System.out.println(maxReturnOne.max(6, 3));
		
		// [문제 2] 익명 클래스 : 인수 - System.out.println()
		System.out.println(new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				return (n1 > n2) ? n1 : n2;
			}
		}.max(9, 2));
		
		
		// [문제 3] 람다 : 문제 1를 람다로 표현
		MaxReturn maxReturnTwo = (n1, n2) -> (n1 > n2) ? n1 : n2;
		System.out.println(maxReturnTwo.max(15, 11));
		
		// [문제 4] 람다 : 문제 2를 람다로 표현
		System.out.println(((MaxReturn) (n1, n2) -> {return (n1 > n2) ? n1 : n2;}).max(20, 3));
	}
}
