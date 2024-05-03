package interfacetype;

/*
 * [ interface ] type, 자료형
 * : abstract class 보다 엄격해진 자료형(왜 엄격하냐면 정해져있음)
 * : abstract class 의 업그레이드 된 자료형
 * : 인스턴스 생성 불가능 -> 상속 or 다형성 사용
 * : 다중 상속 허용
 * : 생성자 만들 수 없음(인스턴스가 만들어지지 않음)
 * : 추상 메서드를 가지고 있음
 * 
 * [ field ] 
 * : public static final ==> constant(상수) ==> 대문자, 상수화된 필드
 * 
 * [ method ]
 * : public abstract ==> 추상 메소드
 * 
 * 
 */


interface Field {
	// public static final
	// int num1 = 100; 처럼 적지 않아도 public static final 가 됨
	int num1 = 100; // interface field 는 쓰레기값 x, 기본적으로 static 으로 됨
	static int num2 = 200;
	final int num3 = 300;
	public static final int num4 = 400; // 접근 제어자 public, sta
	
}

public class Ex02 {

	public static void main(String[] args) {

		// 인스턴스 생성
		// interface f = new Field(); // error ! 추상 클래스, interface 인스턴스 생성 용도가 아님(할 수 x)
		
		System.out.println(Field.num1);
		System.out.println(Field.num2);
		System.out.println(Field.num3);
		System.out.println(Field.num4);
		
		// Field.num1 = 5; // error ! fianl field 
	}
}
