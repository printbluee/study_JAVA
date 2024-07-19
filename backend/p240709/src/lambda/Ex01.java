package lambda;

/*
 * [Lambda expression]
 */

// 자바에서 함수형 인터페이스를 만들어둔 것이 있음
@FunctionalInterface // 함수형 인터페이스
interface Mood {
	
	// abstract method
	String howAreYouFeeling(String feel);
	
	// Lambda 는 intarface 내 abstract method 가 1개만 존재할 때 표현 가능
	// 람다로 표현된 인터페이스는 메서드가 1개여야 컴파일러가 추정이 가능함
	// int star(int num); error !
}

class Person implements Mood {
	@Override
	public String howAreYouFeeling(String feel) {
		return "오늘 기분 : " + feel;
	}
}

public class Ex01 {

	public static void main(String[] args) {

		// 객체 생성
		Mood mood = new Person();
		System.out.println(mood.howAreYouFeeling("무기력"));
		
		// << 익명 클래스 >>
		// [형태 1] 참조변수에 저장 -> 참조변수를 통한 메서드 호출
		Mood moodOne = new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 저는요 ! " + feel;
			}
		};
		
		System.out.println(moodOne.howAreYouFeeling("좋아요"));
		
		// [형태 2] 위 코드를 더 간결하게
		// 일회용
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 더 간결하게 >> " + feel;
			}
		}.howAreYouFeeling("신기하노"));
		
		/*
		 * 정의를 안해서 좋지만 코드가 조금 길어진다 !
		 * 부모의 정보(Mood moodOne)가 오는데 또 부모의 정보(new Mood())가 와야 하는가 ?
		 * 오버라이딩도 생략하고, 선언부도 생략 ? 매개변수는 생략하면 안된다 !
		 * 이렇게 구현된 것이 람다식
		 */
		
		// << 람다식 >> 
		// [람다식으로 변경]
		// : 람다식을 참조변수에 저장
		// : 잠조변수를 통해 람다식을 찾아감
		
		// [형태 1] 
		// 생략 : method 명, 반환형
		// 명시 : 매개변수 타입, 매개변수명, return 키워드
		// 매개변수명 바꿔도 됨 !
		// return 을 명시할 때는 ; 필수
		Mood lambdaOne = (String feel) -> { return "[Lambda 1] 저는요 ! " + feel; };
		
		// [형태 2] 매개변수가 1개일 때는 () 생략 가능 --> 반드시 타입 생략
		// 생략 : method 명, 반환형, () 생략, 매개변수 타입
		// 명시 : 매개변수명, return 키워드
		// 매개변수의 소괄호를 생략시 주의해야 함, 타입도 생략해야 함
		// 컴파일러가 추정을 할 수 있어야 함
		// 매개변수명 바꿔도 됨 !
		// return 을 명시할 때는 ; 필수
		Mood lambdaTwo = feel -> { return "[Lambda 2] 저는요 ! " + feel; };
		
		// [형태 3] body 내 명령어가 1개일 때는 {} 생략 가능
		// 생략 : method명, 반환형, 매개변수 타입, {}, return 키워드
		// 명시 : 매개변수명 
		Mood lambdaTree = a -> "[Lambda 3] 저는요 !" + a;
		
		
		// [람다식 사용] 
		// : 람다식을 사용할 때는, 반드시 메서드명을 명시
		// : 참조변수.메서드명();
		// : JavaScript 의 화살표 함수와 달리, 참조변수가 메서드명이 되지 않음
		// : 참조변수는 참조변수일뿐 !
		System.out.println(lambdaOne.howAreYouFeeling("우왕"));
		System.out.println(lambdaTwo.howAreYouFeeling("() 생략된 람다식 !"));
		System.out.println(lambdaTree.howAreYouFeeling("() 와 {} 생략된 람다식 !"));
		
		
		// << 문제 >> 익명 클래스 [형태 2] 를 lambda 표현식으로 수정
		// : 람다식을 인수에서 사용
		// : 람다식으로 불가능 -> 왜 타입으 ㄹ추정(추정)할 수 없음
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 더 간결하게 >> " + feel;
			}
		}.howAreYouFeeling("신기하노"));
		
//		Mood lambdaFour = feel -> "[익명 클래스 -> 람다식] 더 간결하게 >> " + feel;
//		System.out.println(lambdaFour.howAreYouFeeling("문제 끝 !"));
		
	}
}
