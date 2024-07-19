package method.reference;

/*
 * [메서드 참조] Method Reference
 * 이중 콜론 연산자 :: 
 * 함수형 인터페이스를 람다식이 아닌 일반 메서드로 '참조'하여 선언하는 방법
 * 즉, 컴파일러가 람다의 타입을 추론할 수 있도록 정보 제공하는 역할
 * 
 * - functional interface 반드시 abstract method 가 반드시 1개 
 *   (Single Abstract Method : SAM)
 * 	 @FunctionalInterface 어노테이션으로 보장
 * 
 * - 리턴 타입과 파라미터 타입이 동일한 "기존에 구현된" 메서드를
 *   참조하면 더 간편하게 사용할 수 있음
 * 
 * - '기존에 정의된' 메서드와 'abstract method' 의 선언부가 완전히 같아야 함
 *   단, 메서드명과는 관련(상관) 없음 -> 메서드명은 달라도 됨
 *   '기존에 정의된 메서드'의 body 를 사용하는 것이 핵심
 *   따라서 abstract method 를 완전히 하나의 메서드로 호출 가능
 *   
 * - 참조 : 가리킨다 -> 가리키는 역할
 *   참조만 하기에, 메서드명만 사용하고, 파라미터의 ()는 제외
 *   즉, 주소만 사용
 *   * 이미 정의된 메서드의 body 만 가져다 사용하는 형태 
 *   
 * - cf) anonymous class -> fuctional interface -> lambda expression
 *       -> method reference expreesion 
 * 
 * - 참조 가능한 메서드 : instance method, static method, construtor
 * 
 * - [문법]
 * 1) 인스턴스::메서드명
 * 2) 클래스::new
 * 3) 클래스::메서드명 - 메서드가 static 일 때
 * 
 * 
 */

@FunctionalInterface
interface Fruit {
	String selfIntroduction(String s1, String s2);
}

class Add {
	public Add() {
		System.out.println("[Add class] 생성자 실행됨");
	}
	
	public String instanceAdd(String s1, String s2) {
		return s1.concat(", ").concat(s2);
	}
	
	public static String staticAdd(String s1, String s2) {
		return s1 + "-" + s2;
	}
}

// 1. class 구현
class Banana implements Fruit {
	@Override
	public String selfIntroduction(String s1, String s2) {
		return s1.concat(s2);
	}
}

public class Ex01 {

	public static void main(String[] args) {

		// [1. class 구현 후 객체 생성]
		Banana banana = new Banana();
		System.out.println(banana.selfIntroduction("안녕 ", "난 바나나"));
		
		// [2. anonymous class]
		Fruit anonymous = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return "[익명 클래스] " + s1.concat(s2);
			}
		};
		
		System.out.println(anonymous.selfIntroduction("안녕 ", "자기소개 시간"));
		
		// [3. lambd]
		Fruit lambda = (s1, s2) -> "[람다]" + s1.concat(s2);
		lambda.selfIntroduction("안녕", "좋은 하루");
		
		// [4. method reference]
		// 4-1. instance method
		Add add = new Add();
		
		// 4-2. instanceAdd 메서드의 주소를 one 에 저장
		Fruit one = add::instanceAdd;
		
		System.out.println(one.selfIntroduction("첫번째", "두번째"));
		
		Fruit two = new Add()::instanceAdd;
		System.out.println(two.selfIntroduction("하나", "둘")); // 주소 통해서 감
		
		// 4-3. static method
		Fruit staticOne = Add::staticAdd;
		System.out.println(staticOne.selfIntroduction("일", "둘"));
		
		// 4-4. construtor
		Runnable con = Add::new;
		con.run(); // 생성자 실행
		
	}
}
