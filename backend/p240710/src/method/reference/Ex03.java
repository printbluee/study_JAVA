package method.reference;

import java.util.function.Function;

@FunctionalInterface
interface Greeting {
	int say(String str);
}
// 뭐든 람다는 익명으로 바꿀 수 있지만, 뭐든 익명은 람다 x

public class Ex03 {

	public static void main(String[] args) {
		
		// [메서드 참조 표현식]
		// 1) 정의한 인터페이스
		// string 은 static 처럼 사용할 수 있음
		// :: 하고 컨트롤 스페이스바 하면 String 과 관련된 메서드를 볼 수 있음
		
		
		// interface 의 선언부와 맞지 않아서 String::compareTo 안됨
		Greeting greeting = String::length;
		System.out.println("문자열 길이 >> " + greeting.say("오후"));
		
		// 2) Function
		Function<String, Integer> function = String::length;
		System.out.println("[Function] 문자열 길이 >> " + function.apply("더운 오후"));
		
	}
}
