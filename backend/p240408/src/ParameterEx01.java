
/*
 * [ 가변 인자 ] variable arguments
 * - JDK 1.5 부터 지원
 * - 선언 형태 :  type ... parameter
 * - 내부적으로 배열 생성
 * - 마지막 위치에 선언
 * 
 */


public class ParameterEx01 {

//	public static void sum(int n1, int n2) {
//		
//		int sum = n1 + n2;
//		System.out.println("덧셈 결과 >> " + sum);
//	}
	
	// error : The variable argument type int of the method add must be the last parameter
//	public static void add(int n1, int ... args, int n2) {
//	}
	
	// 가변 인자
	// 인수가 정해져 있지 않은 매개변수
	public static void sum(int ... args) {
		System.out.println("\n** 가변 인자 **");
		System.out.println("args >> " + args);
		
		// 향상된 for 문
		for (int ar: args) {
			System.out.print(ar + " ");
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		sum();
		sum(3, 5);
		sum(1);
		sum(2, 4, 6);
		sum(1, 7, 9, 11);
		
	}
}
