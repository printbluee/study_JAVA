
/*
 * [ 메소드 ] method
 * - 기능, 동작
 * 
 *  [ 메소드 정의 형태 ] => 선언했다고 말 안함
 *  	반환형/리턴형/자료형 메서드명(자료형 변수명) {
 *  		명령어;
 *  		명령어;
 *  		return 값;
 *  }
 *  
 *  1) 매개변수 있고, 리턴 없음
 *  2) 매개변수 있고, 리턴 있음
 *  3) 매개변수 없고, 리턴 없음
 *  3) 매개변수 없고, 리턴 있음
 *  
 *  
 *  [ 메소드 호출 ]
 *  메소드명(인수, 인수);
 *  System.out.println("ㅎㅇ"); 에서 println : 메소드 / ("ㅎㅇ") : 인수
 *  
 *  매개변수 : parameter 파라미터
 *  인수 	 : argument 아규먼트
 */

public class MethodEx01 {
	
	// main 메소드 정의===================================
	 public static void main(String[] args) {
		System.out.println("== 1. main method 시작==");
		
		// 메소드 호출
		increment(3);
		// System.out.println("num >> " + num); error : 선언이 안되어있음
		System.out.println("== 2. main method 종료==");
	}
	
	// 메소드 정의 형태===================================
	// [ 형태 ] 1) 매개변수 있고, 리턴 없음
	// 기능 : 인수로 받은 값을 1증가 후, 출력
	public static void increment(int num) {
		System.out.println("== 3. increment method 시작 ==");
		num++;
		System.out.println("1 증가된 값 >> " + num);
		System.out.println("== 4. increment method 종료 ==");
	}
}
