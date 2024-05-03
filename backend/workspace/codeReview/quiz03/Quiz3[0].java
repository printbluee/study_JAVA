
/*
 * [진혜정]
 * - 중간에 if 문 들여쓰기 부분 신경써야될 것같습니다.
 * - push 메소드에서 조건문에서 실행이 끝나고 arr dml 배열 길이가 Count 보다 
 *   작거나 같을 때 "스택이 꽉 찼습니다! 용량 초과!" 과 함께 return 으로 top 을 했어야 했을 것 같습니다.
 *   그래서 peak 메소드에서 에러가 발생하지 않음
 *   top 이라는 멤버변수가 있는데 Count 를 추가로 작성한건지 모르겠습니다.
 */

class ArrayStack {
	int[] arr;
	int top = -1;
	int Count = 0;

	ArrayStack(int length) {
		this.arr = new int[length];
	}

	int peek() {
		return arr[top];
	}

	void push(int push) {
		if(arr.length > Count) {
		arr[Count] = push;
		System.out.println("Inserted Item : " + push);
		Count++;
		}else if (arr.length <= Count) {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}

	int pop() {
		if (Count >= 0) {
			Count--;
			return arr[Count];
		} else {
			System.out.println("스택이 비었습니다!");
			Count--;
			return Count;
		}

	}

}

public class Quiz3 {

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
