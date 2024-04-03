public class WhileQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1 ~ 10 까지 합을 구하시오.
		 * 
		 * < 출력 형태 >
		 * 1 ~ 10 누적합 : 55
		 * 
		 */
		
		// 1. 초기값 설정
<<<<<<< HEAD
		int num = 1;
=======
		int num = 0;
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
		int result = 0;
		
		// 2. 조건문 실행
		while (num <= 10) {
			result += num;
			num++;
		}
		
		// 3. 출력
		System.out.println("1 ~ 10 누적합 : " + result);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 77ec9f2505f7ebc6e1da980148f06223801a4718
