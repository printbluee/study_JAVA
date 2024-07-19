
/* 
 * [ 조건문 ]switch
 * 
 * - 리터럴이 와도 되지만, 의미가 없어짐
 * - 변수 or 간단한 식
 * switch(정수값) { // 간단한 식, 정수
 * 	case 값 1: // case(라벨)
 * 		명령어;
 * 		명령어;
 * 	case 값 2:
 * 		명령어;
 * 		명령어;
 * 	default : 
 * 		명령어;
 * 		명령어;
 * }
 * 
 */

/*
 * 상수 (constant)
 * : 이름이 있는 값
 * : 변수와 마찬가지로 값을 저장할 수 있는 공간
 * : 초기화한 값으로 고정, 변경 x
 * : 선언 방법은 변수와 동일
 * : 변수는 무조건 대문자
 * : 변수 타입 앞에 final 만 붙여줌
 * ex) final int age = 10;
 */


public class SwitchEx01 {

	public static void main(String[] args) {
		
		int num = 2;
//		float fo = 3.43F; 타입 에러
		
//		int one = 1; 		// 변수
		final int TWO = 2; 	// 상수 constant
		
		
		switch(num) {
		case 1:
			System.out.println("1 이다.");
			break;
		case TWO: 
			System.out.println("2 이다.");
			break;
		case 3: 
			System.out.println("3 이다.");
			break;
		default:
			System.out.println("나머지이다.");
			break;
		}
		
		System.out.println("<< 실행 완료 >>");
			
	}
}
