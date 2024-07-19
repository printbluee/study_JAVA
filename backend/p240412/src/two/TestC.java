
package two; 		// 현재 파일의 위치

import one.TestA; 	// 다른 타입의 위치(경로)
//import one.TestB; // 다른 타입의 위치(경로)
//import one.*; 	// 해당 타입의 모든 파일 가져오기(별표 아스테릭스)


public class TestC {

	// field : 객체 생성
	TestA a = new TestA();
	
	// method
	void show() {
//		System.out.println(a.num1); // error ! private
//		System.out.println(a.num2); // error ! default (같은 패키지 내)
//		System.out.println(a.num3); // error ! protected (객체 생성에서 안됨)
		System.out.println(a.num4); // public
	}
	
}
