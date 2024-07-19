package book;

public class AnimalInfo {

	private String name;
	private int age;
	
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public String getName() {
		return this.name;
	}
	
	public void showAnimalInfo() {
		System.out.println("name >> " + this.name);
		System.out.println("age >> " + this.age);
	}
}