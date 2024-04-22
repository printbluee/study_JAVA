package ifmon;

public class Ex03 {

	public static void main(String[] args) {

		// [문제] 출력값을 예상하고, 그러한 이유를 설명하시오.
		
		int num = 50;
		
		if (num < 0) {
			System.out.println("0 미만");
		} else {
			if (num < 100) {
				System.out.println("100 미만");
			} else {
				System.out.println("100 이상");				
			}
		}
		
	}
}
