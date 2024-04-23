
// Number 파일과 함께 보기

package enumtype;

public class Ex04 {

	public static void main(String[] args) {

		Number currentNumber = Number.ONE; // 참조변수 : currentNumber, ONE
		// String one = "one";
		
		// 문법이 지원된 것
		// 필드값을 넣을 수 있었던건 Number 의 field 가 타입이 같아서 
		switch (currentNumber) { // 정수, 근데 주소 넣었음
		case ONE:
			System.out.println("1이다");
			break;
		case TWO:
			System.out.println("2이다");
			break;
		case TRHEE:
			System.out.println("3이다");
			break;
		case FOUR:
			System.out.println("4이다");
			break;
		default: 
			System.out.println("1 미만 4 초과");
		}
		
		// [출력] 
		// 1. enum Number 에 저장된 값
		for (Number idx: Number.values()) {
			System.out.println("idx >> " + idx);
		}
		
		// 2. 서수 출력
		for (Number idx: Number.values()) {
			System.out.println("idx >> " + idx.ordinal());
		}
		
	}
}
