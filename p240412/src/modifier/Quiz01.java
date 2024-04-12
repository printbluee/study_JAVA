package modifier;

class Fruit {
	private int count;
	
	public void showCount() {
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메소드입니다.");
	}
}

class Banana extends Fruit {
	// [ 문제 2 ] 생성자를 이용하여 부모 class Fruit 의 count field 에 값 설정
	
	// [ 문제 1 ] showInfo() 메서드를 오버라이딩(overriding) 하시오.
	Banana () {
		System.out.println("현재 과일은 바나나입니다.");
	}
	
	public void showInfo(int count) {
		System.out.println("바나나는 " + count + "개 있습니다.");
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		
		// [ 문제 1 ]
		Banana bananaOne = new Banana();
		bananaOne.showInfo(0);
		// 현재 과일은 바나나입니다.
		// 바나나는 0개 있습니다.
		
		// [ 문제 2 ]
		Banana bananaTwo = new Banana();
		bananaTwo.showInfo(10);
		// 현재 과일은 바나나입니다.
		// 바나나는 10개 있습니다.
		
	}
}
