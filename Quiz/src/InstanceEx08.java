
class Robot {
	
	// instance field
	int year; 			
	String name;   	
	String company; 	
	
	// constructor

	
	// method : instance method
	void showInfo() {
		System.out.printf("생산 년도 : %d / 제품명 : %s / 제조회사 : %s\n\n", year, name, company);
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
