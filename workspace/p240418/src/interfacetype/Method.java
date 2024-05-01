package interfacetype;

public interface Method {

	// abstract method
	// public abstract void one();
	void one(); // 기본적으로 접근 제어자 public abstract 가 됨, 좋은 형태는 아님
	public abstract void two();
	
	// void defaultMethod() {} // error ! 바디가 없어야 함
	// 오버라이딩 강제성 없음
	// default method : Java 8 버전 부터 지원되는 형태가 있음
	public default void defaultMethod() { // public 생략됨, 써라, 기본이 public
		System.out.println("[method interface] default method 실행");
	}
	
	// static method : Java 8 버전 부터 지원되는 형태가 있음
	static void staticMethod() { // public 생략됨
		System.out.println("[method interface] static method 실행");
	}
}
