package one;

public class TestB {

	// field
	TestA a = new TestA(); // heap 영역에 할당(인스턴스 객체라서)
	
	void show() {
//		System.out.println(a.num1); // error ! private
		System.out.println(a.num2); // default (같은 패키지 내에 있어서 접근 허용)
		System.out.println(a.num3); // protected (상속도 포함이지만, 같은 패키지 내 접근 허용)
		System.out.println(a.num4);
	}
}
