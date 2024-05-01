
class Person {
	
	// [ overriding ] 오버라이딩
	@Override // 어노테이션(애노테이션)
	public String toString() {
		return "[오버라이딩] Person";
	}
}

public class StringEx02 {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p);							// Person@282ba1e / object toStrting
		System.out.println(p.toString()); 				// Person@282ba1e
		System.out.println(p.getClass()); 				// class Person
		System.out.println(p.getClass().getName()); 	// Person
		
		String str = "안녕";
		System.out.println(str);						// 안녕
		System.out.println(str.toString());				// 안녕 / Strting toStrting
		
		String str2 = new String("안녕");
		System.out.println(str2);
		System.out.println(str2.toString());
		
		//  안붙여도 toString()이 붙여짐
	}
}
