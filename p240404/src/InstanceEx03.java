
// Dog class 정의
class Dog {
	int age;
	
	void showInfo() {
		System.out.println("this >> " + this);
	}
	
}

public class InstanceEx03 {

	public static void main(String[] args) {

		// Dog class 로 생성된 jaho 객체(인스턴스)
		Dog jaho = new Dog();
		System.out.println("참조 변수 jaho 에 저장된 주소 >> " + jaho);
		jaho.showInfo();
		
		// Dog class 로 생성된 jason 객체(인스턴스)
		Dog jason = new Dog(); 
		System.out.println("참조 변수 jason 에 저장된 주소 >> " + jason);
		jason.showInfo();
	}

}
