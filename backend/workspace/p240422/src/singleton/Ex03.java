package singleton;

// singleton

class Pattern {
	
	// static Pattern meber_field = new Pattern(); // static 에 미리 올려둠
	// 큰 문제점 : 값이 변경될 수 있음 ex) Pattern.meber_field = null;
	
	private static Pattern meber_field = new Pattern(); // static 에 미리 올려둠
	// 값변경을 하지 않기 위해서 private, 값 변경을 하기 위해선 메소드 사용하면 됨 (getPattern())
	// Pattern 클래스가 로드 되자마자 static 에 올라가야함
	
	private Pattern() {} // 인스턴스 생성 제어를 private 로 했음, 클래스 외부에서 인스턴스 생성을 막음
	
	public static Pattern getPattern() { // 외부접근을 위해 static
		System.out.println("[Pattern class 내] member_field >> " + meber_field); // 확인을 하기 위해서 쓴 코드
		return meber_field;
	}

	@Override
	public String toString() {
		return "Pattern 클래스입니다.";
	}
	
	// [문제] 멤버변수(field) i 에 설정된 값을 외부에서 사용하려면 ?
	// [방법 1] 인스턴스 멤버
//	private int i = 100;
//	
//	public int getI() {
//		return i;
//	}
	
	// [방법 2] static 멤버
	private static int i = 100;
	
	public static int getI() {
		return i;
	}
	
}

public class Ex03 {

	public static void main(String[] args) {

		// 1. 인스턴스 생성 불가능 : 생성자가 private
		//Pattern p = new Pattern();
		
		// 2. static 멤버 접근
		//Pattern p = Pattern.meber_field;
		//System.out.println("p >> " + p);
		
		//Pattern.meber_field = null;
		
		// 3. static method 를 통해 생성된 인스턴스 주소 리턴
		Pattern p = Pattern.getPattern();
		System.out.println("p >> " + p);

		// [방법 1] 인스턴스 멤버
//		 System.out.println("인스턴스 field i 값 출력 >> " + p.getI());
		
		// [방법 2] static 멤버
		System.out.println("static field i 값 출력 >>" + Pattern.getI());
	}
}
