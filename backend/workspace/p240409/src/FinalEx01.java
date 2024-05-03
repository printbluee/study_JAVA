
/*
 * [ Final ]
 * : 금지 (값 변경에 대한 금지)
 * 
 * cf) final =====
 * final 변수
 * final 메서드
 * final 클래스
 * ===============
 * 
 * [ final 변수 ]
 * : 초기화한 값으로 변수의 값 고정
 * : 값 변경 금지
 * : 변수를 상수화(시켰다 라고 말함) ==> 상수 (constant)
 * : 이름 있음 (상수는 없지만 final 변수는 있다는 뜻)
 * : 변수명은 대문자로
 * 
 * [ literal ] 리터럴
 * : 값 그 자체
 * : 이름 없음
 */

public class FinalEx01 {
	
	public static void main(String [] atgs) {
		
		// [ 지역 변수 ]
		// 변수 선언과 동시에 초기화
		// 보통 final 은 변수명을 대문자로 함 
		final float PI = 3.14F;
		System.out.println(PI);
		
		// final 변수 선언
		// 지역 변수니까 stack 영역에 저장
		final int num;
		
		// 변수 초기화
		num = 5;
		System.out.println("num >> " + num);
		
		// error ! 변수 값 변경 금지
		// num = 10;
		// System.out.println("num >> " + num);
	}
}
