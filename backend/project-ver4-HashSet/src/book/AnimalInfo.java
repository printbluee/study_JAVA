package book;

public class AnimalInfo {
	private String name;
	private int age;
	
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String updateName) {
		this.name = updateName;		
	}
	
	public String getName() {
		return name;
	}	

	public void showAnimalInfo() {
		System.out.println("name >> " + this.name);
		System.out.println("age >> " + this.age);
		System.out.println();
	}
}
