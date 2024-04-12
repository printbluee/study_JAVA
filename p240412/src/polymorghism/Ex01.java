
/*
 * [ 다형성 ] polymorghism ===============================
 * 부모 type 의 참조변수로 자식 type 의 객체를 가리킴(접근)
 * 부모의 멤버만 접근 가능
 * 단, 오버라이딩 된 자시의 멤버 메소드는 접근 가능
 * 
 * 타입이 달라서 다형성이 아니라 상속을 해서 부모 자식이라서 다형성 (관계가 있음)
 * 
 * << 문법 >>
 * 부모의 class 참조변수 = new 자식 class();
 * 
 * =======================================================
 * 
 */


package polymorghism;

class Parent {
	private int money = 1000000;
	
	public void spend(int money) {
		this.money -= money;
		System.out.println("[Perent] 남은 돈은 " + this.money + "입니다");
	}
	
	public void work() {
		System.out.println("[Perent] 열심히 일하는 중입니다.");
	}
}

class Son extends Parent {
	public void paly() {
		System.out.println("[Son] 신나게 놀고 있어요 ~!");
	}
	
	@Override
	public void spend(int money) {
		System.out.println("[Son] 용돈 " +  money + "원 주세요 ~~~");
	}
}

class Daughter extends Parent {
	public void study() {
		System.out.println("[Daughter] 학원 공부하고 있어요 ~~~");
	}
	
	@Override
	public void spend(int money) {
		System.out.println("[Daughter] 학원비 " +  money + "원 주세요 ~~~");
	}
}


public class Ex01 {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.spend(100000);
		
		Son s = new Son();
		s.spend(200000);
		
		Daughter d = new Daughter();
		d.spend(300000);
		
		System.out.println("\n<< 다형성 >> ");
		Parent p1 = new Son(); // 문법 형태 : 부모의 class 참조변수 = new 자식 class();
		
		p1.work();
		// p1.play();  // 아들의 play 메소드는 없음, 자기것만 보고 아들 것은 못봄
		p1.spend(100); // 자식의 멤버 중에 유일하게 쓸 수 있는 건 오버라이딩, 그래서 아들 class 가 호출됨
		
		Parent p2 = new Daughter();
		p2.work();
		p2.spend(200);
		
		// [ 과제 2 ] 배열로 나타내기
		System.out.println("\n다형성 : 객체 배열 >>");
//		 Parent[] p3 = 객체배열생성; // 생성과 동시에 초기화
		 Parent[] p3 = {p1, p2}; // 생성과 동시에 초기화
		 
		// 참조 변수 p3 로 spend() 실행
		 p3[0].spend(500);
		 p3[1].spend(1000);
		
	}
}
