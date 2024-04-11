
class ParentTwo {
	
	int money = 1_000_000;
	
	void buy (int moneny) {
		this.money -= moneny;
		System.out.println("남은 돈은 " + this.money + "원입니다.");
	}
}

class ChildTwo extends ParentTwo{
	
	void study() {
		System.out.println("저는 공부하고 있습니다.");
	}
	
	// 오버로딩은 상속을 받지 않아도 오버로딩이 되어서 가능
	void buy() { // 부모의 buy (int moneny) 과도 자식의 buy(int money) 도 오버로딩
		System.out.println("<< method overloading >>");
		System.out.println("용돈 조 ! 용돈조 !!!");
	}
	
	void buy(int money) {
		System.out.println("<< method overriding >>");
		System.out.println("부모님 용돈 " + money + "원 주세요 !");
	}
}

public class InheritanceEx03 {

	public static void main(String[] args) {

		ChildTwo c1 = new ChildTwo();
		c1.study();
		c1.buy(100_000); // 실행 순서 : 자식 메소드 -> 부모 메소드
		c1.buy();
	}
}
