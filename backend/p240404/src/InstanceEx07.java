
/*
 * [생성자] constructor
 * 
 * << 생성자를 사용하는 이유 >> 
 * 1) 객체를 생성하면서, 멤버 변수(인스턴스 필드)를 초기화 하고자 할 때
 * 2) 객체를 생성하면서, 원하는 기능을 실행하기 위해서 (특정 멤버 메서드를 호출)
 * 
 * - 객체 생성시, 무조건 하나의 생성자 호출(실행)
 * - 생성자는 '메소드'이다 -> '메소드 오버로딩 ' 가능 -> 생성자 여러개 정의 가능
 * 	cf) 메소드 오버로딩
 * 		* 메소드명이 같고, 매개변수의 정보가 다름
 * 					       --------------- (개수, 자료형)
 *   	* 단, 반환형과는 관련 없다
 * - 생성자는 반환값이 없다 -> 반환형을 명시하지 않음(void 자체도 안씀)
 * - 생성자명은 클래스명과 같아야 함
 * 
 * << default constructor >> 기본 생성자
 * - 생성자를 명시하지 않으면, 기본 생성자가 실행
 * - 매개 변수가 없고, 하는 일도 없음 --> 형식상 실행
 * - 컴파일러가 만듦
 * - 생성자가 하나라도 명시되어 있다면, 기본 생성자는 실행되지 않음
 */

class Car {
	// instance field ==============================================
	int door;
	String color;
	
	// default constructor (컴파일러가 만든 것)
	//	Car() {} // 클래스명과 동일
	
	// constructor (메서드오버로딩 된 것)===========================
	// 객체 생성시, 무조건 하나의 생성자 호출(실행)
	// 그래서 매개변수에 받는 거에 따라 만든 것
	Car() {
		System.out.println("[매개변수가 없는 생성자 실행]");
	}
	
	Car(String color) {
		this.color = color;
		System.out.println("[매개변수가 1개인 생성자 실행] String");
	}
	
	Car(int door) {
		this.door = door;
		System.out.println("[매개변수가 1개인 생성자 실행] int");
	}
	
	Car(int door, String color) {
		this.door = door;
		this.color = color;
		System.out.println("[매개변수가 2개인 생성자 실행]");
	}
	
	// instance method =============================================
	void setDoor (int door) {
		this.door = door;
	}
	
	void showInfo() {
		System.out.printf("door : %d, color : %s\n\n", door, color);
	}
}


public class InstanceEx07 {

	public static void main(String[] args) {
		
		// 소괄호를 생략하면 안되는 이유 : 매개 변수가 없을 때 기본 생성자를 호출하기 때문
		Car c1 = new Car(5); // 객체가 생성되는 과정 중에 원하는 값을 넣을 것 
		c1.showInfo();
		
		Car c2 = new Car(); // [매개변수가 없는 생성자 실행]
		c2.showInfo();
		
		Car c3 = new Car("black");
		c3.showInfo(); // door : 0, color : black
		
		Car c4 = new Car(2, "blue");
		c4.showInfo();
		
//		 c1.setDoor(4);
//		 c1.showInfo();
		
	}
}
