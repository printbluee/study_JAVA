package area;

public class CircleArea { 
	double rad;
	final double PI;
	
	public CircleArea (double r) {
		rad = r;
		PI = 3.14;
	}
	
	public double getArea() {
		return (rad*rad) * PI;
	}
}


//public class CircleArea {
//
//	public static void main(String[] args) {
//		
//		Circle c = new Circle(1.5);
//		System.out.println("반비름이 1.5인 원의 넓이 : " + c.getArea());
//	}
//	
//}
