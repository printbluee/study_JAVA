
public class ParameterEx02 {

	public static void sum(int[] args) {
		System.out.println("args : " + args);
		
		for(int ar: args) {
			System.out.print(ar + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		sum();			// error : 인수 없음
//		sum(1, 2);		// error : type 불일치
//		sum({1, 2});	// error : new int[] 생략 불가능
		
		sum(new int[] {3, 5});
		sum(new int[0]); // 길이가 0인 배열
//		sum(null);    	 // 참조값 없음
	}
}
