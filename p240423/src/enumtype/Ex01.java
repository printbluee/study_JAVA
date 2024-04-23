package enumtype;

/*
 * [enum] 열거형
 * - JDK 1.5 부터 지원
 * - 변수를 상수화
 * - 열거형 상수(constant)
 * - 멤버변수(field) 를 모두 대문자 사용
 * - 관련 있는 상수(constant) 를 하나의 이름으로 관리
 * - 첫 번째 멤버변수가 0부터 시작하여 1씩 자동으로 증가
 */

class Season {
	// 하나의 인스턴스 생성하여, 상수로 사용하고 싶다 !
	// 주소가 출력된다 !
	public static final Season SPRING = new Season(); // main 메소드에서 사용하기 위해 static, 값변경되지 않게 final
	
}

public class Ex01 {

	public static void main(String[] args) {

		System.out.println(Season.SPRING); // enumtype.Season@2f92e0f4
		//Season.SPRING = null; // 변경되지 않기 위해 final 사용
		
	}
}
