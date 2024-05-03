
/*
 * [ 클래스 ] class ========================================
 * - 클래스는 '자료형'
 * - 사용자(개발자) 정의 자료형
 * - 참조형(reference type)
 * 		cf) 기본형(primitive type) : int, float, double, ...
 * - 클래스명 : 대문자로 시작
 * - 클래스 내 멤버 : 변수, 메소드 
 * 
 * - 참조(reference) 변수 선언 형태
 * 	클래스명 변수명;
 * 	
 * 	cf) int num;
 * =========================================================
 */

// [ class 정의 ]
class Student{
	
	// 멤버 : 변수
	int age; // 지역변수, heap 에 할당
	String name;
	
	// 멤버 : 메소드
	/* 반환형 메소드명(매개변수) {
	 *  	명령어;
	 *  	return 값;
	 *  }
	 */
	void study() {
		System.out.println("열심히 공부 중 !");
	}
}


public class InstanceEx01 {

	public static void main(String[] args) {
		// [ 변수 선언 ] ===================
		// [ 기본형 ] 
		// 자료형 변수명;
		int num = 1; // 지역변수, stack 에 할당
		System.out.println("num >> " + num);
		
		// [ 자료형 ] 
		// 참조 변수 선언
		// 클래스 변수명;
		// Student jin; 은 쓰레기값 // stack 영역에 저장
		Student jin = null; // stack 에 저장 // 0도 되는데 그럼 에러가 나서 null 를 씀, 찾아갈 곳이 없다는 뜻, 아스키코드표
		
		// 객체 생성 == 인스턴스 생성(인스턴스라 더 불림)
		// new 클래스명(); // new -> heap 영역에 할당해라 뜻
		jin = new Student(); // 바로 heap 영역으로 갈 수 없음
		
		// 멤버 접근
		System.out.println("멤버 변수 age 초기값 >> " + jin.age);
		System.out.println("멤버 변수 name 초기값 >> " + jin.name);
		
		// 멤버 변수에 값 설정
		jin.age = 27;
		System.out.println("멤버 변수 age >> " + jin.age);
		jin.name = "진혜정";
		System.out.println("멤버 변수 name >> " + jin.name);
		
		// 멤버 메서드 study() 호출
		jin.study();
		
		// 참조 변수 선언과 동시에 초기화
		Student jung = new Student();
		
		System.out.println("정재호 나이 >> " + jung.age);
		System.out.println("정재호 이름 >> " + jung.name);
		
		// new Student(); // 에러는 발생 안함, 객체 생성은 했지만 주소가 없어서 찾아갈 방법 x, 
		
		// 일회용으로 생성된 객체
		new Student().study();
		
		
		
		
		
		
		
		
	}
}
