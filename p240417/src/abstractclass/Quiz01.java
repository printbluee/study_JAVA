package abstractclass;

abstract class Animal {
	// private String name;
	protected String name; // 상속 관계의 자식만 접근 허용
	
	public Animal() {
		this("미입력");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() { // private 타입의 field 를 접근하기 위해 getter 사용
		return this.name;
	}
	
	// abstract method
	public abstract void play();
}

class Cat extends Animal {
	public Cat (String name) { // 매개변수 1개 생성자를 실행해서 name 값 설정
		super(name); 		   
	}
	
	@Override	
	public void play() {
		// System.out.println(super.getName() + "는 낚싯대 놀이 중 입니다.");
		System.out.println(super.name + "는 낚싯대 놀이 중 입니다.");
	}
}

class Dog extends Animal {
	public Dog (String name) { // 매개변수 1개 생성자를 실행해서 name 값 설정
		super(name);
	}
	
	@Override	
	public void play() {
		// System.out.println(super.getName() + "는 터그 놀이 중 입니다.");
		System.out.println(super.name + "는 터그 놀이 중 입니다.");	}
}

public class Quiz01 {

	public static void animalPlay(Animal animal) {
		animal.play();
	}
	
	public static void main(String[] args) {

		Cat bear = new Cat("베어");
		Dog roy = new Dog("로이");
		
		animalPlay(bear);	// 베어는 낚싯대 놀이 중 입니다.
		animalPlay(roy);	// 로이는 터그 놀이 중 입니다.
	}
}
