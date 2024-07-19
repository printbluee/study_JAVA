package method.reference;

import java.util.function.Consumer;

public class Ex02 {

	public static void main(String[] args) {

		// 출력 메서드 : System.out.println() ======================
		// : 매개변수 1개, 리턴형 void
		// : Consumer 참조 가능
		// =========================================================
		
		// [메서드 차조 표현식]
		Consumer<String> methodReference = System.out::println;
		methodReference.accept("[method 참조] 즐거운 하루");
		
	}
}
