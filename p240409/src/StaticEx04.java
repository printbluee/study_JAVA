
class Person {
	
	// field
	static int count;  	// static field
	int age;		 	// instance field, non-static field
	
	// method
	// static method
	static void staticShow() {
		System.out.println("** static method staticShow() **");
		System.out.println("현재 인원 : " + count); // static field 접근 가능
		// static 영역에 없어서 없는 필드라 에러뜸, 객체가 생성되도 heap 영역에 생성
		// System.out.println("나이 :" + age);		// error ! : instance 필드라 접근 불가능
		
		staticMethod();			// static 	method 호출 가능
		// instanceMethod();	// instance method 호출 불가능 
	}
	
	static void staticMethod() {
		System.out.println("[ staticMethod ] 실행");
	}
 	
	// instance method
	// 객체가 생성이 되면 메모리에 할당이 되는데, 선언과 동시에 할당된 static 영역에 있는 count 를 가져올 수 있음
	// 지역 변수 -> instance field -> static field 순으로 찾음
	void show() {
		System.out.println("** instance method show() **");
		System.out.println("현재 인원 : " + count); // static 	field 접근 가능
		System.out.println("나이 :" + age);			// instance field 접근 불가능
		
		staticMethod();		// static 	method 호출 가능 (미리 할당되었기 때문에 접근 가능)
		instanceMethod(); 	// instance method 호출 가능
	}
	
	void instanceMethod() {
		System.out.println("[ instanceMethod ] 실행");
	}
	
}

public class StaticEx04 {

	public static void main(String[] args) {

		Person p = new Person();
		
	}
}
