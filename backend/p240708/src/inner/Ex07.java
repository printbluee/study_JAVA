package inner;

class OuterSeven {
	
	// =======================================
	// method 밖 local inner class 접근 불가능
	// =======================================
	// InnerSeven in = new InnerSeven();
	
	// instance method
	public void show() {
		// local variable
		// 멤버라 부르지는 않음
		int num;
		
		// local inner class
		// : 멤버 메소드 안에 지역 중첩 클래스
		class InnerSeven {}
		
		// =======================================
		// method 내 local inner class 접근 가능
		// =======================================
		InnerSeven in = new InnerSeven();
	}
}

public class Ex07 {

	public static void main(String[] args) {

		
	}
}
