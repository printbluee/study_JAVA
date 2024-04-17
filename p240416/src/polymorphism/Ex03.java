package polymorphism;

class Fruit {
	protected String name;
	protected int count;
	
	public Fruit() {}
	
	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public void nameAndCount() {}
	public void showInfo() {}
}

class Banana extends Fruit {
	
	public Banana(String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Banana] 바나나는 멸종 위기이다.";
	}
	
	public void nameAndCount() {
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("개수는 " + super.count + "개 있습니다.");
	}
}

class Apple extends Fruit {
	
	public Apple (String name, int count) {
		super(name, count);
	}
	
	@Override
	public String toString() {
		return "[Apple] 나는 사과다.";
	}
	
	public void showInfo() {
		System.out.println(">> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">> 수량은 " + super.count + "개 입니다.");
	}
}


public class Ex03 {

	public static void fruitInfo(Fruit fruit) { // 다형성
		System.out.println(fruit);
		
		// [과제]
		// fruit 이 banana 객체의 주소를 저장하면, nameAndCount() 호출하고,
		// fruit 이 apple 객체의 주소를 저장하면, showInfo() 호출
		System.out.println("==> [fruitInfo] 메소드 실행");
		if (fruit instanceof Banana) {
			fruit.nameAndCount();
		} else if (fruit instanceof Apple) {
			fruit.showInfo();
		}
		System.out.println("[fruitInfo] 메소드 실행 끝 ==> \n\n");
	}
	
	
	public static void main(String[] args) {
		
		Banana banana = new Banana("레드 바나나", 10);
		fruitInfo(banana);
		
		Apple apple = new Apple("홍옥", 5);
		fruitInfo(apple);
		
	}
}
