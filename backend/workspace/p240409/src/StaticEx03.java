
class Animal {
	
	// [ field ] static final field
	// final field : 초기화한 값으로 값 고정 --> 값 변경 금지
	static final int COUNT = 5;
	
}

public class StaticEx03 {

	public static void main(String[] args) {

		// static int num; // stack 영역에 저장되는 지역변수가 static 영역에 못만듦
		
		
		System.out.println("동물 몇 마리 : " + Animal.COUNT);
		// Animal.COUNT = 10;	// error ! : final field
		
	}
}
