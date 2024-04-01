
public class NestedLoopQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * [ 문제 ]
		 * 중첩 for 문을 사용하여, 아래와 같이 출력
		 * 
		 * 100
		 * 010
		 * 001
		 * 
		 * 중첩 for 문을 활용하는데 안쪽 for 문에서 출력해야됨 (총 9회 출력)
		 */
		
		/*
		 * 0 + 0 => 1
		 * 0 + 1 => 0
		 * 0 + 2 => 0 
		 * 
		 * 1 + 0 => 0
		 * 1 + 1 => 1
		 * 1 + 2 => 2
		 * 
		 * 2 + 0 => 0
		 * 2 + 1 => 0
		 * 2 + 2 => 2
		 */
		
		for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
            	if (i == j) {
            		System.out.print("1");
            	} else {
            		System.out.print("0");
            	}
            }
            
            System.out.println();
            
        }
	}
}
