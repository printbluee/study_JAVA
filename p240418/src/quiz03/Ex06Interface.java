
/*
 * [문제]
 * Vehicle 의 모든이 take() 를 정의하도록
 * Vehicle type 을 interface 로 변경하시오.
 */

package quiz03;

interface Vehicle {
//	public static final int Number = 0;
	
	public abstract void take();
	
}

class Car implements Vehicle {
	private int number;
	
	public Car (int number) {
		this.number = number;
	}
	
	@Override
	public void take() {
		System.out.println("자동차 등록번호 : " + this.number);
		System.out.println("자동차가 고속도를 달립니다.");
	}
}

class Yacht implements Vehicle {
	private int number;
	
	public Yacht (int number) {
		this.number = number;
	}
	
	@Override
	public void take() {
		System.out.println("요트 등록번호 : " + this.number);
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}
}


public class Ex06Interface {
	
	public static void info(Vehicle vehicle) {
		vehicle.take();
	}
	
	public static void main(String[] args) {
		
		Vehicle[] myVehicle = new Vehicle[2];
		
		myVehicle[0] = new Car(1350);
		myVehicle[1] = new Yacht(679111);
		info(myVehicle[0]);
		info(myVehicle[1]);
		
//		Vehicle[] myVehicle = new Vehicle[] {new Car(1350), new Yacht(679111)};
//		for (Vehicle idx: myVehicle) {
//			idx.take();
//		}
	}
}
