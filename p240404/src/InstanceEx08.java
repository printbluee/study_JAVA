
class Robot {
	
	// instance field
	int year = 2000; 			// 기본값 2000년
	String name = "없음";   	// 기본값 없음
	String company = "없음"; 	// 기본값 없음
	
	// constructor
	Robot () { // 기본값 설정
		this.year = 2000;
		this.name = "없음";
		this.company = "없음";
	}
	Robot (int year) { 
		this.year = year;
	}
	Robot (String str) {
		if (str == "페퍼") {
			this.name = str;
		} else if (str == "메가봇") {
			this.company = str;
		}
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
		
		Robot r4 = new Robot("메가봇");
		r4.showInfo(); // 생산 년도: 2000, 제품명 : 없음, 제조회사 : 메가봇 
		
		Robot r5 = new Robot(2025, "아틀라스", "다이내믹스");
		r5.showInfo(); // 생산 년도: 2000, 제품명 : 없음, 제조회사 : 다이내믹스 
		
	}
}
