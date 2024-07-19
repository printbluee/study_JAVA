package singleton;

/*
 * [객체 생성 불가능] ===================
 * - private constructor : private 생성자
 * - abstract class 	 : 추상 클래스
 * - interface 			 : 인터페이스
 * ======================================
 */

//private constructor : private 생성자
class Cat {
	private Cat() {
		System.out.println("난 고양이 !");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		// Cat cat = new Cat();
	}
}
