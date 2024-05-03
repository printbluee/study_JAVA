
public class CastingEx02 {

	public static void main(String[] args) {
		
		/*
		 * <--------- 정수 ---------> <---  실수 ---->
		 * byte - short - int - long - float - double
		 * char 는 뺏음
		 * 
		 * 강제 형변환한다고 잘못된 값을 저장하지는 않음
		 */
		
		int num = 100;
		
		// 강제 형변환 : 큰 크기 -> 작은 크기
		short sh = (short)num; 
		System.out.println("short : " + sh);
		byte by = (byte)num; 
		System.out.println("byte : " + by);
		float fo2 = 2.34F;
		System.out.println("float : " + fo2);
		
		// 자동 형변환 : 작은 크기 -> 큰 크기 
		long lo = num; 
		System.out.println("long : " + lo);
		float fo = num;
		System.out.println("float : " + fo);
		
	}

}
