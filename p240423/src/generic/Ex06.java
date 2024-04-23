package generic;

class Thing {
	private String id;
	private String name;
	
	public Thing() {} // 자식때문에 넣어줌
	
	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}	

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 TV !";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen !";
	}
}

// 제네릭 클래스
// T : 타입 파라미터
class Box <T> {
	private T item;
	
	public void store(T item) {
		System.out.println("[박스에 상품을 담는다.]");
		this.item = item;
	}
	
	public T out() {
		System.out.println("[박스에서 상품을 꺼내다.]");
		return item;
	}
}


public class Ex06 {

	// (Box<? extends Thing> box) 에서 Box는 제네릭 클래스
	public static void openBox(Box<? extends Thing> box) { // Thing 을 포함한 자식(Tv, Pen)
		Thing item = box.out(); // 다형성 구현이 되기 때문에 Thing 사용, 일부러 out() 호출하게끔 만들었음
		System.out.println(item);
	}
	
	public static void main(String[] args) {

		//Box<Tv> one = new Box(); // 추정하지만, 그래도 지정해주는 것이 좋음
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
		openBox(one);
		System.out.println();
		
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
		System.out.println();
		
		Box<Apple> apple = new Box<Apple>();
		apple.store(new Apple());
		//openBox(apple);  error ! 타입이 Apple 인데, Box 외 타입 올 수 없음
	}
}