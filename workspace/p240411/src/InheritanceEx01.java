
class GrandParent {
	//
}

class Parent {
	
	// field
	int money;
	
	// Constructor
	public Parent() {
		this.money = 1_000_000;
		System.out.println("[Parent] 매개변수가 없는 생성자 실행됨");
	}
	
	public Parent(int money) {
		this.money = money;
		System.out.println("[Parent] 매개변수가 1개인 생성자 실행됨");
	}
	
	// method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "원 입니다.");
	}
}

class Child extends Parent {
	
	public Child() {
		super(); // heap 영역에 할당, 부모의 생성자 중 매개 변수가 없는 생성자를 찾아감
		System.out.println("[Child] 매개변수가 없는 생성자 실행됨");
	}
	
	public Child (int money) {
		 super(money); // 부모 생성자 호출
//		super.money = money;
		System.out.println("[Child] 매개변수가 1개인 생성자 실행됨");
	}
	
	void showMoney() {
		System.out.println("부모님 돈 : " + super.money);
	}
	// super 를 빼도 되는 이유 : 지역변수를 찾아감, 호출한 메소드의 지역변수를 찾고, 없으면 부모의 메소드에서 찾음
	// Child() 에 money 선언 + super 뺌 => super 호출 x
	// super 를 씀으로써 부모의 멤버변수라는 것을 바로 알 수 있음
}

public class InheritanceEx01 {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.showMoney();
		
		Child c2 = new Child(500_000); // 부모의 매개변수가 없는 생성자 호출 -> 자식의 매개변수 1개인 생성자 호출
		c2.showMoney();
		
	}

}
