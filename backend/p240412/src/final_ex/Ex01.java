
/*
 * [ final ] : 금지
 * 
 * cf) final =================
 * final 변수	: 값 변경 금지
 * final 메소드 : 오버라이딩 금지 (메소드 재정의 금지)
 * final 클래스 : 상속 금지
 * ===========================
 * 
 * final 메소드 : 부모 class 에 메소드에 사용하면 자식 class 의 메소드가 에러
 * final 클래스 : 부모 class 에 사용하면 자식 class 상속이 안됨, 자식을 둘 수 없음
 * 
 */

package final_ex;

class Parent {
	public void show() {
		System.out.println("[Parent] show() 실행");
	}
}

class Child extends Parent {
	public void show() { 
		System.out.println("[Child] 오버라이딩 된 메소드 show() 실행");
	};
}


public class Ex01 {
	public static void main(String[] args) {

		Child c = new Child();
		c.show();
		
	}

}
