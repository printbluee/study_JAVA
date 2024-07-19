package inner.anonymous;

interface Box {
	public void	boxing();
}

class Banana {
	// constrictor
	public Banana() {
		System.out.println("[Banana] 바나나는 멸종 위기이다.");
	}
	
	// instance method
	public void buy(Box box) {
		box.boxing();
	}
	
	public Box change() {
		// 인터페이스라 생성은 못하니까 자식을 리턴해야함 
		// return 자식클래스로 생성된 객체 주소;
		return new Box() {
			@Override
			public void boxing() {
				System.out.println("새 바나나 박스로 교체합니다.");
			}
		};
	}
}

public class Ex03 {

	public static void main(String[] args) {

		// 1. 객체 생성
		Banana banana = new Banana();
		
		// 2. [Anonymous class] 인수
		// Box 로 생성하는게 아니라 익명 클래스로 생성한 것
		banana.buy(new Box() {
			@Override
			public void boxing() {
				System.out.println("[Anonymous class] 바나나를 포장합니다.");
			}
		});
		
		banana.change().boxing();
		
		Box b = banana.change();
		b.boxing();
		
	}
}
