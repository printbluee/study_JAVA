package generic;

interface Available {

	void selfIntroduction();
}

class Tree {

	private String sort;
	private int age;

	public Tree(String sort, int age) {
		this.sort = sort;
		this.age = age;
	}

	public void info() {
		System.out.printf("[INFO] 종류 : %s, 나이 : %d\n\n", sort, age);
	}
}

class Maple extends Tree implements Available {

	public Maple(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 단풍나무이다.");
	}
}

class Pine extends Tree implements Available {

	public Pine(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무이다.");
	}
}

public class Ex05 {

	// [자료형에 안전하지 않은 코드] : 모든 타입 받아놓고, 형변환을 하니까
	// (type) type 들어가는 것도 연산자
	// : 강제 형변환으로 Available 설정됨에 따라,
	// 실행할 때 Error 발생 가능성 있음
	// : 제네릭 장점이 없어짐
//	public static <T> void callSelfIntroduction(T t) {
//		
//		((Available) t).selfIntroduction();
//	}

//	public static <T> void callInfo(T t) {
//		((Tree) t).info();
//	}

	// [자료형에 안전한 코드]
	// : 제네릭 파라미더 type 제한에 사용된 extends
	// : class 와 interface 를 구준하지 않고, 키워드 extends 사용
	// extends : 상속의 의미보다는 Available 를 포함한 Available 의 자식들을 받을 수 있음
	// 제네릭 파리미터 타입의 제한(한정)된다고 말함
	// 그럼 이제 인수를 받을 때 걸러서 받고, 강제 형변환 할 필요 x
	public static <T extends Available> void callSelfIntroduction(T t) {
		t.selfIntroduction();
	}

	public static <T extends Tree> void callInfo(T t) {
		t.info();
	}
	
	public static void main(String[] args) {

		Maple maple = new Maple("당단풍나무", 25);
		Pine pine = new Pine("금강고로쇠", 33);

		callSelfIntroduction(maple);
		callInfo(maple);

		callSelfIntroduction(pine);
		callInfo(pine);

		// callSelfIntroduction("홍길동"); // 컴파일 error : 타입이 String 이기 때문에 Available 의 자식이 x
	}
}
