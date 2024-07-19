package singleton;

//singleton 이 아니라 부연 설명하기 위해 코드 작성
class Dog {
	
	// field
	int age = 10;
	
	// method 
	public void showAge() {
		System.out.println("나이 >> " + age);
	}
	
	public static void createInstance() {
		Dog dog = new Dog();
		dog.showAge();
	}
}

public class Ex02 {

	// instance field
	int num = 5;
	
	// method
	public static void main(String[] args) {

		Ex02 type = new Ex02();
		System.out.println(type.num);
		
		Dog.createInstance();
		
	}
}
