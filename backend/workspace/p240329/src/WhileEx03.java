
/*
 * [ 지역 변수 ] local variable
 * - 영역 내 선언된 변수
 * - 영역 내에서만 사용(접근) 가능
 * - 영역 밖에서는 사용(접근) 불가능
 */

public class WhileEx03 {

	public static void main(String[] args) {
		
		int idx = 1; // 값 설정
		
		while (idx <= 5) { // 조건식
			int num = 100; // 지역 변수
			System.out.println("while 문 내 선언된 변수 num : " + num);
			
			idx++; // 증감식
		}
		
		System.out.println("idx : " + idx);
//		System.out.println("while 문 밖 선언된 변수 num : " + num);
		
	}
}