
/*
 * [ 변수 종류 ]
 * 
 * ------------------------------------------------------------------------------------------
 * 					  | 메모리 영역 	| 메모리 할당 시기 			| 초기화를 하지 않으면  |
 * ------------------------------------------------------------------------------------------
 * local 	variable  | stack			| 해당 영역이 실행			| 쓰레기 값				|
 * instance field	  | heap			| 인스턴스 생성될 때		| 0 or null				|
 * static 	field	  | static (class)	| class 가 load(로드) 될 때 | 0 or null				|
 * ------------------------------------------------------------------------------------------
 *  
 * [ static ] 
 * - static(class) field ===========================================================
 * : class 가 메모리에 로드(load) 될 때, static(class) 영역에 할당
 * : 클래스명으로 관리 -> 클래스명으로 접근
 * : instance(object, 객체) 생성과 상관없이 접근(사용) 가능
 * 	--> 객체 생성과 상관없이 field 사용하고자 할 때
 * 
 * : [ 문법 ] 클래스명.필드명
 * : 해당 클래스로 생성된 객체들이 공유하는 변수
 * 
 * - static(class) method ==========================================================
 * : class 가 메모리에 로드(load) 될 때, static(class) 영역에 할당
 * : 클래스명으로 관리 -> 클래스명으로 접근
 * : instance(object, 객체) 생성과 상관없이 호출(사용) 가능
 * 	--> 객체 생성과 상관없이 method 호출(사용) 사용하고자 할 때
 * : static(class) 메소드 내에서는 static 멤버만 접근(사용) 가능
 * 	--> 생성(메모리 할당) 시기가 다름
 * 	--> static 멤버가 메모리 할당된 후, 객체 생성 시 instance 멤버가 메모리 할당 됨
 * 
 * : [ 문법 ] 클래스명.메서드명()
 * : 해당 클래스로 생성된 객체들이 공유하는 메서드
 */

class Number {
	
	// field : instance(object) field, static(class) field
	static int one; // 클래스가 로드될 때 제일 먼저 메모리에 할당
	int two;

	// constructor 
	public Number() {
	}
 	
	public Number(int two) {
		this.two = two;
	}
	
}	

public class StaticEx01 {

	public static void main(String[] args) {

		System.out.println("[ static field ] one : " + Number.one);
		Number.one = 1;
		
		Number number = new Number();
		System.out.println("[ instance field ] two : " + number.two); // 참조변수 통해서 접근한 것
		
		// *** 권장 x ***
		// static field 는 static 방식으로 접근 : 클래스.멤버변수명
		// static 멤버가 먼저 저장되고, 주소가 있기 때문에 가져올 수 있지만,
		// static 으로 접근을 해야함 < number.one -> Number.one >
		// System.out.println("one >> " + number.one); 				  
		
	}
}