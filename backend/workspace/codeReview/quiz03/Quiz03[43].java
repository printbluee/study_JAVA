
//		[메서드 정의]
//		Stack 메모리 구조를 Java로 간단히 구현하시오.
		
//		[3-1] ArrayStack 클래스에 생성자를 정의하기
//      스택의 크기는 생성자로 설정
//      즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr에 저장

/*
 * [진혜정]
 * - ArrayStack 의 기본 생성자에서 1차원 배열 생성하지 않았습니다.
 * - ArrayStack 클래스 괄호 안에 들여쓰기가 맞추면 좋을 것 같습니다.
 * - ArrayStack stack = new ArrayStack(5); 선언 이후 for문 사용한 이유를 모르겠습니다.
 */

class ArrayStack {
			// field : instance field
			int arr;
			String size;
			int top = -1;
			
			// constructor

ArrayStack(int arr, String size) {
		    this.arr = arr;
		   
}
			
			int peek() {
				return arr size[];
				
			}


		
public class Quiz03 {

	public static void main(String[] args) {

		
//		[3-2] ArrayStack 클래스에 push 메소드를 정의하시오.
//      push 메소드는 스택에 값을 저장한다.
//      즉, push 메소드를 통해 멤버 변수 arr에 정수값이 저장된다.
//      저장되는 값이 배열의 길이를 초과하면 '스택이 꽉 찼습니다! 용량 초과!'를 출력하기
		
		
		ArrayStack stack = new ArrayStack(5);
		
		for(int i = 0; i < stack.size; i++)
			System.out.println(size[i]);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("스택이 꽉 찼습니다! 용량초과!");
		
//		[3-3] ArrayStack 클래스에 pop 메소드를 정의하시오.
//      pop 메소드는 스택에 값을 저장한다.
//      즉, push 메소드를 통해 멤버 변수 arr에 정수값이 리턴된다.
//      배열에 저장된 값을 모두 꺼내오면, '스택이 비었습니다!'를 출력하기
		
		ArrayStack stack = new ArrayStack();
		
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop(8));
		System.out.println("pop 실행 : " + stack.pop(55));
		System.out.println("pop 실행 : " + stack.pop(10));
		System.out.println("pop 실행 : " + stack.pop(15));
		System.out.println("pop 실행 : " + stack.pop(20));
		System.out.println("pop 실행 : " + stack.pop(-1));
	
		System.out.println("스택이 비었습니다!");
	
	}

}
