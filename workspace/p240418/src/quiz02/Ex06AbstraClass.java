
/*
 * [문제]
 * Vehicle 의 모든이 take() 를 정의하도록
 * Vehicle type 을 abstrat class 로 변경하시오.
 * 추상화
 */

package quiz02;

abstract class Vehicle {
	private int number;
	
	public Vehicle(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	// abstract method
	public abstract void take();
}

class Car extends Vehicle {
	
	public Car(int number) {
		super(number);
	}
	
	@Override
	public void take() {
		System.out.println("자동차 등록번호 : " + super.getNumber());
		System.out.println("자동차가 고속도를 달립니다.");
	}
}

class Yacht extends Vehicle {
	
	public Yacht (int number) {
		super(number);
	}
	
	@Override
	public void take() {
		System.out.println("요트 등록번호 : " + super.getNumber());
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}
}


public class Ex06AbstraClass {
	
	public static void info(Vehicle vehicle) {
		
		// [문제] 메소드 호출
		vehicle.take();
	}
	
	public static void main(String[] args) {
		
		Vehicle[] myVehicle = new Vehicle[2];
		
		myVehicle[0] = new Car(1350);
		myVehicle[1] = new Yacht(679111);
		
		info(myVehicle[0]);
		info(myVehicle[1]);
	}
}
