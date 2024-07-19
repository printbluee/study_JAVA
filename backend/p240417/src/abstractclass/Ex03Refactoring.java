package abstractclass;

// 과제 : 추상 클래스로 바꾸기
abstract class FruitTwo { 
	protected String name;
	protected int count;
	
	public FruitTwo(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	// 과제 : 추상 메소드로 바꾸기
	abstract public void show(); // 메서드 정의가 아니라 선언 왜냐 바디가 없기 때문
}

class BananaTwo extends FruitTwo {
	public BananaTwo (String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다.";
	}
	
	@Override
	public void show() {
		System.out.println("=================================");
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("개수는 " + super.count + "개 있습니다.");
		System.out.println("=================================");
	}
}

class AppleTwo extends FruitTwo {
	public AppleTwo (String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Apple] 나는 사과다.";
	}
	
	@Override
	public void show() {
		System.out.println(">> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">> 수량은 " + super.count + "개 입니다");
	}
}


public class Ex03Refactoring {

	public static void fruitInfo(FruitTwo fruit) { // 다형성
		System.out.println(fruit);
		fruit.show(); // 부모의 show()도 있어야함
	}
	
	public static void main(String[] args) {
		
		BananaTwo banana = new BananaTwo("레드 바나나", 10);
		fruitInfo(banana);
		
		AppleTwo apple = new AppleTwo("홍옥", 5);
		fruitInfo(apple);
		
	}
}
