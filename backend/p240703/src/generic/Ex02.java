package generic;

class Parent<T> {
	private T item;
	
	public Parent() {}
	
	public void checkType(T t) {
		System.out.println("[Parent] Type >> " + t.getClass().getSimpleName());
	}
}

class Child<T> extends Parent<T> {
	
	public void showType(T t) {
//		System.out.println("[Child] Type >> " + t.getClass()); 					// class java.lang.String
//		System.out.println("[Child] Type >> " + t.getClass().getName()); 		// java.lang.String
		System.out.println("[Child] Type >> " + t.getClass().getSimpleName()); 	// String
	}
}

public class Ex02 {

	public static void main(String[] args) {

		Child<String> str = new Child<String>();
		str.showType("ㅎㅇ"); // String
		str.checkType("박보검");
//		 str.checkType(100); error ! The method checkType(String) in the type Parent<String> is not applicable for the arguments (int)
		
		Child<Tv> tv = new Child<Tv>();
//		tv.showType("Tv"); error ! 타입이 Tv 니까 Tv 를 생성해줘야 힘
		tv.showType(new Tv()); 
		str.checkType("박보검");
	}
}
