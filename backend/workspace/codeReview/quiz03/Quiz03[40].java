
/*
 * [진혜정]
 * - 출력 문구 없습니다.
 * - ArrayStack 의 기본 생성자에서 스택의 크기를 설정하지 않았습니다.
 * - push 메소드와 pop 메소드가 정의되어 있지 않습니다.
 */

class ArrayStack{
	int[] arr;
	int top = -1;
	
	
	
	public ArrayStack(int i) {
		int top = i;
	}

	int peak() {
		return arr[top];
	}
	
	void push(int num) {
		
	}
	
}
public class Quiz03 {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
	}

}
