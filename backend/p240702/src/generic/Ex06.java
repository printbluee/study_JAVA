package generic;

// 1. 제네릭 인터페이스
interface InterfaceName <T> {}

// 2. 제네릭 클래스
class ClassOne <T> {}

// 클래스 상속
class ClassSuper {}
class ClassSub extends ClassSuper {}


public class Ex06 {

	// 3. 제네릭 메소드
	public static <T> void show(T t) {
		System.out.println(t);
	}
	
	// [extends 와 super] ===========================
	// [타입 중점]
	// <T extends 타입> : 가능
	// <T super 타입>   : 불가능
	public <T extends ClassSuper> void one(T t) {}
	// public <T super ClassSub> void two(T t) {} error !
	
	//[기능(동작) 중점]
	// ? : 와일드 카드 (wildcard)
	// <? extends 타입> : 가능
	// <? super 타입>   : 가능
	public void three(ClassOne <String> name) {} // ClassOne : 타입, name : 매개변수 
	public void four(ClassOne <? extends ClassSuper> name) {} // ClassOne : 타입, name : 매개변수 
	public void five(ClassOne <? super ClassSuper> name) {} // ClassOne : 타입, name : 매개변수 
	
	
	// 제네릭 타입(타입 파라미터)을 타입 제한(한정) =========
	public <T extends ClassOne<?>> void six(T t) {}
	
	
	public static void main(String[] args) {
		
	}
}
