
// class 정의 ==========================================

// =====================================================

public class InstanceQuiz02 {

	public static void main(String[] args) {
		
		Customer hong = new Customer();
		hong.setId(1);
		hong.setName("홍길동");
		hong.showInfo(); // ID : 1, NAME : 홍길동
		
		
		Customer park = new Customer();
		park.setId(2);
		park.setName("박보검");
		park.showInfo(); // ID : 2, NAME : 홍길동
		 
	}

}