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

class SeasonTwo {
	// 하나의 인스턴스 생성하여, 상수로 사용하고 싶다 !
	// 주소가 출력된다 !
	public static final SeasonTwo SPRING = new SeasonTwo("봄"); // 이것도 field 에 해당
	public static final SeasonTwo SUMMER = new SeasonTwo("여름"); // 이것도 field 에 해당
	public static final SeasonTwo FALL = new SeasonTwo("가을"); // 이것도 field 에 해당
	public static final SeasonTwo WINTER = new SeasonTwo("겨울"); // 이것도 field 에 해당
	
	// feild
	private String name;
	
	// constructor
	private SeasonTwo(String name) { // public -> private, 외부에서 생성자 금지
		this.name = name;
	}
	
	@Override
	public String toString() { // "봄" 글자 출력하기 위해
		return this.name;
	}
	
}

public class Ex02 {

	public static void main(String[] args) {

		// System.out.println(SeasonTwo.SPRING);  
		// toString 전 출력값 : enumtype.SeasonTwo@2f92e0f4
		// toString 후 출력값 : 봄
		
		// new SeasonTwo("가을"); // 외부에서 생성자 만들고 싶지 않음

		System.out.println(SeasonTwo.SPRING);  // 봄, 상수처럼 사용 중
		System.out.println(SeasonTwo.SUMMER);  // 여름
		System.out.println(SeasonTwo.FALL);    // 가을
		System.out.println(SeasonTwo.WINTER);  // 겨울
		
		SeasonTwo s = SeasonTwo.SPRING; // 
		System.out.println("봄 >> " + s);
		
		//SeasonTwo currentSeason = SeasonTwo.SPRING;
		// error ! int 나 String(주소) 가 와야함, 상수가 아닌 값은 올 수 없음
//		switch (currentSeason) {
//		case SeasonTwo.SPRING: 
//			System.out.println("봄이다");
//			break;
//		}
	}
}
