
class Cat {
	
	// [ field ] : 필드, 멤버 변수
	// 인스턴스(객체) 변수
	int age;
	String name;
	
	
	// setter / getter 
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
} 

public class InstanceEx05 {

	public static void main(String[] args) {

		// 인스턴스 생성
		Cat thor = new Cat();
		Cat happy = new Cat();
		
		// 인스턴스에 이름 저장
		thor.setName("토르");
		happy.setName("해피");
		
		// 인스턴스에 저장된 이름 출력
		System.out.println("고양이 이름 : " + thor.getName());
		System.out.println("고양이 이름 : " + happy.getName());
		
	}

}
