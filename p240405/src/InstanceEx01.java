// p240404/scr/InstanceEx06 이어서

class Robot {
	int productYear;
	String productName;
	
	public int getProductYear() {
		return productYear;
	}
	
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
}


public class InstanceEx01 {
	
	// static 을 붙여야 main 메소드에서 호출이 가능함
	// (반환형) 위치에 Robot 으로 할 것
	// 리턴형이 참조형인 것
	// 참조형 리턴형, 리턴형(반환형)이 참조형이다.
	public static Robot constructRobot() {
		Robot robot = new Robot();
		robot.setProductName("옵티머스");
		robot.setProductYear(2000);
		return robot; // 여기서 robot 은 주소
	}
	

	public static void main(String[] args) {
		
		// constructRobot 메서드 호출
		// heap 영역에서 만들어진 주소는 어디서든지 호출이 가능
		Robot robot = constructRobot(); // constructRobot() robot 주소가 main()의 robot 으로 주소 복사된 것
		Robot robot2 = constructRobot();
		
		// 주소가 같은지 아닌지 확인해보기
		if (robot == robot2) {
			System.out.println("주소가 같음");
		} else {
			System.out.println("주소가 다름");
		}
		
		System.out.println("로봇의 생산년도 >> " + robot.getProductYear());
		System.out.println("로봇의 제품명 >> " + robot.getProductName());
		
	}
}
