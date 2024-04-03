
class Person { // 실체화가 됐다 => 멤버 메서드가 할당 됐다는 뜻
	
	// 멤버 변수 
	int age;
	
	// 멤버 메서드
	void showInfo() {
		System.out.println("<< 정보 >>");
	}
}

public class InstanceEx02 {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		Person p1 = new Person(); // 참조 변수
		
		// 2. 객체 멤버에 접근
		System.out.println("멤버 변수 age >> " + p1.age); // 주소.age
		
		// 3. 참조 변수 p1 의 저장된 주소
		System.out.println("참조 변수 p1 의 저장된 주소 >> " +p1);
		
		// 참조 변수가 무조건 지역 변수가 되는 것이 아님
		// Person p2; 
		
		// 주소 복사 : p1 에 저장된 주소를 p2에 복사
		// 같은 객체를 가리킨다(접근)
		Person p2 = p1;
		System.out.println("p2에 저장된 주소 >> " + p2);
	}
}
