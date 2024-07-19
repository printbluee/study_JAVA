
public class MethodEx02 {

	// [ main method ] ================
	public static void main(String[] args) {
		System.out.println("** main method 시작 **");
		
		 int sumResult = sum(2, 5);
		 System.out.println("sum(2,5) 호출 결과 >> " + sumResult);
		
		System.out.println("sum(1,4) 호출 결과 >> " + sum(1,4));
		System.out.println("** main method 종료 **");
	}
	
	// [ method 정의 ] ================
	// [ 형태 2 ] 매개변수 있고, 리턴 있음
	// 기능 : 인수로 정수 2개 받은 후, 덧셈 결과 리턴
	// 메소드명 : sum, 매개변수 : 2개
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
		// System.err.println("sum 메소드 실행 종료"); return 이 끝났으므로 실행 x
	}
}
