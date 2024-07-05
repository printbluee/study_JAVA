package generic;

interface Space<T> {
	void youKnow(T item);
	
}

class Star<T> implements Space<T> {
	@Override
	public void youKnow(T item) {
		System.out.println(item + "은 항성이지 !");
		System.out.println("매개변수 타입 : " + item.getClass().getSimpleName() );
	}
}

class Sun {
	@Override
	public String toString() {
		return "태양";
	}	
}

public class Ex03 {

	public static void main(String[] args) {
		Star<Sun> star = new Star<Sun>();
		star.youKnow(new Sun());
		
	}
}
