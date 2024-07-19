package interfacetype;

class Sub implements Method{
	
	@Override
	public void one() { // default -> public 로 넓혀줘야 함
		System.out.println("[Sub] 오버라이딩된 메소드 one() 실행");
	}
	
	@Override
	public void two() { // 추상 메소드를 구현할 건데 또 추상 쓰지 않음
		System.out.println("[Sub] 오버라이딩된 메소드 two() 실행");
	}
}

public class Ex03 {

	public static void main(String[] args) {

		// 1. insterface 인스턴스 생성 불가능
		// Method m = new Method(); // 완벽하지 않은 추상 메소드라서 
		
		// 2. 다형성
		Method m = new Sub();
		m.one();
		m.two();
		m.defaultMethod();
		// m.staticMethod(); // error ! 
		Method.staticMethod();
		
	}
}
