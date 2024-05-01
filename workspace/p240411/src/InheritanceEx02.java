
class Super {
	int num;

	Super() { //  ***
	}
	
	Super(int num) {
		this.num = num;
	}
	
	void show() {
		System.out.println(num);
	} 
}

class Sub extends Super {
	// 아무것도 정의 안 했을 때 
	// : Implicit super constructor Super() is undefined for default constructor. Must define an explicit constructor
	// : 상속 관계가 되면 기본 생성자에 super(); 가 되는데, 묵시적으로 호출되는 부모의 메소드에 기본 생성자가 없어서
	//   부모의 메소드에 기본 생성자를 정의해줘야함 (+ *** 이 부분 추가)
	// : 아래 코드 작성 
}

public class InheritanceEx02 {
	public static void main(String[] args) {

		Super s = new Super(5);
		System.out.println(s);
	}
}
