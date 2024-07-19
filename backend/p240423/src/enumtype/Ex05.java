
// NumberTwo 파일과 함께 보기

package enumtype;

public class Ex05 {

	public static void main(String[] args) {

		System.out.println("[field 에 저장된 값]");
		for (NumberTwo n: NumberTwo.values()) {
			System.out.println(n);
		}
		
		System.out.println("\n[서수]");
		for (NumberTwo n: NumberTwo.values()) {
			System.out.println(n.ordinal());
		}
		
		System.out.println("\n[getNumber() 호출]");
		for (NumberTwo n: NumberTwo.values()) {
			System.out.println(n.getNumber()); // 타입 Integer
		}
		
//		if (NumberTwo.ONE == 1) 이든 if (NumberTwo.ONE == "1")
//		error ! enum 의 좋은 점, type 을 쓰면 저장된 값은 1이지만 실제 타입은 NumberTwo 임
		if (NumberTwo.ONE == NumberTwo.FOUR) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (NumberTwo.ONE.getNumber() == 1) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
}
