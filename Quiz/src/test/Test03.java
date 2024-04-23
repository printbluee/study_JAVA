package test;

/*
 * [문제]
 * stack 메모리 구조를 java 로 간단히 구현하시오.
 * 
 * 3-1. ArrayStack 클래스에 생성자를 정의하시오. [10점]
 * - 스택의 크기는 생성자로 설정
 * - 즉, 생성자를 통해 1차원 배열 생성하여 멤버 변수 arr 에 저장하시오.
 * 
 * 3-2. ArrayStack 클래스에 push 메소드를 정의하시오 [15점]
 * - push 메소드는 스택에 값을 저장한다.
 * - 즉, push 메소드를 통해 멤버변수 arr 에 정수값을 저장된다.
 * - 저장되는 값이 배열의 길이를 초과하면 '스택이 꽉 찼습니다! 용량 초과 !' 를 출력하시오. 
 * 
 * 3-3. ArrayStack 클래스에 pop 메소드를 정의하시오. [15점]
 * - pop 메소드는 스택에 값을 꺼내온다.
 * - 즉, push 메소드를 통해 멤버변수 arr 의 정수값이 리턴된다.
 * - 배열에 저장된 값을 모두 꺼내오면, '스택이 비었습니다.' 를 출력하시오.
 */

class ArrayStack {
	int[] arr;
	int top = -1;
	
	ArrayStack(int length) {
		this.arr = new int[length];
	}
	
	int peek() {
		return arr[top];
	}
	
	void push(int num) {
		
		if (top < arr.length-1) {
			arr[++top] = num;
			System.out.println("Inserted Item : " + arr[top]);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과 !");
		}
	}
	
	int pop() {
		if (top >= 0) {
			return arr[top--];
		} 
		
		System.out.println("스택이 비었습니다.");
		return top;
	}
	
}

public class Test03 {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(50);
		stack.push(8);
		stack.push(2);
		
		System.out.println("\ntop 에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
	}
}
