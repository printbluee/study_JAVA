
public class OperatorEx06 {

	public static void main(String[] args) {
		
		// [ 후증가 연산자 ]
		// result 변수에 num 값 5가 대입이 되고, 그 다음 num이 ++ 돼서 6이 됨
//		int num = 5;
//		int result = num++;
//		System.out.println("result : " + result);
//		System.out.println("num : " + num);
		
		
		// [ 선증가 연산자 ] 
		/*
		 * result 변수가 만들어지고 ++가 먼저 와 num 값 5가 6이 돼서 저장되며
        result 값이 6이 되고, num 값이 6이 됨
		 */
		int num = 5;
		int result = ++num; 
		System.out.println("result : " + result);
		System.out.println("num : " + num);

	}

}
