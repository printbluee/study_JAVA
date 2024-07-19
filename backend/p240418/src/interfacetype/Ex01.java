package interfacetype;

interface A {} 			    // 연습용이라 땡겨 쓴 것, type 은 interface 이지만, 컴파일러는 class 
interface B {}
interface C extends A {}
interface D extends A, B {} // 다중 상속 허용 o

class E {}
class F {}
class G extends E {}
// class H extends E, F {} 	// error ! 다중 상속 허용 x
// class I extend A {} 		// error ! extend 사용하려면 타입이 같아야 함
class J implements A {}

class K extends E implements A, B {} // class K 를 정의하면서

// class L implements A extends E {} // error ! class 를 정의하면서 상속을 받을 땐,
									 // 같은 타입이 먼저 와야 함 (순서가 있음)

// interface M implements E {} 		 // error ! interface 는 interface 를 부모로 둘 수 없음


public class Ex01 {

	public static void main(String[] args) {

	}
}
