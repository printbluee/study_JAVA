
/*
 * [문제] 메소드 호출
 */

package quiz01;

class Vehicle {
	private int number;
	
	public Vehicle(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}

class Car extends Vehicle {
	public Car(int number) {
		super(number);
	}
	
	public void drive() {
		System.out.println("자동차 등록번호 : " + super.getNumber());
		System.out.println("자동차가 고속도로를 달립니다.");
	}
}

class Yacht extends Vehicle {
	public Yacht (int number) {
		super(number);
	}
	
	public void sail() {
		System.out.println("요트 등록번호 : " + super.getNumber());
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}
}


public class Ex06 {
	
	public static void info(Vehicle vehicle) {
		// [문제] 메소드 호출
		if (vehicle instanceof Car) {
			((Car) vehicle).drive();
		} else if (vehicle instanceof Yacht) {
			((Yacht)vehicle).sail();
		}
	}
	
	public static void main(String[] args) {
		
		Vehicle[] myVehicle = new Vehicle[2];
		
		myVehicle[0] = new Car(1350);
		info(myVehicle[0]);
		
		myVehicle[1] = new Yacht(679111);
		info(myVehicle[1]);
	}
}
