package generic;

/* 
 * [Generic] 제네릭 ============
 * : type 을 일반화 (generalize)
 * : 컴파일할 때 type 결정
 * : type 을 외부에서 결정(지정)
 * : JDK 1.5 부터 도입
 * ===========================
 */

// 제네릭 클래스
class TestOne<T> {
	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		// TestOne<타입> T = new TestOne<타입>();
		TestOne<Integer> t = new TestOne<Integer>();
		t.setElement(5);
		System.out.println(t.getElement());
		
		TestOne<String> str = new TestOne<String>();
		str.setElement("안녕");
		System.out.println(str.getElement());
	}
}