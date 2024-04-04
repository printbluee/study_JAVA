
/* 
 * [ 클래스 ] class
 * - 자료형
 * - 사용자 정의 자료형
 * - 객체 아님
 * 
 * [ 객체 ] object, instance ========================================
 * - 클래스로 생성된 구체화(실체화)된 대상
 * - java 는 모든 객체를 heap 영역에 생성 --> 멤버도 heap 영역에 할당
 * - 객체가 heap 영역에 생성되면, 할당된 주소를 리턴(반환)
 * - 생성된 객체는 반드시 주소를 통해 접근(간접 접근) / 바로 접근 x
 * 
 * [ 객체 생성 문법 ] ===============================================
 * new 클래스명();
 * new : heap 영역에 할당해라 
 * 
 * [ 참조 변수 선언 문법 ] ==========================================
 * 클래스명 변수명;
 * 
 */ 

class Student {
	
	// 멤버 변수
	int age;
	String name;
	
	// 멤버 메소드
	void study() {
		System.out.println("오늘도 . . 열심히 . . 공부를 .. 하네 . . .");
	}
}


public class InstanceEx01 {

	public static void main(String[] args) {
		
		// 참조 변수 선언
		// Student class 로 생성된 객체가 저장'될' 참조 변수 선언
		Student jin;
		
		// 객체 생성
		// heap 영역에 Student class 로 객체 생성
		jin = new Student();
		
		// 멤버 접근
		// 멤버 변수는 외부 접근을 권장하지 않음
		System.out.println("나이 : " + jin.age);
		jin.age = 35;
		System.out.println("나이 : " + jin.age);
		
		// 멤버 메소드
		jin.study();
		
	}	
}














