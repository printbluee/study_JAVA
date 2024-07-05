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