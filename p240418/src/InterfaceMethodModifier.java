import interfacetype.Method;

class SubMethod implements Method {

	@Override
	public void one() {
		System.out.println("one() 실행");
	}

	@Override
	public void two() {
		System.out.println("two() 실행");
	}
}


public class InterfaceMethodModifier {

	public static void main(String[] args) {

		SubMethod sm = new SubMethod();
		sm.one();
		sm.two();
		
		sm.defaultMethod(); // 접근이 디폴트인데 
		Method.staticMethod();
	}
}
