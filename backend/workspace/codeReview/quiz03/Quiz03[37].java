
/*
 * [진혜정]
 * - 수고하셨습니다.
 */

class ArrayStack{
	int[] arr;
	int top = -1;
	
	int peek() {
		return arr[top];
	}

	ArrayStack(int num){
		arr = new int[num];
	}

	void push(int newNum) {
		
		if (arr.length-1 > top) {
			top++;
			arr[top] = newNum;
			System.out.println("Inserted Item : "+ newNum);
		}else 
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		
	}
	
	int pop() {
		if(top != -1) {
	        int pop = arr[top];
	        arr[top--] = 0;
	        return pop;
		}else {
			System.out.println("스택이 비었습니다!");
			return top;
		}
	}
	
	
}
public class Quiz03[37] {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}

}
