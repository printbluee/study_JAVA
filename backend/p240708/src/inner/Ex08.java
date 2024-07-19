package inner;

/*
 * [local inner class] ===========================================
 * : method 내 정의된 클래스
 * : 접근 권한 사용 불가능 - pubilc / private, 기본 값은 default
 *   => 메소드 내엥서만 사용하기에 접근 권한 불필요
 * : static 사용 불가능
 * : static 멤버 선언 불가능 -> 허용은 되지만 권장 x
 * ===============================================================
 */

class OuterEight {
	
	// instance method =========================================
	public void show() {
		// local variable
		int num = 10;
		
		// method 내 정의된 inner class ------------------------
		class InnerEight {
			// instance field
			int num;
			
			// static field
			// : static 의 의미가 없음, 여기 안에서만 사용할거니까
			static int user;
			
			// constructor
			public InnerEight() {
				this.num = 5;
				System.out.println("[InnerEight] 생성자 실행");
			}
			
			// instance method
			// : 메소드가 실행이 될 때 메모리 할당
			public void showNum() {
				System.out.println("[InnerEight] num >> " + num);
			}
		}
		// -----------------------------------------------------
		// method 내 객체 생성
		InnerEight in = new InnerEight();
		in.showNum();
	}
	// =========================================================
	
}

public class Ex08 {

	public static void main(String[] args) {

		OuterEight outer = new OuterEight();
		outer.show();
	}
}
