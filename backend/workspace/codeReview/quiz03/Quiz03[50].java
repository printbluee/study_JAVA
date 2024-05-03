
/*
 * [진혜정]
 * - 문제에 없는 멤버변수 추가로 생성하셨습니다.
 * - pop 메소드에서 return 부분에서 에러 발생합니다.
 */

class ArrayStack {
	int[] arr;
	int top = -1;
	int size;
	int peek() {
		return arr[top-1];
	}

	ArrayStack(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	void push(int Item) {
		top++;
		if(top<5) {
			arr[top]= Item;
			System.out.println("Insterd Item : " + arr[top]);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}

	}
	int pop() {
		top--;
		if(top>=0) {
		} else {
			System.out.println("스택이 비었습니다!");		
		}
		return arr[top];	
	}
	

}	
public class Quiz03 {
	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력!" + stack.peek());
		
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());
		System.out.println("pop실행 : " + stack.pop());

	}

}
