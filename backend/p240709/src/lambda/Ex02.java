package lambda;

// @FunctionalInterface 사용함으로써 람다식에 사용될 것이고,
// 추상 메서드는 1개만 오는 것을 알 수 있음
@FunctionalInterface
interface Box {
	public String boxing();
}

class Banana {
	public Banana() {
		System.out.println("\n[Banana constructor] 나는 바나나 !");
	}
	
	public void buy(Box box) {
		System.out.println(box.boxing());
	}
	
	// 익명 클래스
//	public Box change() {
//		return new Box() {
//			@Override
//			public String boxing() {
//				return "새 바나나 박스로 교환합니다 !";
//			}
//		};
//	}
	
	// 2-3. 람다식을 return 에 사용
	public Box change() {
		return () -> "[람다] 새 바나나 박스로 교환합니다 !";
	}
	
}

public class Ex02 {

	public static void main(String[] args) {

		// [익명 클래스] ============================================
		// 1. 객체 생성
		Banana bananaOne = new Banana();
		
		// 2-1. 익명 클래스를 참조변수에 저장
		Box boxOne = new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 바나나를 박스에 담아요 !";
			}
		};
		
		bananaOne.buy(boxOne);
		
		// 2-2. 익명 클래스를 인수에 바로 사용
		
		bananaOne.buy(new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 인수에 바로 사용";
			}
		});
		
		// [람다] ============================================
		// 1. 객체 생성
		Banana lambda = new Banana();
		
		// 2-1. 람다식을 참조변수에 저장
		Box lambdaBox = () -> "[람다] 바나나를 박스에 담아요!";
		lambda.buy(lambdaBox);
		
		// 2-2. 람다식을 인수에 바로 사용
		lambda.buy(() -> "[람다] 인수로 사용");
		
		System.out.println(lambda.change().boxing()); // 새 바나나 박스로 교환합니다 !
		
	}
}
