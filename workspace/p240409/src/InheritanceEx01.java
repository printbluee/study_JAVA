
class Parent {
	
	// [ field ] instance field 
	int money = 1_000_000; // 1,000,000 대신 1_000_000
	
	// [ constructor ]
	Parent () {
		System.out.println("[ Parent ] 생성자 실행"); // 확인용
	}
	
	// [ method ]
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "원 입니다.");
	}
}

class Child extends Parent {
	
	// constructor
	// 기본 생성자
	Child () {
		// 부모의 생성자 호출();
		super(); // 위에 있어야 되는 이유 : 생성자 호출은 반드시 생성자의 첫번째 라인에 있어야함
		System.out.println("[ Child ] 생성자 실행"); // 확인용
	}
	
	// [ method overriding ] 메소드 오버라이딩
	// : 메소드 재정의
	// : <상속 관계>에서 자식 class 가 부모 class 에 멤버 메소드를 재정의 한 것
	// : 부모 class 의 멤버 메소드의 선언부 그대로, 바디(기능)만 수정
	// : 선언부 그대로 - 반환명, 메소드명, 매개변수 정보가 같아야 함
	// 부모의 메소드를 안 쓰겠다는 거임, 기능이 마음에 들지 않을 때 재정의해서 쓰면 됨
	void buy(int money) {
		System.out.println("부모님 용돈 " + this.money + "원 주세요");
	}
	
	// [ method overloading ] 메소드 오버로딩
	// : 같은 이름의 메소드 여러 정의
	// : 단, 매개변수의 정보가 달라야 함
	// : 	 ---------------
	// :     자료형, 개수
	// : 반환형과는 관련 없음
	void buy() {
		System.out.println("용돈조 !! 용돈 !!!");
	}
	
}


public class InheritanceEx01 {

	public static void main(String[] args) {
		// child 의 기본 생성자 실행 요청 -> child 에 super 가 있음
		//  -> 부모 class 에 매개 변수가 없는 기본 생성자 실행 요청 -> 실행 완료 -> 자식의 생성자 실행 완료
		Child c1 = new Child(); 
		
		// child 에 일단 먼저 간 다음 buy 가 있으면 바로 실행이 되지만, 없으면 부모로 가서 실행
		// child 에 갔는데 부모도 자식도 같은 메소드 있다면(기능이 달라도), 자식 메소드를 사용
		c1.buy(10_0000);
		c1.buy();
	}
}
