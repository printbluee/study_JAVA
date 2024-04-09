
public class NestedLoopQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * [문제]
		 * 중첩 for문을 사용하여, 아래와 같이 출력
		 * 100
		 * 010
		 * 001
		 * 중첩for문의 안쪽 for문이 1번 실행할때 0 또는 1 출력
		 * 안쪽의 for문은 총 9회 실행 사선으로 1이 나오고 나머지는 0이 나오게
		 */
		
		for(int i=0; i<3; i++) {		// 행
			for(int j=0; j<3; j++) {	// 열
				if(i == j) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}

	}

}
