package generic;

class Thing {
	// 경고 뜨는 거 맞음
	private String id;
	private String name; 
	
	public Thing() {}
	
	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 Tv";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 pen이다 !";
	}
}

class Box <T> {
	// 박스 안에는 뭐든지 담을 수 있음
	private T item;
	
	public void store(T item) {
		System.out.println("[박스에 상품을 담는다.]");
		this.item = item;
	}
	
	public T out() {
		System.out.println("[박스에 상품을 꺼낸다.]");
		return item;
	}
}

public class Ex07 {
	
	public static void openBox(Box<? extends Thing> box) {
		Thing thing = box.out();		
		System.out.println(thing);
	}
	
	public static void main(String[] args) {
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
		
		// openBox(one); error ! : openBox(Box<Pen> box) -> openBox(Box<? extends Thing> box)
		openBox(one); // openBox(Box<? extends Thing> box)
		
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
		
		// Banana 는 Thing 의 자식이 x
		// 와일드 카드였으면 Banana 받아줌
//		Box<Banana> three = new Box<Banana>();
//		three.store(new Banana());
//		openBox(three);
		
	}
}
