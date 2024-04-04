
class Fruit {
	
	/*
	 * setter method : 멤버 변수의 값을 설정하는 메소드
	 * - 메소드명 규칙 - set멤버변수명;
	 * 
	 * void 메서드명() { 
	 * 
	 * }
	 */
	
	int count;
	String sort;
	
//	 void setCount (int num) { // heap 영역에 만들어지는게 아니라 stack 영역에 만들어졌다가 사용되면 사라짐
//	        count = num; 
//	    }
	
	// stack 영역보다 heap 영역에 있는 멤버 변수에 값이 저장됨(지역 변수는 메소드 기준 가까이 있는 거 갖다 씀)
	void setCount (int count) { // 보통 매개 변수는 멤버 변수명으로 맞춰줌
		// count = count; // 지역변수와 멤버변수가 같다 보니 접근을 하지 못해서 가려짐 --> 그래서 참조 변수를 만듦 (this 연산자)
		// count(멤버) = count(매개); 가 되어야함 
		this.count = count;
		// 여기엔 System.out.print(); 가 일반적으로 안들어옴
		System.out.println("this 에 저장된 주소 >> " + this); // 확인을 위해 작성한 것
		
	}
	
	/* 
	 * getter method : 멤버 변수의 값을 리턴하는 메소드
	 * - 메서드명 규칙 - get멤버변수명;
	 * 
	 * 반환형 메서드명(); { 
	 * 		return 값;
	 * }
	 */
	
	int getCount() {
		return count;
	}
}


public class InstanceEx02 {

	public static void main(String[] args) {

		// 객체 생성
		Fruit fruit = new Fruit();
		System.out.println("참조 변수 fruit >> " + fruit);
		
		// 멤버 메소드 호출
//		System.out.println("멤버 변수 count >> " + fruit.count()); // 앞으로 이렇게는 x, 감출 것
		System.out.println("전) 멤버 변수 count >> " + fruit.getCount());
		
		fruit.setCount(10);
		System.out.println("참조 변수 fruit >> " + fruit);
		System.out.println("후) 멤버 변수 count >> " + fruit.getCount());

	}
}
