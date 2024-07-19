package functionalinterface;

import java.util.function.Supplier;

public class Ex01 {

	public static void main(String[] args) {

		// --------------------------------------------------------
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// [Supplier] 공급자
		// T get() : 매개변수 없고, 반환값 있음
		// --------------------------------------------------------
		
		// [익명 클래스] anonymous class ==========================
		Supplier<String> anonymous = new Supplier<String>() {
			@Override
			public String get() {
				return "[익명 클래스] 신기한 함수형 인터페이스";
			}
		};
		
		System.out.println(anonymous.get());
		
		// [람다] ==================================================
		// 참조변수에 저장
		Supplier<String> lambda = () -> "[람다] 신기한 함수형 인터페이스";
		System.out.println(lambda.get());
		
	}
}
