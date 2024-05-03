
/*
 * [진혜정]
 * - ArrayStack 의 생성자를 정의 했지만, 배열 생성이 되지 않았습니다.
 * - push 메소드와 pop 메소드 정의하지 않았습니다.
 */



class ArrayStack{
	int[] arr;
	int top = -1;
	
	
	ArrayStack(int[] arr){
		this.arr = arr;

	}
	
	
	int peek() {
		return arr[top];
	}
	
	
	int push() {

		System.out.println("스택에 값을 저장 : " + this.arr);

		return this.arr;
	}
	
	
	int pop() {

		return;
		
	}
	
	
}


public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push();
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		int[] arr = {20,15,10,55,8};
			
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek() );
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		

		
	}

}
