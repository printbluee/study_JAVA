
class Item {
	
	// 멤버 변수 : 인스턴스 필드
	int year;
	String name;
	final String company;
	
	// constructor
	public Item() {
		this.company = "다이소";
	}
	
	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}
	
	// setter 
	void setName(String name) {
		this.name = name;
	}
	
	// [ 과제 ] error ! The final field Item.company cannot be assigned
	// 이유 : 객체가 생성이 되는 과정에서 초기화가 된다
//	void setCompany(String company) {
//		this.company = company;
//	}
	
	// 멤버 메서드
	void showInfo() {
		System.out.printf("생산년도 : %d, 제품명 : %s, 제조회사 : %s\n", year, name, company);
	}
	
}

public class FinalEx02 {

	public static void main(String [] atgs) {

		// 선언과 동시에 초기값 설정
		Item item = new Item(2022, "곰돌이", "다이소");
		item.showInfo();
		
		// error ! : 값 변경 금지, The final field Item.company cannot be assigned
		// item.company = "이마트";
		item.name = "곰순이"; // 외부 접근에서 값 변경 선호 x
		
		// [ 과제 ] 왜 final field 에 값 설정이 안 되나요 ? 
		// 이유 : final 필드는 초기값이 저장되면 최정값이 되어서 프로그램 실행 도중에 수정할 수 없다.
//		Item item2 = new Item();
//		item2.setCompany("롯데마트");
		
	}
}