
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
		
<<<<<<< HEAD
=======
		// 구구단 결과값 변수 선언 후 초기값 설정
		int result = 0; 
		
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		for (int num=2; num<10; num++) { // num : 2 ~ 9단
			System.out.printf("%d 단 입니다.\n", num);
			
			for (int i=1; i<10; i++) {
<<<<<<< HEAD
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
			
=======
				result = num * i;
				
				System.out.printf("%d * %d = %d\n", num, i, result);
			}
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
			System.out.println();
		}
	}
}
