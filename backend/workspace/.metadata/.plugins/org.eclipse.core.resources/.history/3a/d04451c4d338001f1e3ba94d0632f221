package generic;

class Parent <T> {
	
	private T item;
	
	public Parent() {}
	
	public Parent(T item) {
		this.item = item;
	}
}


// 자식도 제네릭 타입으로 받기
class Child<T> extends Parent<T> {
	
	// 제네릭 메소드 x
	public void showType(T t) {
		System.out.println("Type >> " + t);
	}
}

public class Ex08 {
	
	public static void main(String[] args) {
		
		// Child 에만 String 타입이 들어오는게 아니라, Parent 에도 String 타입이 들어옴
		// 자식을 가지고 제네릭 클래스를 사용할 때
		// 자식에서 제네릭 파라미터를 지정해주면 부모도 같이 타입이 지정이 됨
		Child<String> c = new Child<String>();
		c.showType("홍길동");
		
	}
}
