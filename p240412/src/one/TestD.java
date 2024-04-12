
// 같은 패키지에서 상속

package one;

public class TestD extends TestA {

	// method
	void show() {
//		System.out.println(num1); // error ! private
		System.out.println(num2); // default (같은 패키지)
		System.out.println(num3); // protected (같은 패키지 + 상속 )
		System.out.println(num4); // public
	}
}
