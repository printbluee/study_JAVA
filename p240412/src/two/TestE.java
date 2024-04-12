
// 다른 패키지에서 상속 (protected)

package two;

import one.TestA;

public class TestE extends TestA {

	// method
	void show() {
//		System.out.println(num1); // error ! private
//		System.out.println(num2); // error ! default (같은 패키지가 아니라서)
		System.out.println(num3); // protected (패키지가 달라도 상속이라서)
		System.out.println(num4); // public
	}
	
}
