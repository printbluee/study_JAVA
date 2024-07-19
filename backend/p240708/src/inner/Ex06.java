package inner;

class OuterSix {
	
	// instance method 
	public void instanceMethod() {
		InnerInstance in = new InnerInstance();
		InnerStatic ins = new InnerStatic();
	}
	
	// static method
	public static void staticMethod() {
		// InnerInstance in = new InnerInstance(); error !
		InnerStatic ins = new InnerStatic();
	}
	
	// inner class ==========================
	// instance class
	// : Outer class 의 instance method 에서 접근(사용) 가능
	class InnerInstance {} // 멤버 생략
	
	// static inner class
	// : Outer class 의 instance method, static method 에서 접근(사용) 가능
	static class InnerStatic {} // 멤버 생략
	// ======================================
	
}

public class Ex06 {

	public static void main(String[] args) {

	}
}
