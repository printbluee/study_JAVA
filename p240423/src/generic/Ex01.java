package generic;

/*
 * [generic] 제너릭
 * : type 을 일반화(generalize)함
 * : type 은 컴파일 할 때 결정이 됨 (미리 지정 x)
 * : generic 은 type 을 외부에서 결정(지정)
 * : JDK 1.5 부터 도입(지원)
 * : 보통 한글자를 씀 <T>
 * : 타입 매개변수라 불림
 */

class Test<T> { // 제너릭 클래스라 불림
	private T element; // 이 부분은 구체화 하지 않음(type 지정x)
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public T getElement() {
		return element;
	}
}


public class Ex01 {

	public static void main(String[] args) {

		Test<String> t = new Test<String>();
		t.setElement("ㅎㅇ");
		System.out.println(t.getElement());
		
		//Test<int> t2 = new Test<int>(); error ! primitive type 못씀
		Test<Integer> t2 = new Test<Integer>();
		t2.setElement(5); // boxing
		System.out.println(t2.getElement());
		
		//t2.setElement("ㅎㅇ"); error ! t2 의 type 은 Integer
	}
}
