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

// 1) 클래스 확장 -> 결국 상속

class Super {
	public void show() {
		System.out.println("[Super class] show() 실행");
	}
}

class Sub extends Super {
	// constrictor
	public Sub() {
		System.out.println("[Sub class] constrictor 실행");
	}
	
	@Override
	public void show() {
		System.out.println("[Sub class] 오버라이딩된 메서드 show() 실행");
	}
}

public class Ex01 {

	public static void main(String[] args) {

		// 1-1. [다형성]
		Super s = new Sub();
		
		// 1-2. [다형성]
		s.show();
		
		// 2-1. [익명 클래스] 클래스 확장
		// {} : 클래스 정의 하면서 , 이름이 없는 자식, 한 번만 쓰고 말 것
		// Super : 부모의 이름
		// 부모를 생성한 거 같지만, {} 안에 클래스를 정의하면서 익명으로 자식 클래스 정의한 것
		// 생성자를 만들 수 없음(이름이 없으니까)
		Super anonymous = new Super() {
			// 생성자 정의 불가능 ! -> 클래스명이 없어서 !
			
			// 오버라이딩한 메서드
			@Override
			public void show() {
				System.out.println("[anonymous] 오버라이딩된 메서드 show() 실행");
			}
			
			@Override
			public String toString() {
				return "[anonymous] 나는 익명 클래스 !";
			}
			
			// instance method
			// 단독으로 정의가 안됨 -> 부모쪽에 정의가 되어 있지 않음
			// 익명 클래스는 새로운 정의를 할 수 없음
			// 부모의 멤버 메서드를 오버라이딩 해야 사용할 수 있음
			// 한 번만 사용함
			// 여러 번 쓰고 싶다면 익명 클래스가 아닌 클래스를 정의해서 사용할 것
			public void say() {
				System.out.println("[anonymous] 익명 클래스에서 정의된 say() 실행");
			}
		};
		
		anonymous.show();
		System.out.println(anonymous); // inner.anonymous.Ex01$1@5305068a -> [anonymous] 나는 익명 클래스 !
		// anonymous.say(); 경고 ! : The method say() is undefined for the type Super
		
		
		
		
		
	}
}
