
public class OperatorEx04 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 3;
		
		// 괄호 안해도 되지만 직관성을 위해 
		// boolean result = n1 > 4 || n2 > 4;
		boolean result = (n1 > 4) || (n2 > 4); 
		
		System.out.println("결과값 : " + result);
		
	}

}
