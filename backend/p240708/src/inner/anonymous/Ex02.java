package inner.anonymous;

/*
 * [anonymous class] 익명 클래스 =============================
 * - 인터페이스의 추상 메서드를 사용하기 위해 구현 클래스 필요 
 *   즉, 자식이 필요함 하지만 자식을 만들지 않을 것
 *
 * - 유형 3가지
 * 1) 클래스 확장     : 클래스를 확장하는 익명 내부 클래스
 * 2) 인터페이스 구현 : 인터페이스를 구현하는 익명 내부 클래스
 * 3) 인수, 리턴 	  : 인수/ 리턴을 정의하는 익명 내부 클래스
 * ===========================================================
 */

// 2) 인터페이스 구현

interface Space {
	void youKnow();
}

class SubSpace implements Space {
	@Override
	public void youKnow() {
		System.out.println("[SubSpace] 우주에 대해 아는 것이 있나요 ?");
	}
}


public class Ex02 {

	public static void main(String[] args) {

		// 1. [다형성]
		Space spaceOne = new SubSpace();
		spaceOne.youKnow();
		
		// 2-1. [Anonymous class] 인터페이스 구현
		// 인터페이스는 생성할 수 없지만 부모라 () 쓴 것
		// new Space() {} : 익명 클래스로 만든 객체
		Space spaceTwo = new Space() {
			@Override
			public void youKnow() {
				System.out.println("[anonymous] 우리가 있는 태양계는 우리 은하에 속해 있습니다.");
			}
		};
		
		// [과제] 위 코드를 람다로 표현
		Space space = () -> System.out.println("[람다] 우리가 있는 태양계는 우리 은하에 속해 있습니다.");
		space.youKnow();
		// ===============================================
		
		// 2-2. [Anonymous class] 오버라이딩된 메서드 실행
		spaceTwo.youKnow();
		
	}
}
