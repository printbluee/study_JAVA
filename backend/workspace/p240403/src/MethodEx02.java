
/*
 * [ 메소드 오버로딩 ] (method overloading)
 * - 같은 이름의 메소드를 여러 개 정의
 * - 단, 매개 변수(개수, 타입)의 정보가 달라야함
 * - 반환형(리턴형)과는 다름
 */

public class MethodEx02 {

	public static void main(String[] args) {
		
		// method 호출
		sum(2,3);
		sum(2.1, 3.3); 
		
		// 호출 되는 값들이 "인수(argument)"
		System.out.println(5);   	// 정수
		System.out.println(5.1); 	// 실수
		System.out.println('A'); 	// 문자
		System.out.println("ㅎㅇ"); // 문자열
		System.out.println(true);   // 논리
		
	}
	
	// [ method 정의 ] ==============================
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	} 

	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	} 
	// ==============================================
	public static void sum(int n2, double n1) {

	} 

	public static void sum(double n1, int n2) {

	} 
	
	
	
}
