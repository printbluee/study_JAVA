package functionalinterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerQuiz {

	public static void main(String[] args) {

		// ---------------------------------------------------------
		// cf) 문자열.split() : 특정 문자 기준으로 나누기
		// ---------------------------------------------------------
		
		// 공백 기준으로 문자열 나누기
		System.out.println("문자열 나누기 작업 중".split(" ")); // [Ljava.lang.String;@372f7a8d -> 1차원 배열
		System.out.println("문자열 나누기 작업 중".split(" ")[1]);
		
		// 배열에 저장
		// 1. 공백 기준 : 문자열 모두 나누기
		// [문자열, 나누기, 작업, 중]
		String[] s = "문자열 나누기 작업 중".split(" ");
		System.out.println(s); 							  // [Ljava.lang.String;@2f92e0f4
		System.out.println("s >> " + Arrays.toString(s)); // s >> [문자열, 나누기, 작업, 중]
		System.out.println("인덱스 0 >> " + s[0]);
		
		// 2. 공백 기준 : 문자열 2개로 나누기
		// [문자열, 나누기 작업 중]
		String[] s2 = "문자열 나누기 작업 중".split(" ", 2);
		System.out.println(s2); 							// [Ljava.lang.String;@5674cd4d
		System.out.println("s2 >> " + Arrays.toString(s2)); // s2 >> [문자열, 나누기 작업 중]
		
		// 3. 공백 기준 : 문자열 3개로 나누기
		// [문자열, 나누기, 작업 중]
		String[] s3 = "문자열 나누기 작업 중".split(" ", 3);
		System.out.println(s3); 							// [Ljava.lang.String;@63961c42
		System.out.println("s3 >> " + Arrays.toString(s3)); // s3 >> [문자열, 나누기, 작업 중]
		
		// 3. 공백 기준 : 문자열 5개로 나누기
		// [문자열, 나누기, 작업, 중]
		String[] s4 = "문자열 나누기 작업 중".split(" ", 5);
		System.out.println(s4); 							// [Ljava.lang.String;@65b54208
		System.out.println("s4 >> " + Arrays.toString(s4)); // s4 >> [문자열, 나누기, 작업, 중]
		System.out.println();
		
		// [문제] 문자열을 입력 받은 후, 공백 기준 두 번째 문자열 출력
		// 오늘도 즐거운 하루 -> 즐거운
		// [람다] ==================================================
		Consumer<String> lambda = (str) -> {
			String[] strList = str.split(" ");
//			System.out.println(Arrays.toString(strList));
			System.out.println(strList[1]);
		};
		lambda.accept("오늘도 즐거운 하루");
		
	}
}
