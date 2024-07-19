package functionalinterface;

import java.util.function.Predicate;

public class Ex04 {

	public static void main(String[] args) {
		
		// [익명 클래스] 
		Predicate<Integer> anonymous = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t >= 0;
			};
		};
		
		System.out.println("1은 양수인가요 ? " + anonymous.test(1));
			
		// [람다]
		Predicate<Integer> lambda = t -> t >= 0;
		System.out.println("-1은 양수인가요 ? " + lambda.test(-1));
		
	}
}
