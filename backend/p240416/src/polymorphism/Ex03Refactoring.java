package polymorphism;

class FruitTwo {
	protected String name;
	protected int count;
	
	public FruitTwo(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public void show() {} // 이런 걸 추상화로 만든 것
}

class BananaTwo extends FruitTwo {
	public BananaTwo (String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다.";
	}
	
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
