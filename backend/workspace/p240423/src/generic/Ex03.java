package generic;

class Apple {
	@Override
	public String toString() {
		return "사과는 맛있당.";
	}
}

class Banana {
	@Override
	public String toString() {
		return "바나나는 멸종 위기이다.";
	}
}

class InstanceType {
	private int count; // 인스턴스 생성되면서 0으로 저장
	
	// ====================================================
	// 1. [parameter type : Apple]
//	public void showInstanceType(Apple apple) { 애플은 받을 수 있지만, 바나나는 못받음
//		System.out.println("type >> " + apple);
//		count++;
//	}
	
	// 2. [parameter type : Object] 애플과 바나나는 받을 수 있지만 형변환을 해주는 상황들이 생김
//	public void showInstanceType(Object object) { // 다형성
//		System.out.println("type >> " + object);
//		count++;
//	}
	
	// 3. [parameter type : generic type]
	public <T> void showInstanceType(T type) { 
		System.out.println("type >> " + type);
		count++;
	}
	
	// ====================================================
	public void showCount() {
		System.out.println("count >> " + count);
	}
	
}

public class Ex03 {

	public static void main(String[] args) {

		Apple apple = new Apple();
		Banana banana = new Banana();
		
		InstanceType in = new InstanceType();
//		in.showInstanceType(apple); 
		in.<Apple>showInstanceType(apple);
		in.showCount();
		
//		in.showInstanceType(banana);
		in.<Banana>showInstanceType(banana);
		in.showCount();
	}
}
