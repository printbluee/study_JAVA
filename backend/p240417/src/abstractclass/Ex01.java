package abstractclass;

/*
 * [ 추상 클래스 ] abstract class
 * - 추상 클래스 내 abstract method 가 있을 수도 있고, 없을 수도 있음
 * - 추상 클래스는 인스턴스 생성 불가능 (미완성된 메소드가 있어서 heap 영역에 할당x)
 * - 다형성 또는 상속 사용
 * 
 * [ 추상 메소드 ] abstract method
 * - body 가 없는 메소드 --> 미완성 메소드
 * - body 가 없기 때문에 <메소드 정의> 가 아니라 <메소드 선언>
 * - 반드시 abstract class 내 존내
 * - abstract method 가 있는 abstract class 를 상속 받은 자식 클래스는
 *   반드시 abstract method overriding 해야 함 --> 강제성 ***
 * - 오버라이딩된 자식의 메소드는 부모의 추상 메소드 접근 제어자보다 같거나 커야 함
 *   접근 제어자 ex) public default private ... 
 * 
 */

abstract class Parent { // 다형성 용도로 쓴 것
	// field
	private int num;			// instance field
	private static int var;		// static field
	
	// abstract method (추상 클래스) : 미완성된 메소드
	// 문법 : abstract 클래스명 + abstract 반환형 메소드명(매개변수); => {} 안씀
	// public abstract void methodOne();  error ! default < public , 자식에서 오버라이딩 된 메소드는 부모보다 같거나 커야함
	public abstract void methodOne();
	
	// abstract method : static 불가능
	// abstract static void methodTwo(); // 추상메소드는 static, 즉 미완성이라 미리 할당할 수 없음
	
	// method : instance method
	public void methodThree() {
		System.out.println("[Parent] methodThree() 실행 !");
	}
	
	// method : static method
	public static void methodFour() {
		System.out.println("[Parent] methodFour() 실행 !");
	}
}

class Child extends Parent { // 추상 클래스에 추상 메소드가 있는데 구현하지 않아서 
	
	@Override	// 오버라이딩 : 완성된 메소드
	public void methodOne() {
		System.out.println("[Child] 오버라이딩된 추상 메서드");
	}
	
	public void print() {
		System.out.println("[Child] print() 실행 !!");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		// 1. 추상 클래스로 인스턴스 생성 불가능
		//Parent p = new Parent(); // error ! Cannot instantiate the type Parent

		// 2. 자식 클래스로 인스턴스 생성 가능
		Child c = new Child();
		c.methodOne();
		c.methodThree();		// instance method
		// c.methodFour();		// static method, static method 는 이렇게 호출 x
		Parent.methodFour();
		c.print();				
		
		// 3. 다형성
		Parent p = new Child();
		p.methodThree();	// 부모꺼 씀
		p.methodOne();		// 자식꺼 씀
		// p.print();		// error ! The method print() is undefined for the type Parent
	}
}
