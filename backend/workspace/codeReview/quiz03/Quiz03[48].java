
//stack 메모리 구조를 Java로 간단히 구현하시오.
//
//3.1. ArrayStack 클래스에 생성자를 정의하시오. [10점]
//- 스택의 크기는 생성자로 설정한다.
//- 즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr에 저장하시오.
//
//3.2. ArrayStack 클래스에 push 메소드를 정의하시오. [15점]
//- push 메소드는 스택에 값을 저장한다.
//- 즉, push 메소드를 통해 멤버 변수 arr에 정수값이 저장된다.
//- 저장되는 값이 배열의 길이를 초과하면 ‘스택이 꽉 찼습니다! 용량 초과!’를 출력하시오.
//
//3.3. ArrayStack 클래스에 pop 메소드를 정의하시오. [15점]
//- pop 메소드는 스택에 값을 꺼내온다.
//- 즉, push 메소드를 통해 멤버 변수 arr의 정수값이 리턴된다.
//- 배열에 저장된 값을 모두 꺼내오면, ‘스택이 비었습니다!’를 출력하시오.


/*
 * [진혜정]
 * - 리뷰할 코드가 없습니다.
 */

class Arraystack{
	int[] arr;
	int top = -1;
	
	int peek() {
		return arr[top];
	}
}


public class Quiz03 {

	public static void main(String[] args) {
		
		
		
	}

}
