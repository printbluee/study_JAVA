package generic;

class TestTwo {
	private Object element;
	
	public void setElement(Object element) { // 다형성 구현
		this.element = element;
	}
	
	public Object getElement() {
		return element;
	}
}

public class Ex02 {

	public static void main(String[] args) {

		TestTwo t = new TestTwo();
		t.setElement("ㅎㅇ");
		System.out.println(t.getElement());
		//String t_value = t.getElement();	error ! String t_value / Object t.getElement(), 다운 캐스팅 해줘야함
		String t_value = (String)t.getElement();
		System.out.println("t_value >> " + t_value);
		
		TestTwo t2 = new TestTwo();
		t2.setElement(5);
		System.out.println(t2.getElement());
		
		Integer t2_value = (Integer)t2.getElement();
		System.out.println("t2_value >> " + t2_value);
	}
}
