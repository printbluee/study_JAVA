package enumtype;

/*
 * [enum] 열거형
 * - JDK 1.5 부터 지원
 * - 변수를 상수화
 * - 열거형 상수(constant)
 * - 멤버변수(field) 를 모두 대문자 사용
 * - 관련 있는 상수(constant) 를 하나의 이름으로 관리
 * - 첫 번째 멤버변수가 0부터 시작하여 1씩 자동으로 증가
 */

enum SeasonThree { // enum : 타입, 컴파일러는 class 로 파일 저장됨
	
	// private SeasonThree() {}	error ! enum 은 field가 먼저 와야함
	
	/*
	 * [field]
	 * : public static final
	 * : 값 변경 불가능
	 * : field 는 enum 의 첫 라인에 작성
	 * : switch 문에서 사용 가능
	 */
	
	SPRING, SUMMER, FALL, WINTER; // 내부적으로 ; 붙여줌, 하지만 다음 코드 작성할 땐 마지막에 ; 붙이기
	
	//public static final SeasonThree SPRING = new SeasonThree("SPRING"); 
	
	// public SeasonThree()  -> error ! enum 의 접근 제어자는 public 올 수가 없음
	// enum 의 접근 제어자는 private 으로 할 것
	// 생성자 필요없는데 확인하기 위해서 넣어둔 것
	private SeasonThree() { // enum 은 무조건 field가 첫번째로 와야하고, 나머지 코드는 그 뒤로 할 것
		System.out.println("생성자 실행");
	} 
} 

public class Ex03 {

	public static void main(String[] args) {
		
		// 인스턴스 생성 불가능, interface 처럼 인스턴스 생성하는 타입이 아님
		//SeasonThree seasonThree = new SeasonThree(); 
		
		//SeasonThree.SPRING = null; error ! 값 변경 불가능
		
		System.out.println(SeasonThree.SPRING); // SPRING, 문자열 그대로 나옴
		System.out.println(SeasonThree.SUMMER); 
		System.out.println(SeasonThree.FALL); 
		System.out.println(SeasonThree.WINTER); 

		SeasonThree spring = SeasonThree.SPRING;
		System.out.println("spring >> " + spring); // spring >> SPRING
		
		SeasonThree spring2 = SeasonThree.SPRING;
		
		// 알수 있는 사실 : 같은 값을 리턴해준다
		if (spring == spring2) {
			System.out.println("같다");
		} else {
			System.err.println("다르다");
		}
		
		System.out.println(SeasonThree.SPRING.getDeclaringClass());				// class enumtype.SeasonThree
		System.out.println(SeasonThree.SPRING.getDeclaringClass().getClass());  // class java.lang.Class
		System.out.println(SeasonThree.SPRING.getDeclaringClass().getName());   // enumtype.SeasonThree
		
		//  열거형 상수명 리턴 (field 에 저장된 값)
		System.out.println(SeasonThree.SPRING.name());  // SPRING, 필드에 저장된 값							
		
		// 1차원 배열
		System.out.println(SeasonThree.values());  		// [Lenumtype.SeasonThree;@85ede7b
		
		// 향상된 for 문
		// ordinal() : 서수 : 순서
		for (SeasonThree idx: SeasonThree.values()) {
			System.out.println(idx); // 참조변수 필드 출력
			System.out.println(idx.ordinal()); // 첫 번째 멤버변수가 0부터 시작하여 1씩 자동으로 증가 확인 방법
		}
		
	}
}
