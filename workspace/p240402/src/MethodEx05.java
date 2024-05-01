
public class MethodEx05 {

	public static void main(String[] args) {
		div(5, 2);
		div(7, 0);
	}
	
	
	// void  사용 : return 이 없어서
	// (int n1, int n2) : 매개변수
	public static void div(int n1, int n2) { // 몫 구하기
		
		// 분모가 0 이면, "분모가 0 으로 계산 불능입니다." 출력하시오.
		
		// [ return 사용 x ] ====================================
//		if (n2 == 0) { // n2가 0인 경우
//		    System.out.println("분모가 0으로 계산 불능입니다.");
//		} else { // // n2가 0이 아닌 경우
//		    int result = n1 / n2;
//		    System.out.println("몫 : " + result);
//		}
		
		// [ return 사용 o ] ====================================
		if (n2 == 0) { // n2가 0인 경우 바로 return 하여 작업 중단
            System.out.println("분모가 0으로 계산 불능입니다.");
            return;
        } 
		
    	int result = n1 / n2;
    	System.out.println("몫 : " + result);
        
	}
}

