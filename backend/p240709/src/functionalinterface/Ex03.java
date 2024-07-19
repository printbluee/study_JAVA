package functionalinterface;

import java.util.function.Function;

public class Ex03 {

	public static void main(String[] args) {

		// --------------------------------------------------------
		// https://docs.oracle.com/javase/8/docs/api/index.html : java.util.fuction
		// Function<T, R>
		// Function<매개변수 타입, 반환형>
		// R apply(T t) : 매개변수(1개, T) 있고, 반환값(R) 있음
		// --------------------------------------------------------
		
		// [익명 클래스] anonymous class =======================================
		Function<Integer, String> anonymous = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return "[익명 클래스] 매개변수 값은 " + t + "입니다.";
			}
		};
		
		System.out.println(anonymous.apply(100));
		
		// [람다] ==============================================================
		Function<Integer, String> function = (Integer t) -> "[람다] 매개변수 값은 " + t + "입니다.";
		System.out.println(function.apply(500));
		
		
		
	}
}
