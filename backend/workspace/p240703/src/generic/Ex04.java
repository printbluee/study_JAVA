package generic;

class Cool<T> {
	private T count;
	
	// T[] array = new T[10];
	// error ! : Cannot create a generic array of T
	// [과제] 
	// : 배열의 타입은 파일이 실행되면서 실체화가 되는데, 
	//   제네릭 타입은 이미 컴파일 시점에서 타입을 확인 후 런타임에는 소거가 된다 !
	//   런타탐에 소거된다는 것은 컴파일에서 타입에 대해 정의를 하고 런타임, 실행이 되면서
	//   타입에 대해 알 수 없다는 뜻 !
	//   따라서 제네릭 배열은 타입 안정성을 보장할 수 없기 떄문에 직접 생성이 불가능하다 !
	
	public Cool() {}
	
	public Cool(T count) {
		this.count = count;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		Cool<String> one = new Cool<String>();
		
		// Cool<Object> two = new Cool<String>(); error ! : Type mismatch: cannot convert from Cool<String> to Cool<Object>
		
		// 다형성
		Thing t = new Tv();
	}
}
