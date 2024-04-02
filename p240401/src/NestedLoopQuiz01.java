
public class NestedLoopQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * [ 문제 ]
		 * 중천 for 문 사용하여, 구구단 2 ~ 9단 출력하시오.
		 * 
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * 
		 * 3 * 1 = 3
		 * ...
		 */
		
		for (int num=2; num<10; num++) { // num : 2 ~ 9단
			System.out.printf("%d 단 입니다.\n", num);
			
			for (int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
			
			System.out.println();
		}
	}
}
