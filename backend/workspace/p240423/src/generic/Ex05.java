package generic;

/*
 * 1. 제네릭 타입은 해당 {} 내에서만 유효
 * : 제네릭 타입 선언 형태
 * : 1-1. 인터페이스
 * : 1-2. 클래스
 * : 1-3. 메소드
 * 
 */

// 1-1. [제네릭 인터페이스]
interface InterfaceName <T> {}

// 1-2. [제네릭 클래스]
class ClassOne <T> {}

// => 제네릭 인터페이스 T 와 제네릭 클래스의 T 는 다름

// 2. 제네릭 타입은 2개 이상 가능
class ClassTwo <K, V> {}

// 클래스 상속
class ClassSuper {}
class ClassSub extends ClassSuper {}


public class Ex05 {
	// 1-3. [제네릭 메소드]
	public static <T> void show(T t) {
		System.out.println(t);
	}
	// =====================================================================
	// [extends 와 super] 타입 제한두기 (상속 개념 아님)
	// [타입 중심]
	// <T extends 타입> :   가능
	// <T super 타입>   : 불가능
	// 부가 설명
	// : T 에는 타입에 들어가는 클래스와 해당 클래스 부모만이 올 수 있는데,
	// 	 최대 Object 클래스가 올 수 있음
	// : T 에는 항상 최상위 클래스가 지정되므로 super 를 사용하여 타입을 제한 것이
	//   의미가 없게 됨 -> 따라서 JAVA 는 super 타입을 지정하는 것을 허용하지 x
	public <T extends ClassSuper> void one(T t) {}
	
	// error ! Syntax error on token "super", expected / 문법 불가능 !
	// 제네릭 메소드는 super 를 못쓰지만 제네릭 클래스는 super 사용 가능
	//public <T super ClassSuper> void two(T t) {}  
	// =====================================================================
	// [기능(동작) 중점] 타입보다는 기능(동작) 그 자체에 초점을 둔 메소드
	// 제네릭 인터페이스 또는 제네릭 클래스를 파라미터의 타입으로 사용
	// ?           : 와일드 카드(wildcard)
	// ClassOne<?> : 비한정적 와일드 카드 타입(Unbounded wuldcard type)
	// ? : 모든지 와도 돼용 ~ 
	// <? extends 타입> : 가능
	// <? super 타입>   : 가능
	// 제네릭 메서드 아님
	
	// ex) ClassOne 클래스가 왔으니 제네릭 클래스
	// three(ClassOne<T> name) error ! 
	public void three(ClassOne<?> name) {}
	
	// ClassOne 제네릭 클래스는 ClassSuper 를 포함한 자식도 올 수 있음
	// 자기를 포함한 이하
	public void four(ClassOne<? extends ClassSuper> name) {}
	
	// 자기를 포함한 이상
	public void five(ClassOne<? super ClassSub> name) {}
	// =====================================================================
	// 제네릭 타입(타입 파라미터)을 타입 제한(한정)
	// 제네릭 클래스가 온다면 
	public <T extends ClassOne<?>> void six(T t) {}
	// =====================================================================
	
	public static void main(String[] args) {
		
	}
}
