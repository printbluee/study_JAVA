
public class NestedLoopQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * [ 문제 ]
		 * 중천 while 문 사용하여, 구구단 2 ~ 9단 출력하시오.
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
		// 1. 변수 선언 후 초기값 설정
		int num = 2;
		int i = 1; // 다시 초기화
=======
		// 1. 구구단 결과값 변수 선언 후 초기값 설정
		int num = 2;
		int i = 0;
		int result = 0;
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		
		// 2. 조거문 실행
		while (num<10) { // num : 2 ~ 9단
			System.out.printf("%d 단 입니다.\n", num);
			i = 1; // 다시 초기화

			while (i<10) {
<<<<<<< HEAD
				System.out.printf("%d * %d = %d\n", num, i, num * i);
				i++;
			}
			
=======
				result = num * i;
				System.out.printf("%d * %d = %d\n", num, i, result);
				i++;
			}
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
			System.out.println();
			num++;
		}
	}
}
