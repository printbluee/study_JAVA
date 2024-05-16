
public class HbQuiz515 {

	// main() 메소드에서 호출하기 위해 static 으로 정의
	public static void circleRound(double radius) { // 원의 둘레
		double round = radius * 2 * 3.14;
		System.out.println("원의 둘레(2.4) : " + round);
	}
	
	public static void circleArea(double radius) { // 원의 넓이
		double area = radius * radius * 3.14;
		System.out.println("원의 넓이(2.4) : " + area);
	}
	
	public static void main(String[] args) {
		
		double radius = 2.4; // 반지름
		circleRound(radius);
		circleArea(radius);
	}
}
