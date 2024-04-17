package modifier;

class Fruit {
	private int count;
	
	public Fruit() {} // 자식때문에 넣어준 것
	
	public Fruit(int count) {
		this.count = count;
	}
	
	public void showCount() {
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}
	
	public void setCount(int count) { // 값 설정
		this.count = count;
	}
	
    public int getCount() {			 // 출력
        return this.count;
    }
	
	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메소드입니다.");
	}
}

class Banana extends Fruit {
	// [ 문제 2 ] 생성자를 이용하여 부모 class Fruit 의 count field 에 값 설정
	public Banana () {} // 부모의 기본 생성자가 없어서 둘다 정의 
		
	public Banana (int count) {
		super(count); 	// 부모의 멤버변수 접근
	}
	
	// [ 문제 1 ] showInfo() 메서드를 오버라이딩(overriding) 하시오.
	@Override // 어노테이션을 쓰는 가장 큰 이유 : 개발자에게 정보를 알려주는 의미가 큼
	public void showInfo() {
        System.out.println("현재 과일은 바나나입니다.");
        System.out.println("바나나는 " + super.getCount() + "개 있습니다.\n"); // this 보다는 super 를 사용하는게 개발자가 보기 이해가 편함
    }
}


public class Quiz01 {
	public static void main(String[] args) {
		
		// [ 문제 1 ]
		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		// 현재 과일은 바나나입니다.
		// 바나나는 0개 있습니다.
		
		// [ 문제 2 ]
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
		// 현재 과일은 바나나입니다.
		// 바나나는 10개 있습니다.
	}
}