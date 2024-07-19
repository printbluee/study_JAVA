package ifmon;

public class Ex01 {

	public static void main(String[] args) {

		// [문제] 출력값을 예상하고, 그러한 이유를 설명하시오.
		
		int num = 5;
		
		if(num >= 10) {
			num++; 
			System.out.println("true일 때, 실행되는 영역 ");
		} else {
			System.out.println("false일 때, 실행되는 영역 ");	
		}
		System.out.println("num : " + num);
		
	}
}
