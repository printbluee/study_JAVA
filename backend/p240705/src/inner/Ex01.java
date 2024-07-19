package inner;

/*
 * [inner class] 
 * : 내부 클래스      / 중첩 클래스      / inner  class
 * : 정적 내부 클래스 / 정적 중첩 클래스 / static inner class (inner class 보완)
 * : 지역 내부 클래스 / 지역 중첩 클래스 / local inner class
 * : 익명 클래스	  /                  / anonymous class
 * 
 *  익명 클래스는 inner class 로 보면 안된다 라는 말이 나오지만
 *  익명 클래스를 만든 개발자도 어디에 둬야할지 몰라 inner class 에 넣음
 *  
 *  
 *  1. 일반 중첩/내부 클래스 (inner class)
 *  : 외부 클래스 영역에 선언된 클래스 중에서 static 키워드를 가지지 않는 클래스
 *  : 주로 외부 클래스(outer class) 의 인스턴스 변수나 인스턴스 메서드에 사용될 목적으로 선언
 *  : class 관리 효율을 높임
 *  
 *  2. 정적 중첩/내부 클래스 (static inner class)
 *  : 외부 클래스 영역에 선언된 클래스 중 static 키워드를 가진 클래스
 *  : 주로 외부 클래스(outer class) 의 static 메서드에 사용될 목적으로 선언
 *  
 *  3. 지역 중첩/내부 클래스 (local inner class)
 *  : 외부 클래스의 메서드나 생성자 영역(블록) 에 선언된 클래스
 *  : 이러한 지역 클래스는 선언된 영역(블록) 내에서만 사용 가능
 *  
 *  4. 익명 클래스 (anonymous class) ★
 *  : 다른 내부 클래스와 달리 이름을 가지지 않는 클래스
 *  : 익명 클래스는 선언과 동시에 객체를 생성하므로, 단 하나의 객체만을 생성하는 일회용 객체
 *  : 목적 : 오버라이딩하여 함수 재정의
 *  
 */

class Outer { // Outer class, 외부 클래스
	// [멤버]
	// 멤버 변수 : instance field, static field
	private int age; // instance field
	
	// 멤버 메서드 : instance method, static method
	public void show() { // instance method
		
	}
	
	class Inner { // inner class, 내부 클래스
		// instance field
		int num;
		
		// construtor
		public Inner(int num) {
			super();
			this.num = num;
		}
		
		// instance method
		public void showNum() {
			System.out.println("[Inner class] num >> " + this.num);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {

		// Outer 객체 생성
		Outer outer = new Outer();
		
		// Inner 객체 생성
		Outer.Inner in = outer.new Inner(5);
		in.showNum();
		
	}
}
