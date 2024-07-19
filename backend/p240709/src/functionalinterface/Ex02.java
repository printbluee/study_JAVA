package functionalinterface;

import java.util.function.Consumer;

public class Ex02 {

	public static void main(String[] args) {

		// --------------------------------------------------------
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// [Consumer] 소비자
		// void accept(T t) : 매개변수 있고, 반환값 없음
		// --------------------------------------------------------
		
		// [익명 클래스] anonymous class ==========================
		Consumer<String> anonymous = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		anonymous.accept("[익명 클래스] 오늘도 즐거운 하루");
		
		// [람다] ==================================================
		Consumer<String> lambda = (str) -> System.out.println(str);
		lambda.accept("[람다] 오늘은 .. ㅠ 하루");
		
	}
}
