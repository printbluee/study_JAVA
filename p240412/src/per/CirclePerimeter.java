package per;

class Test {
	public Test() {
		System.out.println("생성자 Test() 실행 됨!");
	}
}

public class CirclePerimeter { // default/Circle.java 사용
	double rad;
	final double PI;
	
	public CirclePerimeter(double r) {
		rad = r;
		PI = 3.14;
//		Test test = new Test();
	}
	
	public double getPerimerter() {
		return (rad*2) * PI;
	}
}


//public class CirclePerimeter {
//
//	public static void main(String[] args) {
//		
//		Circle c = new Circle(1.5);
//		System.out.println("반비름이 1.5인 원의 둘레 : " + c.getPerimerter());
//		
//	}
//}
