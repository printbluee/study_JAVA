
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
 * << Casting >>
 * 					super 
 * down casting				  upcating
 * 명시적 형변환	↑  ↓	묵시적 형변환
 *    (강제)				   (자동)
 * 					sub
 * 
 * =======================================================
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
	
	// 방법 1
	public void status() {}
	
	// 방법 2
	public void play() {}
	public void study() {}
}

class Son extends Parent {
	public void status() {
		System.out.println("[Son] 신나게 놀고 있어요 ~!");
	}
	
	@Override
	public void spend(int money) {
		System.out.println("[Son] 용돈 " +  money + "원 주세요 ~~~");
	}
}

class Daughter extends Parent {
	public void status() {
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
		// Parent[] p3 = 객체배열생성; // 생성과 동시에 초기화
		System.out.println("\n다형성 : 객체 배열 >>");
//		Parent[] p3 = {new Son(), new Daughter()}; // 공부하는 단계니까 아래꺼 쓰기
		Parent[] p3 = new Parent[] {new Son(), new Daughter()};
		
		// 참조 변수 p3 로 spend() 실행
		p3[0].spend(500);
		p3[1].spend(1000);
		
		// 향상된 for 문
		for (Parent perent: p3) { // 참조변수 perent 주소에 차례대로 p3[0], p3[1] 가 바뀜
			perent.spend(5);
		}
		
		// 강제 형변환
//		Son s1 = new Parent(); // error ! Type mismatch
//		Son s2 = (Son)new Parent(); 
//		s2.spend(1); // 실행 error ! 강제 형변환이 안됨, 다형성 x, 상속관계에서만 가능
//		s2.paly();   // 실행 error ! 
		
		System.out.println("\n<< 형변환 >>");
		Son s3 = (Son)p1; // downcasting(강제) : 부모 타입 -> 자식 타입
		s3.play();
		s3.spend(150);
		s3.work();
		System.out.println();
		
		Parent p4 = s3; // upcasting(자동) : 자식 타입 -> 부모타입
		p4.spend(250);
		p4.work();
		
		// 형변환 가능 여부
		// [문법] : 참조변수 or 객체 instanceof 타입
		System.out.println("\n<< 형변환 가능 여부 >>");
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Son);
		System.out.println(p instanceof Daughter);
		System.out.println(p instanceof Object);
		System.out.println();
		
		System.out.println(s instanceof Parent);
		System.out.println(s instanceof Son);
		// System.out.println(s instanceof Daughter); // error ! 형제 사이라 관련이 없음
		System.out.println(s instanceof Object);
		
		// [ 과제 ] ================================
		// 다형성으로 구현된 객체배열의 메소드 호출하시오.
		// : Son 객체는 play() 메소드를 
		// : Daughter 객체는 study() 메소드를 호출하시오.
		
		System.out.println("방법1");
		for (Parent perent: p3) {
			perent.status();
		}
		
//		System.out.println("방법2");
//		for (Parent perent: p3) {
//			if (perent instanceof Son) {
//				perent.play();
//			} else if (perent instanceof Daughter) {
//				perent.study();
//			}
//		}
		
		
	}
}
