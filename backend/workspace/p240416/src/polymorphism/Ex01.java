package polymorphism;

class Thing {
	@Override
	public String toString() {
		return "[Thing] 나는 사물이다.";
	}
}

class Person {
	@Override
	public String toString() {
		return "[Person] 저는 사람입니다.";
	}
}


public class Ex01 {

	public static void printInfo(Object obj) { // 다형성 구현됨 : 부모에서 자식을 찾아감, 오버라이딩된 메서드
		System.out.println("=============================");
		System.out.println(obj);
		System.out.println("=============================");
	}
	
	public static void main(String[] args) {
		
		Thing thing = new Thing();
		Person person = new Person();
		
		printInfo(thing);
		printInfo(person);
		
		System.out.println(thing);
		System.out.println(person);
	}

}
