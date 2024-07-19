
/*
 * ===================
 * |class 는 '자료형'|
 * ===================
 * 
 */

public class StaticEx07 {
	
	// static field
	// StaticEx07 도 자료형이기 때문에 class 파일이 참조 변수에 저장이 됨
	// new 인스턴스 객체는 객체 생성 시 heap 영역에 만들어짐
	static final StaticEx07 s = new StaticEx07();
	
	// instance field
	int num = 100;
	
	// instance method
	void show() {
		System.out.println("num >> " + num);
	}
	
	public static void main(String[] args) {

//		System.out.println(num);
		s.show();
	}

}
