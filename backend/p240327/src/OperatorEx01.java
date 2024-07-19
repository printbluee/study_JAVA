public class OperatorEx01 {

	public static void main(String[] args) {
		
		// 산술 연산자
		int num1 = 5, num2 = 3;
		
		// 덧셈
		System.out.println("덧셈 : " + num1 + num2);
		System.out.println("덧셈 : " + (num1 + num2));
		System.out.println(num1 + num2 + " --> 덧셈 끝");

		// 뺄셈은 안됨(메소드가 x)
//		System.out.println("덧셈 : " + num1 - num2);
		System.out.println("뺄셈 : " + (num1 - num2));
		System.out.println(num1 - num2 + " --> 뺄셈 끝");
		
		// 안해도 되지만 직관성 높이기 위해 괄호 사용
		System.out.println("곱셈 : " + (num1 * num2)); 
		System.out.println("몫 : " + (num1 / num2)); 
		
		// 나머지 : 짝수/홀수 나눌 때, ~배수 찾을 때
		System.out.println("나머지 : " + (num1 % num2)); 
		
	}
}
