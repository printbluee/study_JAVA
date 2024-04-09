
// class 정의 ==========================================
	
// =====================================================


public class InstanceQuiz01 {

	public static void main(String[] args) {
		
		// dog 객체 생성
		Animal dog = new Animal();
		dog.setName("환타");
		System.out.println("강아지 이름 : " + dog.getName());

		
		// cat 객체 생성
		Animal cat = new Animal();
		cat.setName("나비");
		System.out.println("고양이 이름 : " + cat.getName());
		
	}
}
