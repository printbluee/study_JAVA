package generic;

interface Available {
	// 추상 클래스
	void selfIntroduction();
}

class Tree {
	private String sort;
	private int age;
	
	public Tree() {}
	
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
		System.out.println("나는 단충이다 !");
	}
}

class Pine extends Tree implements Available {

	public Pine(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무이다 !");
	}
}

public class Ex04 {
	
	// ==================================================================================	
	// [자료형에 안전하지 않은 코드]
//	public static <T> void callSelfIntroduction(T t) { // main 메소드에서 호출하기 위해 static
//		((Available)t).selfIntroduction();
//	}
//	
//	public static <T> void callInfo(T t) {
//		((Tree)t).info();
//	}
	
	// [자료형에 안전한 코드] 타입 제한 두기
	// : class 와 interface 를 구분하지 않고, 키워드 extends 사용
	// 내 생각 : 컴파일 할 때 결정이 되기 때문에 상속 개념이 없는듯
	// T 에는 Available 포함한 Available 의 자식이 와야함
	// T 는 Available 포함한 Available 의 자식이 와야한다고 제한을 두는 거지, 상속 개념 x
	public static <T extends Available> void callSelfIntroduction(T t) { // Available interfave
		((Available)t).selfIntroduction();
	}
	
	public static <T extends Tree> void callInfo(T t) { // Tree class
		((Tree)t).info();
	}
	// ==================================================================================	
	
	public static void main(String[] args) {
		
		Maple maple = new Maple("당단풍나무", 25);
		Pine pine = new Pine("금강고로쇠", 33);
		
		callSelfIntroduction(maple);
		callInfo(maple);
		
		callSelfIntroduction(pine);
		callInfo(pine);
		
		// 런타임(실행) error ! 받은 건 String 인데, ((Available)t) 형변환 되지 않음
		// 이러한 경우를 [자료형에 안전하지 않은 코드] 라 불림
		// 빨간줄 안뜸
		//String name = "홍길동";
		//callSelfIntroduction(name);
		
		// 컴파일 error ! 
		// 코드에 타입 제한을 뒀으니 이제 빨간줄
		//String name = "홍길동";
		//callSelfIntroduction(name);
		//callInfo(name);
	}
}
