package functionalinterface;

import java.util.function.Function;

public class FunctionQuiz {

	public static void main(String[] args) {

		// [문제 1] 문자열 1개를 입력 받은 후, 문자열의 길이를 리턴
		// hello -> 5, hi -> 2
		Function<String, Integer> functionOne = str -> str.length();
		System.out.println(functionOne.apply("hello"));
		
		// [문제 2] 정수 1개 받아서, 제곱한 정수 리턴 (식)
		Function<Integer, Integer> functionTwo = num -> num * num;
		System.out.println(functionTwo.apply(5));
		
		// [문제 3] 정수 1개 받아서, 1 증가한 정수 리턴 (식)
		Function<Integer, Integer> functionTree = num -> num + 1;
		System.out.println(functionTree.apply(5));
		
		// ==========================================================
		// 단, [문제 2] 와 [문제 3]의 람다 사용
		// Fuction 의 andThen 또는 compose 사용
		// https://moreget.github.io/dev-00000064-Java-ConsumerAndThen/
		// ==========================================================
		// [문제 4] 정수 1개 받아서, 1 증가한 정수 리턴 (식)
		// ex) 5를 1 증가한 후 제곱한 값 출력
		Function<Integer, Integer> andThenOne = functionTree.andThen(functionTwo);
		System.out.println(andThenOne.apply(5));
		
		// [문제 5] 정수 1개 받아서, 제곱한 후 1 증가 코드 작성
		// ex) 5를 제곱한 후 1 증가한 값 출력
		Function<Integer, Integer> andThenTwo = functionTree.compose(functionTwo);
		System.out.println(andThenTwo.apply(5));
		
	}
}
