
class Robot {
	
	// instance field
	int year; 			// 기본값 2000년
	String name;   	// 기본값 없음
	String company; 	// 기본값 없음
	
	// constructor
	// 생성자 안에 다른 생성자 호출 가능, 호출될 땐 생성자의 이름을 쓰는게 아니라 this 사용
	Robot () { // 하나라도 생성자 호출하면 기본값을 설정해줘야함
//		this.year = 2000; 		// 기본값 2000년
//		this.name = "없음";   	// 기본값 없음
//		this.company = "없음"; 	// 기본값 없음
		this(2000, "없음", "없음");
	}
	
	Robot (int year) { 
		this(year, "없음", "없음");
	}
	
	Robot (String name) {
		this(2000, name, "없음");
//		this.year = 2000;
//		this.name = name;
//		this.company = "없음";
 	}
	
	Robot (String name, String company) {
//		this.year = 2000;
//		this.name = name;
//		this.company = company;
		this(2000, name, company); // 호출할 땐 첫번째 자리에 둬야함*** + 1개'만' 가능
 	}
	
	Robot (int year, String name, String company) { // 매개변수 3개인 경우
		this.year = year;
		this.name = name;
		this.company = company;
	}
	
	// instance method
	void showInfo() {
		System.out.printf("생산 년도 : %d / 제품명 : %s / 제조회사 : %s\n\n", year, name, company);
	} // 지역변수가 없어서 멤버 변수로 찾아감, this 를 넣어도 안넣어도 됨, 시각적으로 보여주기 위해 넣는 경우가 있음
}


public class InstanceEx08 {

	public static void main(String[] args) {

		Robot r1 = new Robot();
		r1.showInfo();
		
		Robot r2 = new Robot(2017);
		r2.showInfo(); // 생산 년도: 2017, 제품명 : 없음, 제조회사 : 없음 
		
		Robot r3 = new Robot("페퍼");
		r3.showInfo(); // 생산 년도: 2000, 제품명 : 페퍼, 제조회사 : 없음 
		
		Robot r4 = new Robot("페퍼", "메가봇");
		r4.showInfo(); // 생산 년도: 2000, 제품명 : 없음, 제조회사 : 메가봇 
		
		Robot r5 = new Robot(2025, "아틀라스", "다이내믹스");
		r5.showInfo(); // 생산 년도: 2000, 제품명 : 없음, 제조회사 : 다이내믹스 
	}
}
