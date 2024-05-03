
/*
 * [ 오버라이딩 ] // 상속 관계에서 나타남  
 * 
 * 자식의 오버라이딩된 메소드는 부모의 멤버 메서드의 접근 제어자보다
 * 크거나 같아야 함
 */

package modifier;

class Perent {
	public void show() { // 접근 권한 : default -> public
		System.out.println("show() 실행");
	}
}

class Child extends Perent {
	
	public void show() { // void show()만 썼을 때 error ! 상속 후 오버라이딩 할 때, 접근 권한이 감소하면 안됨
		System.out.println("[오버라이딩된 메소드] show() 실행");
	}
}

public class Ex01 {

	public static void main(String[] args) {

		Child test = new Child();
		test.show();
		// [오버라이딩된 메소드] show() 실행
	}

}
