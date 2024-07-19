package generic;

class Apple {
	@Override
	public String toString() {
		return "사과는 맛있다";
	}
}

class Banana {
	@Override
	public String toString() {
		return "바나나는 멸종위기이다";
	}
}

class InstanceType {
	
	private int count;
	
	public void showCount() {
		System.out.println("개수 >> " + this.count);
	}
	
	// 1. [parameter type : Apple] 
	// : Banana type 을 받지 못함
//	public void showInstanceType(Apple apple) {
//		System.out.println("msg : " + apple);
//		count++;
//	}
	
	// 2. [parameter type : Object]
//	public void showInstanceType(Object obj) {
//		System.out.println("msg : " + obj);
//		count++;
//	}
	
	// 3. [parameter type : generic]
	// 제네릭 메소드
	public <T> void showInstanceType(T t) {
		System.out.println("msg : " + t);
		count++;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		InstanceType in = new InstanceType();
		in.showInstanceType(apple);
		in.showCount();
		
		// 1. 타입이 Apple 이라 다른 타입의 매개변수를 받지 못함
		// 2. 잘 받음
//		in.showInstanceType(banana); 
//		in.showCount();
//		 
//		in.showInstanceType("안녕");
//		in.showCount();
		
		// 3. 제네릭 메소드
		in.<Banana>showInstanceType(banana); 
		in.showCount();
		 
		in.<String>showInstanceType("안녕");
		in.showCount();
		
	}
}
